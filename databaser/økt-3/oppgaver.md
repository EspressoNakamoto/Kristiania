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

```sql

```
