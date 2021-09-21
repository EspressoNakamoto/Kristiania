### Begreper og terminologi

Forklar kort/enkeltfølgende terminologi og databasebegreper: (se gjerne læreboka for hjelp)

- Fremmednøkkel - er en kolonne(eller en samling av kolonner) i en tabell som refererer til en primærnøkkel
- Primærnøkkel - unikt identifiserer hver rad i en tabell
- Nullmerke("NULL") - betyr ingen data
- Løpenummer("AUTO_INCREMENT") - tillater en unik nummer(som oftest i primærnøkkelen) til å bli generert automatisk når en ny rad blir lagt til

---

### SQL

`For de første 11 oppgavene, opprett en tom MySQL eksempeldatabase("create schema"). Kall den test e.l. Settdennesom "default schema".`

Skriv SQL mot testdatabasen (schema) som utfører følgende:

1. Opprett tabellen person. Tabellen skal inneholde:

- ID,int, autogenerert.
- Personnummer, char(11), skal ikke kunne være nullog skal være unik.
- Navn, varchar(100), skal ha defaultverdi 'Ukjent'.
- EPost, varchar(100), skal være unik.
- Som primærnøkkelskal kolonnen IDangis.

```sql
CREATE TABLE person (
	ID int auto_increment,
    Personnummer char(11) NOT NULL UNIQUE,
    Navn varchar(100) DEFAULT("Ukjent"),
    EPost varchar(100) UNIQUE,
    PRIMARY KEY (ID)
);
```

2. Legg inn en rad i tabellen person. Spesifiser følgende data:

- Personnummer: '12345678901'
- Navn: 'Ola Nordmann'
- EPost: 'ola@nordmann.no'

```sql
INSERT INTO person (Personnummer, Navn, EPost)
VALUES ('12345678901', 'Ola Nordmann', 'ola@nordmann.no');
```

3. Du finner ut at det er kjekt å registrere fødselsdato også. Modifiser den eksisterende persontabellen, så den også inneholder kolonnen:Foedselsdato, date.

```sql
ALTER TABLE person
ADD Fødselsdato date;
```

4. Legg inn en ny rad i tabellen person. Spesifiser følgende data:

- personnummer: '98765432109'

```sql
INSERT INTO person (Personnummer)
VALUES ('98765432109');
```

5. Oppdater raden med personnummeret '98765432109', slik at Foedselsdato til denne blir:'1990-01-01'. Merk:Datofelt formateres internt i MySQL med år, så måned, så dag.

```sql
UPDATE person
SET Fødselsdato = '1999-01-01'
WHERE Personnummer = 98765432109;
```

6. Legg inndeg selv i person tabellen! Fyll inn alle felter (trenger ikke bruke ekte info da).

```SQL
INSERT INTO person (Personnummer, Navn, EPost, Fødselsdato)
VALUES ('10293847560', 'Peter Tveit', 'petertveit@live.com', '1997-10-26');
```

7. Vi innser at databaseløsningen vår er litt snevertdesignet: Hver person kan bare ha 1 epost adresse. Opprett en egen tabell epost med følgende kriterier:

- Adresse,varchar(75),skal ikke kunne være nullog skal være unik.
- Type, varchar(50).
- Person_ID, int, skal ikke kunne være null.
- Som primærnøkkelskal kolonnen Adresse angis.
- Som fremmednøkkel Person_ID som refererer tabellen person sin kolonne ID.

```sql
CREATE TABLE epost(
	Adresse varchar(75) NOT NULL UNIQUE,
    Type varchar(50),
    PersonID int NOT NULL,
    PRIMARY KEY (Adresse),
    FOREIGN KEY (PersonID) REFERENCES person (ID)
)
```

8. Hint: Kap. 3.3.1 i pensumboka.  
   Skriv en SQL som kopierer epostadresser og IDer fra person tabellen over til Adresse og Person_ID i epost tabellen.

```sql
INSERT INTO epost (Adresse, PersonID)
SELECT EPost, ID
FROM person
WHERE EPost IS NOT NULL;
```

9. Nå som vi har flyttet epost ut i en egen tabell, så kan vi slette epostkolonnen fra person-tabellen. Vi ønsker å fjerne hele kolonnen, ikke bare dataene som ligger der.

```sql
ALTER TABLE person
DROP COLUMN EPost;
```

10. Lag en tabell tilsvarende den i punkt 1 som heter personCopy. (Du trenger ikke kopiere data inn i den.) Sjekk at denne er opprettet, før du sletter den igjen. (Poenget er å få testet kommandoen for å slette tabell, uten å ødelegge de to fine tabellene du har jobbet med en stund nå.)

Opprette tabell:

```sql
CREATE TABLE personCopy (
	data int -- Fordi vi ikke kan ha tom tabell
)
```

Slette tabell:

```sql
DROP TABLE personCopy;
```

11. VANSKELIG: Hvis vi henter ut navn og fødselsdato fra person tabellen, kommer dato på MySQL sitt for oss "baklengsformat". Omformater output så dato har formatet: 31-01-2001. (<--Eksempel på dato med rett format.)

    Tips: Les om(w3schools eller google) MySQL funksjonen: DATE_FORMAT()

    Legg også inn dato for Ola Nordmann. Han skal ha fødselsdatoen 20.02.1912 (gammel mann!). Skriv den inn på dette formatet, men bruk STR_TO_DATE() så MySQL skjønner hvilket format datoen kommer på.

Hente navn og endre format på dato:

```sql
SELECT Navn, DATE_FORMAT(Fødselsdato, '%d-%m-%Y') AS Fødselsdato
FROM person;
```

Legg inn dato:

```sql
UPDATE person
SET Fødselsdato = STR_TO_DATE('20 02 1912', '%d %m %Y')
WHERE Navn = 'Ola Nordmann';
```

---

Skriv SQL mot world databasen (schema) som utfører følgende:

12. Benytt max()-funksjonen til å hente ut den største ID-en i world.city. SELECT \* fra information_schema.tables for world-databasen (WHERE table_schema = 'world'). Kan du finne hvor mange rader du har i de ulike tabellene dine? Hva heter kolonnen som angir dette? Kan du finne kolonnen som gir oss neste verdi for `city.ID`?

Hente største ID fra city tabellen

```sql
SELECT MAX(ID) AS Størst_ID
FROM city;
```

Vi kan finne antall rader vi har i de ulike tabellene ved å se på TABLE_ROW kolonnen. Vi finner også neste verdi for `city.ID` i AUTO_INCREMENT kolonnen.

13. Slett raden som inneholder byen 'Bærum'fra citytabellen.(Dette er ingen by, og skal ikke ligge i city tabellen!)

```sql
DELETE FROM city
WHERE Name = 'Bærum';
```

14. Skriv en passende spørring for å se at data er slettet som forventet. Undersøk om lærebok har rett når den skriver(s.79): «MySQLhar fra versjon 8 støtte for CHECK-regler. Eldre versjoner godtok at man skrev CHECK, men sjekketikke regelen.» Hvordan kan du undersøke om utsagnet er riktig(for din versjon)? Del svaret ditt (og hvordan du kom fram til det) i Mattermost!

```sql
SELECT *
FROM city
WHERE Name = "Bærum";
```

Siden ingenting kommer opp så får vi vite at bærum raden har blitt slettet.
