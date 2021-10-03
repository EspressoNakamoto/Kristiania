### Hovedkkortet

1.  Tegn et enkelt hovedkort med de viktigste komponentene/elementene.  
    Se [Bilde](hovedkort.png)

2.  Hva er forskjellen mellom integrert og ikke-integrerte hovedkort?  
    Integrerte hovedkort har alt ferdig innebygd i hovetkortet som RAM, GPU, busskontrollere osv.
    Ikke-integrerte hovedkort er hovedkort som ikke har ferdig innebygde ting. Som vil si at det trenger å bli satt inn GPU, RAM osv for at det skal fungere som en pc.

3.  Sant/usant: Det er Southbridge som støtter og kontrollerer kommunikasjon mellom CPU og primærminne (RAM).  
    Usant, det er Northbridge som kontrollerer kommunikasjon mellom CPU og RAM.

4.  Hvilket chipset kontrollerer hvilke data, instruksjoner og kontroll-signaler som flyter mellom prosessor (CPU) og system-minne (RAM)?  
    Det er Northbridge som kontrollerer data, instruksjoner og kontroll-signaler mellom CPU og RAM.

---

### CPU og busser

1.  Hva er en CPU socket?  
    CPU socket er det som man kobler en CPU til. Det finnes flere typer CPU socket, så CPU og hovedkortet må ha samme type CPU socket for at det skal passe.

2.  Hvorfor trenger en CPU nedkjøling, og hvilke ulike måter finnes det for å kjøle ned en CPU?  
    En CPU blir varm når den bruker mye strøm og energien fra strømmen utgir varme. Og for at CPUen ikke skal overopphete og for at den skal fungere optimalt så trenger den kjøling. Det finnes ulike måter å kjøle ned en CPU f.eks. luftkjøling og vannkjøling er de mest vanlige måter å kjøle ned en CPU.

3.  Hva er de typiske problemene med en CPU?  
    De mest typiske problemene med en CPU er overoppheting eller ikke riktig strøm. Det som kan skje da er at PCen ikke booter eller at den krasjer når man kjører applikasjoner.

4.  Hva er et chipset?  
    Et chipset er også kjent som "Data Flow Management System". Chipset er en kontroller som styrer all flyt av data mellom prosessor, minne og eksterne enheter. Idag er det 2 chipset på hovedkortet som fungerer som hovedkontrollere, north bridge og south bridge.

5.  Hvilken del har vanligvis størst betydning for PC-ens insamlede ytelse?

    - South bridge
    - North bridge
    - L3 Cache
    - Super I/O kontrolleren
    - Ingen av alternativene over

    North bridge har størst betydning ettersom alle viktige enheter er koblet til North bridge.

6.  Hvorfor finnes det «busser» i en pc?  
    Busser er det de forskjellige komponentene koblet sammen med. Det er gjennom busser hvor strøm, data, adresse og kontroll-signaler transporteres gjennom.

7.  Forklar kort forskjellen mellom synkrone og asynkrone komponenter.  
    Synkrone komponenter holder samme takten til de andre komponentene. Asynkrone komponenter holder sin egen takt, ikke samme takten som de andre komponentene.

8.  Hva står IRQ for og hva er det?  
    IRQ står for interrupt request. En IRQ signal blir sendt til CPUen for å stoppe det den driver med momentært når den det er noe som trenger umiddelbar respons f.eks når man trykker på en knapp.

---

### Oppstart av maskinen

1.  Hvor på PC-en lagres grunnleggende innstillinger slik som dagens dato og hvordan harddisker er konfigurert?  
    Det lagres i CMOS. Det er derfor man har en CMOS batteri, for å kunne huske dato osv. selv om PCen er skrudd av.

2.  Forklar kort hvordan en boot-sekvens foregår.

    - Strømforsyning starter
    - Primærdelen av BIOS lastes inn i RAM
    - Type boot bekreftes(cold boot eller warm boot)
    - Power On Self Test(POST) _hvis cold boot_
    - Video adapter programvaren lastes
    - BIOS startup screen lastes og viser feilmeldinger som text
    - CMOS test
    - Porter tildelt og utstyr konfigurert
    - Hardware konfigurasjon bekreftet
    - Operativsystemet lokalisert og lastes

3.  Hvis du får en feilmelding med 2xx, hvilken del av din maskin er det feil på da? Fra hvilken test får du denne feilmeldingen ifra?  
    Feilmelding med 2xx er det feil på RAM. Vi får denne feilmelding under POST som viser feilkoden til skjermen.

4.  Dersom PC-en booter uten problemer, men alltid "fryser"/stopper etter noen få minutter, så er den mest sannsynlige årsaken at

    - CPU-en er i gang med å gå i stykker
    - BIOS er i gang med å slutte å fungere
    - CPU-en får ikke nok strøm
    - CPU-en blir for varm
      - Svaret er at CPU-en blir for varm

5.  Forklar kort hva BIOS er og hva som er forskjellene på BIOS og UEFI.  
    BIOS og UEFI fungerer på ganske lik måte. Men BIOS er lagd for 16 bit maskiner og støtter bare 1 MiB minne. Men BIOS blir erstattet med UEFI(Unified Extensible Firmware Interface) som støtter både 32 og 64 bits instruksjoner. Det støtter minimum 2GB minne og ny adresseringsmåte for partisjoner og blokker på harddisken GPT isteden for MBR. Det gir støtte for større harddisker enn 2 TB.

---

### RAM

1.  Hva er forskjellen mellom "BIT", "BYTE" og "WORD"?  
    "BIT" er binær tall 1 og 0. "BYTE" er 8 BIT, som er den minste adresserbare enhet i RAM. "WORD" er 16 BIT og har flere betydninger, størrelsen på register eller adresseringsenhet.

2.  Hva brukes RAM til?  
    RAM brukes til å lagre midlertidig data mens det kjøres siden den er mye raskere enn SATA. RAM brukes da til å gi data on instruksjoner til CPUen.

3.  Forklar kort hva DRAM, SDRAM OG SRAM er.  
    DRAM(Dynamic RAM) er en type ram som må oppdateres hele tiden. SDRAM(Synchronous DRAM) fungerer på samme måte som DRAM men den går i takt med CPU, noe som vanlig DRAM ikke gjør. SRAM(Static RAM) må ikke oppdateres hele tiden og den er raskere en DRAM men det er dyrere å produsere og trenger flere transistorerr pr bit lagret.

4.  Hva er typiske RAM problemer?  
    Vanlige problemer hvor RAM er årsaken er

    - PC booter ikke, post beep kode. Da er minnet vanlighvis ikke satt inn orgentlig eller konfigurert feil.
    - PC booter til blank skjerm. Da er minnet løs eller er av feil type.
    - POST minne-opptelling feil. Det kan være pga. feil RAM-modul type.
    - "Memory Error" melding. Det kan være kompatibilitetesproblemer med gammelt og ny RAM eller at ram modulen er i ferd med å gå i stykker.

5.  Finn ut hvor mye RAM-minne du har på din maskin.  
    Jeg bruker linux så jeg kjører kommandoen `sudo dmidecode --type memory` hvor jeg får opp 2 ram moduler som har maks kapasitet på 4096 MB hver som til sammen er 8192 MB.

---

### Periferiutstyr

1.  Hva står I/O for?  
    I/O står for Input/Output. Det beskriver kommunikasjon mellom to parter, som kan f.eks. være et tastatur eller nettverkskort.

2.  Hvorfor har I/O-enheter "Device controller"?  
    Det er en liten mikroprosessor som brukes for å kommunisere med andre enden. Kontrollenes oppgaver er å ta imot instruksjoner, vise status, konverter seriell bitstrøm til blokk av byte, utgjør feilkorrigering etter behov og gjøre data tilgjengelig i RAM.

3.  "Device controller" i en I/O-enhet har registre, hvorfor har de det?  
    De har det for å oppbevare status og kommunisere med CPU. Det kan da skrive til registre for å kontrollere enheten. Det kan også lese andre enheter for å finne tilstanden til enheten.

4.  Hva er PCI, AGP, ISA og PCIe eksempel på?  
    De er ekspansjonsbusser. De lar oss legge til ny funksjonalitet i form av kort og periferiutstyr f.eks. grafikkort, nettverkskort osv.

5.  Hva er prinsippet bak LCD-skjermer?  
    LCD(Liquid Crystal Display) skjerm som består av pixler som blir endret når bildet oppdateres. De pixlene oppdateres hver for seg ettersom hver pixel har en egen adresse.

---

### Masselager

1.  Hva er forskjellen mellom masselager og minne?  
    Masselager blir brukt for permanent lagring av store datamengder. Minne blir brukt for midlertidig lagring av mindre datamenger.

2.  Gi eksempel på en kontroller som brukes for overføring av data til/fra masselager.  
    Det mest vanlige kontroller til overføring av masselager nå er SATA. Men det finnes også andre kontroller som IDE/EIDE, SCSI osv.

3.  Hvilke er de tre delene i diskens organisering? Og hva er diskens logiske organisering for noe?  
    De tre delene i diskens organisering er:

    - Spor, det omerådet lesehodet dekker på en rotasjon
    - Sektor, den minste delen av et spor som kan leses
    - Sylinder, alle spor i samme posisjon på disken

    Diskens logiske organisering er en hierarki over disken. Fra topp til bunn:

    - Partisjon, organisering av kataloger som C:
    - Katalog, fil for organisering av filer
    - Fil, minste enhet som refereres av operativsystemet, minimum 1 cluster
    - Cluster, minste enhet som leses av operativsystemet, minimum 1 sektor

4.  Hvorfor er det bra med sikkerhetskopi? Nevn også noen muligheter for å sikkerhetskopiere data på din maskin.  
    Det er alltid lurt å sikkerhetskopiere dataene dine for det kan alltids gå feil i den lagringsenheten det er lagret i. Derfor bør viktige data lagres på mer enn et sted med tanke på at det kan være flere grunner til at man kan miste data f.eks. diskfeil, brann, vannskade. Noen muligheter man kan bruke på å sikkerhetskopiere dataene er f.eks. å lagre det på en ekstern lagringsmedia, lagre det fysisk på et annet sted eller skylagring.

5.  Se denne videoen: https://www.youtube.com/watch?v=U-OCdTeZLacog forklar hvordan RAID fungerer og hvorfor det finnes.  
    RAID er en løsning for å sikkerhetskopiere dataene på samme maskin. Det er ulike typer:

    - RAID 0, Stripet sett uten speiling eller paritet
    - RAID 1, Speilet sett uten striping eller paritet
    - RAID 5, Paritetsbiter er distribuert over alle diskene
    - RAID 10, Er RAID 1 + 0. Stripet og speilet.

6.  Kan en fil bli deles opp i flere biter på disken og fortsatt være intakt, og i så fall hva kalles denne prosessen.  
    Ja, det kalles for fragmentering. Det er for å kunne bruke de tomme plassene som ligger der etter er programmer er slettet.

7.  Hvilke av følgende påstander er riktig om paritetsbit i denne ASCII-blokken: 1000 0110
    - Det heter 7-bit ASCII, og dermed har denne blokken 1 bit for mye.
    - Det er et partall av 1-ere ekskludertparitetsbit, ergo er det feil i denne blokken.
    - **Det er et oddetall av totale 1-ere(inkludert paritetsbit, ergo er det ingen feil i denne blokken.**
    - Det siste sifferet er 0, altså ikke det samme som paritetsbiten, ergo er det feil.

---

### USB og flash-minne

1.  Hva er Flash memory? Hvilke typer operasjoner brukes i Flash Memory?  
    Det er to typer flash memory, NOR og NAND. NOR er parallell-koplet og blir best brukt til programmer siden den bruker Random Access lesing/skriving. NAND er seriekoplet og blir best brukt til data siden det leses i blokker istedenfor Random Access. Det er billigere og raskere å lese fra enn å skrive til.

2.  Hvilke typer av USB brukes mest i dag?  
    Det brukes mest USB-A og USB-C idag.
