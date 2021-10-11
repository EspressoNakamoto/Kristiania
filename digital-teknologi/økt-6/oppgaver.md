### OS

1.  Forklar med egne ord hva et operativsystem er og hvorfor man trenger/ikke trenger et OS.  
    Et operativsystem gir ut grensesnitt mellom bruker og hardware. Operativsystemer som Microsoft Windows, MacOS og Linux har GUI grensesnitt som gir brukere en enklere måte å hamhandle på. Man trenger ikke et OS når man skal ha maskinene til å kjøre en spesifik oppgave eller på en mikroprosessor.

2.  Hva betyr abstraksjon i OS sammenheng?  
    Det er fordi OS som MacOS og Microsoft Windows gir et veldig enkelt brukergrensesnitt for brukeren men "under the hood" skjer det mye mer enn man tror. Når man f.eks. åpner ett program så skjer mye mer som man ikke legger merke til som kommunikasjon mellom komponenter, filoverføringer osv. Det vil si også bare en vanlig fil inneholder metadata som brukeren vanlighvis ikke trenger å tenke på.

3.  Hva er forskjellen på Monolithic kernel og Micro kernel?  
    I en Monolithic kernel er koden skrevet sånn at alt er koblet sammen til ett objekt. Det er effektivt fordi det bruker ikke tid til å hente informasjon fra forskjellige "services" som fil server, network server osv. fordi det er koblet sammen. Mens det gjør det mer effektivt så er det mer kompleks som gjør det mer utsatt for kræsj. Hvis det skjer noe feil i en del av kernel så vil hele kræsje.  
    I Micro kernel er alt delt opp f.eks. i file manager server, display server osv. Det vil si at microkernel må kommunisere med de forskjellige serverne og applikasjonen. Meldingsutvekslingen er ineffektivt fordi det tar tid å kommunisere med de forskjellige delene. Ulempen med Micro kernel også er at det er minimal funksjonalitet. Men fordelen er at det er modulært og utvidbart.

4.  Hva er de viktigste funksjonene i operativsystemer?  
    Operativsystemet er den som kobler til hardware og bestemmer hvordan de skal brukes. Så operativsystemet har ansvaret på håndering av ressurser, maskinvare, nettverk og sikkerhet. I tillegs så må operativsystemet klare å kjøre applikasjonene og gi brukeren et brukergrensesnitt.  
    Hovedfunksjonene til operativsystemet er behandlig av det interne, prosesser, minne, disk, utstyr, nettverk og service programmer.
    

5.  Forklar kort hva en ressurs er i sammenheng med et OS.  
    Ressurs er de tingene et program trenger for å kjøre ferdig. F.eks CPU, RAM, I/O.

---

### Kjernen

1.  Forklar hva som skjer i en oppstart av en maskin med operativsystem.  
    1. Hent bootstrap
    2. Hent Boot-loader
    3. Hent OS
    4. Initialiser maskinvare
    5. Lag brukergrensesnitt
    6. Start faste programmer

2.  Hva er en kjerne/kernel og hva har den for oppgaver?  
    En kernel har som oppgave å starte opp og konfigurere hardware og administrere prosesser, tråder og ressurser.

3.  Hva er risikoene ved å kjøre på kjernemodus?  
    Hvis man kjører ett program på kjernemodus så har man full tilgang til å gjøre hva som helst på datamaskinen. Som vil si at programmet har tilgang til hele minnet, alle instruksjoner kan kjøres og det er ingen sikring fra hardware. Hvis programmet er kodet feil så kan det kræsje systemet eller hvis programmet er ett virus så har den tilgang til å gjøre hva den vil. Så for sikkerhet, ting som vi ikke vil ha tilgang til alt kjører vi i brukermodus.

4.  Når skal man kjøre på bruker- vs kjernemodus i et OS?  
    Man skal kjøre i kjernemodus når man vil ha tilgang til hele minnet og alle instruksjoner. F.eks. OS må ha tilgang til hele minnet når den skal gi et program en del av minnet.

5.  Hva er en prosess og en tråd, og hva er forskjellen mellom de?  
    En prosess er et program som kjører med tilhørende ressurser. En tråd er selve kjøringen av instruksjoner. Ett program kan bruke flere tråder.

6.  Hvilket/hvilke program på din datamaskin bruker mest av maskinen sin CPU akkurat nå?  
    Jeg bruker linux så jeg bruker `top` commandoen. Det er chrome som bruker mest CPU på datamaskinen min nå.

7.  Hvorfor bruker operativsystemet Multitasking og hvordan fungerer kommunikasjonen her mellom OS og CPU? Hvordan hadde datamaskinen vært hvis det ikke fantes Multitasking?  
    Operativsystemet bruker Multitasking for å kunne kjøre flere prosesser "samtidig". CPUen kan bare behandle en instruksjon fra en prosess om gangen. Så OS må bestemme hvilken prosess som kan kjøre på CPUen på enhver tid. Uten Multitasking så kunne maskinen bare kjørt et program om gangen 

8.  Hvilke tre ulike states finnes i "Context switching"?  
    CPU-bytten mellom prosesser heter context switching. Det fungerer med at en prosess går gjennom:

    1. Running: Kjører nå
    2. Blocked: Venter på å bli aktivisert
    3. Ready: Aktivisert og venter i kø

    Og sånn går det i syklus.

9.  Hva skjer hvis RAM-minnet ikke er stort nok?  
    Hvis ram minnet ikke er stort nok, vil operativsystemet bruke diskplass for å ha dataene som skulle ha vært i RAM ("Swapping"). Det er derfor når man går full for RAM så begynner ting å gå tregt. Når det legges over til disken.

10. Hvordan vet Operativsystem hvilken tråd som skal kjøres når?  
    Operativsystemet bruken en kjøreplan(schedule) for å bestemme hvilken tråd som skal kjøres. Siden context switching tar tid, finnes det to overordnede kjøreplan-prinsipper:

    - Ikke-preemtiv(frivillig)
        - Tråden som er kjører setter seg selv til ready (yield-instruksjon)
        - Høflighets-metoden
    - Preemtiv.
        - Klokkestyrt avbrudd sørger med gjevne mellomrom for at tråden som kjører settes til ready.
        - Power-metoden

11. Hvilken ulike deler har prosessen (tråden) i sitt minne?  
    En prosess ligger i minne og har en sammenhengende minneomeråde.  
    De ulike delene fra lav adresse til høy adresse:

    - TEXT(code) segment (kompilerte koden)
        - Lest fra program fil f.eks. av exec
        - Vanlighvis read-only
        - Kan deles av flere tråder
    - DATA segment (Hardkoden til applikasjonen)
        - Initialiserte globale variabler (0 / NULL)
        - Uninitialiserte globale variabler
        - heap
            - dynamisk minne f.eks. allokert med `malloc`
            - vokser nedover
    - STACK segment [ligger i motsatt ende] (Når programmet starter en funksjon, vil det legge en stack med minne)
        - Variabler i en funksjon
        - Lagrede registertilstander (kallende funksjons EIP)
        - Vokser nedover
    - System data segment(PCB)
        - Segment pekere
        - pid
        - program og stack pekere
    - Flere stacker for trådene (Legges under stack)

12. Sant/Usant: Heapen i prosessen sitt minne er dynamisk.  
    Sant, fordi når applikasjonen trenger mer minne f.eks. til å lese en fil, så vil det allokeres fra heapen.

13. Nevn noen forskjeller mellom HEAP og STACK i en prosess sitt minne.  
    HEAP blir brukt av programmet til å lagre globale variabler. STACK er brukt til å lagre midlertidige variabler fra en funksjon. HEAP er en heirarkisk data struktur mens STACK er en linær data struktur.

14. Hvorfor trenger hardware drivere og hva har det med OS å gjøre? Nevn også noen eksempel på drivere.  
    Drivere er programvaren som kan oversette communikasjonen mellom OS og kontrolleren. Eksempler på drivere er:
    - GPU driver
    - Tastatur driver
    - Driver til printer

---

### Skallet

1.  "Signaler", "Flag" og "Redirects" bruker man i skjellet, forklar kort hva disse er.  
    "Signaler" er hurtigtaster man kan gi til OS når man er i CLI f.eks: 
    
    - Ctrl-C (Abort prosess)
    - Ctrl-D (Slutt på fil)
    - Ctrl-Z (Sett prosess til å sove)
    
    "Flag" er å modifisere hvordan en kommando oppfører seg, gitt etter en flaggmarkør(/, -, --) f.eks:
    
    - dir/?
    - ls -la
    - ps aux
    
    Redirects er omdirigere hvor informasjonen skal legges f.eks: 
    
    - ">" Skriv output i en fil
    - ">>" Skriv output inn på slutten av en fil
    - "<" Ta innhold i en fil og bruk det som argument til kommandoen
    - "|" Tar output fra kommando og lever den som input til neste kommando

2.  OSX/LINUX - Utfør disse oppgavene i Terminal.
    1. Naviger til Dokumenter-mappen på maskinen din
        - `cd Documents`
    2. List alle filene som finnes i dokument-mappen
        - `ls`
    3. Lag et directory(mappe)
        - `mkdir test`
    4. Gå inn i mappen
        - `cd test`
    5. Skriv inn dette for å lage en ny fil: echo TK1104 er det beste faget > kommandofil.txt
    6. Skriv ut innholdet i filen
        - `cat kommandofil.txt`
    7. Kopier kommandofil.txt
        - `cp kommandofil.txt kommandofil_kopi.txt`
    8. List innholdet i mappen på nytt, nå er det to filer i mappen
        - `ls`
    9. Bytt navn på én av filene
        - `mv kommandofil_kopi.txt kopifil.txt`
    10. Flytt en av filene til Dokumenter-mappen
        - `mv kopifil.txt ..`
    11. Til slutt prøv deg frem med man kommando i terminalen
        - `man mv`