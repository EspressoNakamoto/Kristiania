### Begreper & terminologi

Forklar følgende terminologi og databasebegreper:

- INNER JOIN (indre likekobling) - velger data fra begge tabeller som har like verdier
- LEFT JOIN (venstre likekobling) - velger data fra vestre tabell og de med like verdier fra høyre tabell
- RIGHT JOIN (høyre likekobling) - velger data fra høyre tabell og de med like verdier fra venstre tabell
- Kartesisk produkt - er en operasjon hvor output er kombinasjonen av hver rad i begge tabellene

### SELECT queries

Benytt MySQL eksempeldatabasen ("schema") som heter world. (Samme som tidligere.)  
Skriv SQL spørringer som utfører følgende:

1. Hent ut alle byer som begynner og slutter på 'o' (stor bokstav først, liten bakerst) og deres befolkningstall. Sorter de alfabetisk. (Tips: Husker du wildcards fra tidligere?)

```sql
SELECT Name, Population
FROM city
WHERE Name LIKE 'O%o'
ORDER BY Name ASC;
```

2. Oppgave1 ga mange spenstige bynavn, men hvor i all verden befinner disse byene seg!? Vi ønsker å få med navnet på landet som byene ligger i. Landet skal listes ut som en ny, første kolonne. Kolonnene blir altså: landenavn, bynavn, bybefolkning). Vi ønsker svaret sortert alfabetisk på land, deretter på by.  
   Problem: Da må vi spørre mot 2 tabeller på en gang! Gjør om spørringen fra oppg. 1 til en join spørring, der vi også tar med countrytabellen, og henter ut navnet på landet fra denne.  
   Tips: Du må finne ut hva som er felles kolonne (foreign key til primary key kopling) for disse to tabellene.

```sql
SELECT country.Name AS Country, city.Name AS City, city.Population AS CityPopulation
FROM city
JOIN country ON city.CountryCode = country.Code
WHERE city.Name LIKE 'O%o'
ORDER BY country.Name ASC, city.Name ASC;
```

3. Hent ut alle land og deres (eventuelle) hovedsteder. Sorter resultatet på kontinent, og deretter alfabetisk på landets navn.

```sql
SELECT country.Name, city.Name
FROM country
LEFT JOIN city ON country.Capital = city.ID
ORDER BY Continent, country.Name ASC;
```

4. Hent ut en oversikt over alle land som har minst én by, hvor mange byer de har og gjennomsnittlig innbyggertall i disse byene.

```sql
SELECT country.Name, COUNT(city.Name) AS Cities, AVG(city.Population) AS AVG_Population
FROM country JOIN city ON country.Code = city.CountryCode
GROUP BY country.Name;
```

5. Vi ønsker å få opp alle land i verden, og alle deres byer, der innbyggertallet i landet er under 1000 mennesker. Vi vil se navnet på landet, befolkningen i landet, hvilket kontinent landet tilhører, navnet på evt. byer der, befolkning i evt. byer der. Vi ønsker resultatet sortert alfabetisk etter landenes navn. (Hint: Mitt svar gir 10 rader ut - er det samme antall rader som du får?)

```sql
SELECT country.Continent, country.Name, country.Population, city.Name, city.Population
FROM country LEFT JOIN city ON country.Code = city.CountryCode
WHERE country.Population < 1000
ORDER BY country.Name ASC;
```

6. Ranger byene i verden som ligger i et land med en eller annen form for monarkisk styresett etter folketall. Den mest folkerike byen først. Post svaret i Mattermost(men ikke spørringen). Hvis noen allerede har lagt inn et svar på oppgaven, si i fra om du er enig eller har et annet forslag.

```sql
SELECT country.Name AS Country, city.Name AS City, city.Population, country.GovernmentForm
FROM country JOIN city ON country.Code = city.CountryCode
WHERE country.GovernmentForm LIKE '%Monarchy%'
ORDER BY city.Population DESC;
```

7. Hent ut en liste med byer i verden som har minst 8.000.000 innbyggere, og hvilket kontinent de tilhører. Sorter etter innbyggertall, største først. Altså: byens navn, byens innbyggere og hvilket kontinent de tilhører.

```sql
SELECT city.Name, city.Population, country.Continent
FROM country JOIN city ON country.Code = city.CountryCode
WHERE city.Population >= 8000000
ORDER BY city.Population DESC;
```

8. Lag en spørring som henter ut en oversikt over de landene i Asia der det snakkes minst 10 forskjellige språk. Spørringen skal hente ut: Navn på land, antall språk og dette skal sorteres synkende på antall språk.

```sql
SELECT co.Name AS CountryName, COUNT(cl.Language) AS Languages
FROM country as co JOIN countrylanguage AS cl ON co.Code = cl.CountryCode
WHERE co.Continent = 'Asia'
GROUP BY co.Name
HAVING Languages >= 10
ORDER BY Languages DESC;
```
