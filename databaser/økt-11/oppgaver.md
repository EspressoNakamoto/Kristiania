# Oppgave 1 - begreper & terminologi

-   **Triggere**

    Triggere kan bli brukt når noe kjører, f.eks. insert, update og/eller delete statements.

    Triggere kan for eksempel bli brukt for å:

    -   Logge hendelser

    -   Automatisk legge til en timestamp

    -   Rydde opp på relevante steder (f.eks ved en `delete`)

    -   Si ifra når noe spesielt skjer: noe er tomt, noe er over en viss grense, osv.

-   **Indexer**

    Index bruker man for å øke ytelsen på spørringer.

    Når man lager en index, lagres en ekstra blokk data som optimaliserer WHERE clause delen av en spørring mot en (eller flere) kolonner.

-   **Transaksjoner (inklusive start transaction, commit og rollback)**

    Transaksjon er handlinger utført av en bruker eller program som leser og endrer innholdet i en database.

    Vi forteller databasen at en transaksjon starter ved å bruke `START TRANSACTION`. Om alle operasjoner i transaksjonen lykkes, avslutter vi det med `COMMIT` for å lagre endringene. Eller

-   **ACID-egenskapene**

-   **Personvern og GDPR**
