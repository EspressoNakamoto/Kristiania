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

    Vi forteller databasen at en transaksjon starter ved å bruke `START TRANSACTION`. Om alle operasjoner i transaksjonen lykkes, avslutter vi det med `COMMIT` for å lagre endringene. Eller hvis noen av transaksjonene feiler underveis, kan vi avslutte det med `ROLLBACK` for å tilbakestille endringene.

-   **ACID-egenskapene**

    ACID-egenskapene står for de egenskapene alle transaksjoner bør oppfylle.

    ACID står for:

    -   Atomicity
        -   Hel transaksjon må gjennomføres, eller så tilbakestilles alt.

    -   Consistency
        -   En transaksjon må flytte databasen fra én fullverdig tilstand til en annen.

    -   Isolation
        -   Det som skjer internt i en transaksjon skal være usynlig for andre transaksjoner inntill transaksjonen er fullført.
    
    -   Durability
        -   Resultatet av en fullført transaksjon skal lagres i databasen, uavhengig av hva som skjer i kommende transaksjoner.

-   **Personvern og GDPR**

    **Personvern** er at bruker skal i større grad ha kontroll med opplysninger og seg selv. DVS. at bruker har krav på å få vite hvilke opplysninger virksomheten har om deg, hvor den har de fra og formålet med disse innen 30 dager fra en hendvendelse.

    Personopplysningsforskriften utfyller personopplysningsloven og utdyper nermere temaer som:

    -   Konfidensialitet: Beskyttelse mot at uvedkommende får innsyn.

    -   Integritet: Beskyttelse mot uautorisert endring.

    -   Tilgjengelighet: Tilstrekkelig og relevant info.

    **GDPR** står for General Data Protection Regulation og er en lov som gjelder for all som har med EU land å gjøre, og Norge gjennom EØS.

    Målet med GDPR er å øke brukernes kontroll og rettigheter over sine personlige data og forenkle regelverket for internasjonale virksomheter.

# Oppgave 2 - roller og rettigheter

