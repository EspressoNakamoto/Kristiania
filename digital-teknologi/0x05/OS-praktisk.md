## Oppgave 1-1: Se hva som er i en mappe

**List ut alle filene som er i mappen, klarer du å se hvor filstørrelsen til en fil er? Hva skal du skrive ut for å bare se noen av filene i mappen, feks kun EXE filer eller kun TXT filer? (På Windows heter som oftest kjørbare filer .exe, på Linux er det vanlig at kjørbare filer ikke har noen extension – men vil ha execute rettigheten satt.)**

UNIX:

-   List ut filer: `ls`
-   Se filstørrelse: `stat (fil/mappe)`
-   Se kun EXE filer \*exe

## Oppgave 1-2: Gå til bruker området ditt

-   **Bytt til katalogen hvor du har dine bruker filer. På Windows kan du gå inn i undermappen som heter Desktop eller Skrivebord.**  
    `cd pete`
-   **List ut alle filene som er i mappen.**  
    `ls`
-   **På Windows: Finner du igjen de samme filen i kommando linje outputet som du så på det grafiske skrivebordet?**  
    Bruker linux.
-   **Bruk '>' tegnet for å sende output fra listingen inn i en txt fil.**  
    `ls > text.txt`
-   **Åpne opp txt filen i notepad. Hvordan gjør du det fra kommando linje verktøyet?**  
    For å vise det i Linux kan vi bruke `cat text.txt`(viser innholdet i terminalen) eller `gedit text.txt` (gedit er en applikasjon lingnende notepad i linux).

## Oppgave 1-3: Endre på filer

-   **Kopier en valgfri fil, kall den nye filen "testfil.xyz", hvor xyz er samme filtype som den du kopier.**  
    `test.xyz testfil.xyz`

-   **Endre FIL ATTRIBUTT på filen til å være "read only" (i kommando linje verktøyet). Hvordan påvirker det tilgang til filen fra UI verktøyet?**  
    `chmod u=r testfil.xyz` Det gjorde at hvis man åpner filen fra UI verktøyet, så vil man ikke kunne skrive noe inn i filen, vi vil bare kunne lese fra filen.

-   **Endre FIL ATTRIBUTT på filen til "hidden". List ut alle filer i mappen, hva skjedde med filen du endret attributt på? Hvilke parametere må du gi til list kommandoen for å få se filen fortsatt?**  
    `mv testfil.xyz .testfil.xyz` Ved å legge en punktum på starten av filen vil det bli til en dotfile som vil gjøre at filen blir gjemt. For å se filen så må vi skrive `ls -a` hvor `-a` bestemmer at den skal liste alle filer(gjemt eller ikke).

## Oppgave 1-4: Endre disk

-   **Gå til en annen disk (feks E: hvis du har det). List ut filene der.**  
    Har ikke en annen disk men å liste ut alle filene er `ls`.

-   **Opprett en ny katalog (enten på den andre disken, eller på din vanlige disk.).**  
    `mkdir test`

-   **Kopier en fil inn i den katalogen.**  
    `cp test.txt test` Kopierer test.txt filen i test directory.

## OSX/Linux 1-5: Lær om nye verktøy

-   **Les om sysinternals sine verktøy, finner dere noen tilsvarende verktøy som kan brukes på andre plattformer? Finner dere de samme featurene i selve OSet?**  
    I MacOS og linux er det allerede mye av verktøyene innebygd i operativsystemet.
