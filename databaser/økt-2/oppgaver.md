### Begreper og terminologi

- Forklar følgende terminologi og databasebegreper.

  - DBMS – Database Management System
  - SQL – Structured Query Language
  - Relasjon – En tabell I en RDBMS
  - Tuple – Uordnet sett av kjente verdier med navn
  - Attributt – Tilleggsinformasjon til en kode
  - Kardinalitet – Hvor unik data verdier er i en rad av en database
  - Grad – Antall kolonner
  - Domene – Navn på nettsted

---

### SELECT queries

Benytt MySQL eksempeldatabasen ("schema") som heter world. (Samme som forrige uke.)Skriv SQL spørringer som utfører følgende:

1. Lager en rangert liste over land etter antall mennesker per kvadratkilometer.(Tips: Se etter tabell som inneholder befolkning og km2for å komme igang. Bruk matematiske operatorer i spørringen.)

```sql
SELECT Name, Population / SurfaceArea AS PopulationDensity
FROM country
ORDER BY PopulationDensity DESC;
```

2. Summerer hva totalt folketall per verdensdel(altså for alle verdensdeler) er, sortert på folketall (synkende rekkefølge).

```sql
SELECT Continent, SUM(Population) AS ContinentPopulation
FROM country
GROUP BY Continent
ORDER BY ContinentPopulation DESC;
```

3. Dobbeltsjekk svaret fra oppgaven over ved å manuelt summere alle folketallene fra svaret, og så sammenlikne de med en ny spørring som henter ut summen av verdens befolkning.

```sql
SELECT SUM(Population)
FROM country;
```

4. List ut landkode, navn og uavhengighetsår, sortert på år og deretter navn, for alle land som har oppgitt et uavhengighetsår. (Tips: Noe med NULL.)

```sql
SELECT Code, Name, IndepYear
FROM country
WHERE IndepYear IS NOT NULL
ORDER BY IndepYear, Name;
```

5. Hent ut alle land som har 'W'som mellomste bokstav i landkoden sin.

```sql
SELECT Code
FROM country
WHERE Code LIKE '_W_';
```

6. Hent ut alle data forlandene som begynner på 'N', 'O'eller 'P'.Sorter de alfabetisk på navn.

```sql
SELECT Name
FROM country
WHERE Name LIKE 'N%'
	OR Name LIKE 'O%'
	OR Name LIKE 'P%'
ORDER BY Name;
```

7. Hent ut alle språkdata for landene som har et offisielt språk som snakkes av 99% eller mer av befolkningeni landet. Sorter etter synkende prosentverdi, deretter alfabetisk på språk.

```sql
SELECT *
FROM countrylanguage
WHERE IsOfficial = 'T'
	AND Percentage > 99
ORDER BY Percentage DESC, Language ASC;
```

8. Hent ut landkode, navn og kontinent for alle land i Amerika (både Nord-Amerika og Sør-Amerika). Sorter alfabetisk på landkode.

```sql
SELECT Code, Name, Continent
FROM country
WHERE Continent IN ('North America', 'South America')
ORDER BY Code;
```

9. Hent ut antall landper kontinent for alle kontinentene.

```sql
SELECT Continent, COUNT(*) AS NumberOfCountries
FROM country
GROUP BY Continent;
```

10. Hent ut kontinentog antall land i dette kontinentet, for de kontinentene som har 30 eller fler land.Sorter på antall land i synkende rekkefølge.

```sql
SELECT Continent, COUNT(*) AS NumberOfCountries
FROM country
GROUP BY Continent
HAVING NumberOfCountries >= 30
ORDER BY NumberOfCountries DESC;
```

---

### Nøkler

Jeg kan ikke finne noen fremmednøkler i tabellene city, country og countrylanguage i databasen world. Hvilke kolonner kunne vi benyttet som fremmednøkler for å knytte tabellene sammen?

- I country kan vi bruke
