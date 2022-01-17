### Begreper & terminologi

Forklar **kort/enkelt** følgende terminologi og databasebegreper.

- View - Er en tabell som er en spørring til en eller flere tabeller.
- Delspørring (subquery) - Er en spørring i en spørring.

---

### Views

1.  Lag følgende rapport(spørring) basert på databasetabellene:  
    Eksamenskarakterutskrift (studentnr, studentnavn, karakter) for et bestemt fag på en bestemt dato (for eksempel fag nr 1 og dato: 20.05.2008)

    ```sql
    SELECT student.snr, student.navn, eksamen.karakter
    FROM student JOIN eksamen ON student.snr = eksamen.snr
    WHERE eksamen.fnr = 1 AND eksamen.dato = STR_TO_DATE('20-05-2008', '%d-%m-%Y');
    ```

    Vi har 3 brukergrupper:

    1. Studentrådet
    2. Rektor
    3. Studieadministrasjonen

    Det skal lages views for disse brukergruppene.  
    NB! Husk å teste viewene med: SELECT \* FROM viewnavn;

2.  Studentrådet skal ha tilgang til et view som gir tilgang til studentenes navn og adresser.

    ```sql
    CREATE VIEW studentråd_studentdata (navn, adresse)
    AS
    SELECT navn, adresse
    FROM student;
    ```

3.  Rektor skal ha tilgang til view: Beste karakter innen hvert fag.

    ```sql
    CREATE VIEW rektor_bestekarakter (fagnummer, bestekarakter)
    AS
    SELECT fnr, MAX(karakter)
    FROM eksamen
    GROUP BY fnr;
    ```

4.  Studieadministrasjonen skal ha tilgang til følgende views:

    - studieadm_eksamenoversikt_view (bestekarakter, fagnr, snr) <-- Beste eksamensresultat for hver student for hvert fag.
    - studieadm_studentstudiepoeng_view (snr, navn,sumstudiepoeng)

    sumstudiepoeng= summen av studiepoengene i eksamensfag for hver student

    studieadm_eksamenoversikt_view:

    ```sql
    CREATE VIEW studieadm_eksamenoversikt_view (bestekarakter, fagnr, snr)
    AS
    SELECT MAX(karakter), fnr, snr
    FROM eksamen
    GROUP BY fnr, snr;
    ```

    studieadm_studentstudiepoeng_view:

    ```sql
    CREATE VIEW studieadm_studentstudiepoeng_view (snr, navn,sumstudiepoeng)
    AS
    SELECT student.snr, student.navn, SUM(fag.studiepoeng)
    FROM fag
    JOIN eksamen ON fag.fnr = eksamen.fnr
    JOIN student ON eksamen.snr = student.snr
    GROUP BY student.snr;
    ```

Lag følgende rapport (spørring) baser på databasetabellene og de opprettede viewene:

5.  Karakterutskrift (fnr, fnavn, beste karakter i faget, studiepoeng) for student med snr = 1

    ```sql
    SELECT fag.fnr, fag.fnavn, bestekarakter, studiepoeng
    FROM fag JOIN studieadm_eksamenoversikt_view AS EO ON fag.fnr = EO.fagnr
    WHERE EO.snr = 1;
    ```

---

### Oppdateringer:

6. Studentrådet har fått i oppgrag å gå igjennom informasjonen om studentene og rette opp i eventuelle feil. De finner en feil. Studenten Ola skal ha adresse Trondheimsveien 12. Lag en SQL de kan benytte for å foreta endringen. (De har bare tilgang til viewet sitt...). Sjekk at endring ble utført i den underliggende tabellen.

   ```sql
   UPDATE studentråd_studentdata
   SET adresse = 'TVEIEN 12'
   WHERE navn = 'OLA';
   ```

7. Rektoren ønsker å endre beste-karakter i faget med fnr=1 til 1.0. Han kan litt SQL, så han forsøker seg på følgende spørring mot viewet sitt:

   ```sql
   UPDATE rektor_bestekarakter_view
   SET bastekarakter = 1.0
   WHERE fnr = 1;
   ```

   Det fungerer dårlig! Forklar hvorfor.

   - Fordi han prøver å endre den beste karakter ved å bestemme det fra fagnummer. Men beste karakter blir kalkulert fra karakterer i eksamen tabellen. Så for å endre beste karakter må han endre karakter fra eksamene.

---

### Vanskelig

1.  Bruk en CASE utvalgsspørring til å hente ut: Landets navn og styresett, der styresett klassifiseres som: «Monarki», «Republikk» eller «Annet». Sorter resultatet på landets navn.

    ```sql
    SELECT Name,
    CASE
	    WHEN GovernmentForm LIKE '%Monarchy%' THEN 'Monarchy'
        WHEN GovernmentForm LIKE '%Republic%' THEN 'Republic'
        ELSE 'Other'
    END AS GovernmentForm
    FROM Country
    ORDER BY Name;
    ```

2.  Husker du JOIN-oppgaven med alle land i verden og deres byer? Benytt COALESCE til å presisere at landet ikke har noen byer. Altså: Alle land i verden og deres byer (hvis de har byer). Hvis landet ikke har noen by skal det i resultatet fremkomme «Har ingen byer!».

    ```sql
    SELECT Country.Name AS Country, COALESCE(City.Name, 'Har ingen byer!') AS City
    FROM Country LEFT JOIN City ON Country.Code = City.CountryCode;
    ```

3.  Vi ønsker å se alle land i verden som ikke har noen byer. Sorter de alfabetisk på navn. (Tips: benytte en subquery?)

    ```sql
    SELECT Name
    FROM Country
    WHERE Code NOT IN (SELECT CountryCode FROM City)
    ORDER BY Name;
    ```

4.  Vi ønsker å se prosentandelen som innbyggerne i et land utgjør av jordas totale befolkning. Konkret vil vi ha landets navn, prosentandelen (med kolonnealias "WorldPopPercentage") og kvadratkilometer for dette landet. Sorter svaret på synkende prosentandel. Problem: For å finne prosentandelen må vi også regne ut hva totalbefolkningen er som en del av spørringen (en subquery). Tips: subqueries kan plasseres andre steder enn i where clausen. Hvor trenger vi en subquery i dette tilfellet? ;-)

    ```sql
    SELECT Name, (100 * (Population / (SELECT SUM(Population)
	FROM Country))) AS WorldPopPercentage, SurfaceArea
    FROM Country
    ORDER BY WorldPopPercentage DESC;
    ```