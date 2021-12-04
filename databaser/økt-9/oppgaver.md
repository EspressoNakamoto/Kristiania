# Oppgave 1, modellering – lage ER diagram ut ifra SQL script

Sjekk scriptet DB1102_09_schema.sql (du finner det i Canvas, og du kan også se siste oppgaveside for gjengivelse av innholdet) som bygger opp en liten database bestående av 2 tabeller.

Studer scriptet, og tegn logisk databasemodell som samsvarer med scriptet.

![ER-modell](ER-diagram.png)

---

# Oppgave 2 – SQL

## a)

Kjør de to scriptene DB1102_09_schema.sql og DB1102_09_data.sql i MySQL Workbench ("File"->"Open SQL Script ...", finn filene på disk'en din. Deretter kjør statements som åpnes som vanlig.) Eller benytt copy/paste fra scriptet på siste side.

Databasen inneholder informasjon om flyruter og reservasjon (bestilling) av plass på flyruten. Forklaring av tabellattributtene:

-   rutenr identifiserer en flyrute.
-   avgtid og anktid er hhv. avgangstid og beregnet ankomsttid for en flyrute.
-   frakode og tilkode er flyplasskoden for flyplassen flyruten går fra og ankommer til.
-   Om en flyplass er det også lagret navnet (fraplass, tilplass) på flyplassen og byen (fraby, tilby) der flyplassen befinner seg.
-   resnr identifiserer en reservasjon.
-   I tillegg lagres dato for flyvningen reservasjonen gjelder, samt hvilket rutenr det skal flys med.
-   Om en reservasjon lagres også navnet (navn) på personen som reserverte billetten(e), samt hvor mange billetter (antall) bestillingen gjelder.
-   kapasitet er det totale antall seter på flyruten denne dagen. Det brukes ofte forskjellige fly på en flyrute, slik at kapasiteten kan variere avhengig av dato.

## b)

Følgende data skal registreres i databasen:
Det skal opprettes nye ruter mellom Paris (CDG, Charles de Gaulle) og Stockholm (ARL, Arlanda).

-   En rute skal gå fra Stockholm klokken 1400 og være i Paris klokken 1530.

```sql
INSERT INTO rute
VALUES (3, 1400, "ARL", "Arlanda", "Stockholm", 1530, "CDG", "Charles de Gaulle", "Paris");
```

-   En annen rute går fra Paris klokken 0800 og er i Stockholm klokken 0930.

```sql
INSERT INTO rute
VALUES (4, 0800, "CDG", "Charles de Gaulle", "Paris", 0930, "ARL", "Arlanda", "Stockholm");
```

Følgende reservasjoner skal registreres på de nye rutene:

-   Stockholm--‐Paris 30.10.2011, kapasitet 145 passasjerer:
    -   Olsen, 1 billett
    -   Olavsen, 2 billetter
    -   Grinesen, 1 billett

```sql
INSERT INTO reservasjon
VALUES
(10, 3, 20111030, 1, 145, "Olsen"),
(11, 3, 20111030, 2, 145, "Olavsen"),
(12, 3, 20111030, 1, 145, "Grinesen");
```

-   Paris--‐Stockholm 31.10.2011, kapasitet 130 passasjerer:
    -   Skumlerud, 1 billett
    -   Fanterisen, 1 billett
    -   Toskesen, 43 billetter

```sql
INSERT INTO reservasjon
VALUES
(13, 4, 20111031, 1, 130, "Skumlerud"),
(14, 4, 20111031, 1, 130, "Fanterisen"),
(15, 4, 20111031, 43, 130, "Toskesen");
```

## c)

Du oppdager at Fornebu (FBU) er nedlagt for mange år siden. Du blir derfor nødt til å endre alle henvisninger til Fornebu. Nye verdier skal være Gardermoen (OSL).

```sql
UPDATE rute
SET frakode = "OSL", fraplass = "Gardermoen"
WHERE frakode = "FBU";
```

```sql
UPDATE rute
SET tilkode = "OSL", tilplass = "Gardermoen"
WHERE tilkode = "FBU";
```

---

# Oppgave 3 – Normalisering og modellering

## a) Forklar hvilke ulemper denne tabellstrukturen har.

Tabellstrukturen har flere dobbellagringer og kan bli forbedret ved å splitte opp tabellene og få det funksjonelt avhengig.

## b) Bestem alle determinanter i tabellene. Normaliser deretter tabellene til 3NF (tredje normalform).

Determinanter i RUTE-tabellen:

-   rutenr --> avgtid, anktid, frakode, tilkode
-   frakode --> fraplass, fraby
-   tilkode --> tilplass, tilby

Merk: fraplass og tilplass, fraby og tilby, henviser egentlig til samme opplysninger. Ved å endre navn får vi at både frakode og tilkode er determinant for flyplass (nytt felles navn for fraplass/tilplass) og by (nytt felles navn for fraby/tilby).

Determinanter i RESERVASJON-tabellen:

-   rutenr, dato --> kapasitet
-   resnr --> navn , antall, rutenr, dato

Normalisering til 3NF - vi får følgende tabeller:

-   RUTE (rutenr, avgtid, anktid, frakode, tilkode)
-   STED (kode, flyplass, by)
-   RESERVASJON (resnr, rutenr, dato, navn, antall)
-   FLYVNING (rutenr, dato, kapasitet)

## c) Tegn logisk databasemodell for den nye, normaliserte database-strukturen.

![databasemodell](ny-databasemodell.png)
