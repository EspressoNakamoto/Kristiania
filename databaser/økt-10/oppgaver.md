# Oppgave 1 - begreper og terminologi

### Forklar **kort/enkelt** følgende terminologi og databasebegreper:

-   **Determinant og funksjonell avhengighet (gjerne med eksempel)**

    Når for hver verdi av A attributten kan identifiseres med kun én verdi av B-attributten, og hvis det er flere duplikater av A og vi får samme verdi av B, er B funksjonelt avhengig av A.

    Determinanten er motsatt, når B er funksjonelt avhengig av A, er A determinant for B.

-   **Første normalform (1NF)**

    Første normalform er en tabell hvor cellene inneholder bare en verdi.

    Hvis en tabell har flere verdier i en celle må man utføre 1NF for å få bare en verdi i en celle.

    F.eks duplikere en rad for å få verdiene i cellen til hver sin rad.

-   **Andre normalform (2NF)**

    Andre normalform er en tabell som må være på 1NF og at hele primærnøkkelen er determinant for en eller flere andre kolonner.

-   **Tredje normalform (3NF)**

    Tredje normalform er en tabell som må være på 2NF og ingen ikke-primærnøkkel-attributt har en transitiv avhengighet til en primærnøkkel.

-   **Boyce-Codd normalform (BCNF)**

    Boyce-Codd normalform er en tabell som må være på 3NF og det kan ikke eksistere determinanter som kan ha samme innhold på flere rader i tabellen.

    Altså at alle determinanter er også kandidatnøkler.

-   **Denormalisering**

    Denormalisering er å endre tabellene i en database slik at normaliseringsgraden reduseres.
