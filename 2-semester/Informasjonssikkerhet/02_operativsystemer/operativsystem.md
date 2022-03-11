# T-02 OPERATIVSYSTEM

## 1) Hva er multitasking?

Multitasking er når flere programmer eller tjenester kjører samtiding.

En CPU kan bare gjøre en oppgave om gangen, også kalt sekvensielt. Dermed må hver program eller tjeneste må bli lagt til i kø til CPUen for å kunne kjøres "samtidig", men bli kjørt så fort etter hverandre at man kan kalle det multitasking.

## 2) Hva er forskjellen på User- vs Kernel-modus?

I User-modus vil en applikasjon bare ha tilgang til det som OS har gitt. For at en applikasjon skal ha tilgang til hardware så må applikasjonen bruke en API(Application Programming Interface) gjennom OS for å kunne bruke hardware. Applikasjonen har bare tilgang til minne som OS har tildelt. I tillegg har applikasjonen bare tilgang til minnet som OS har tildelt.

I Kernel-modus vil applikasjonen ha tilgang til hele minnet og alle instruksjoner kan kjøres. I tillegg har den tilgang til all hardware.

Grunnen til å ha flere moduser for applikasjoner til å kjøre på er sikkerhet. Det er ingen grunn til å gi en applikasjon mer enn det den trenger.

OS kernel vil kjøre i kjernemodus(ring 0) og vanlige applikasjoner og mange OS-tjenester og undersystemer kjører i user mode(ring 3).

## 3) Hva er forskjellen på prosess og tråd?

En prosess er et program som kjører på en datamaskin. Når en prosess blir opprettet vil OS tildele den rettigheter og ressurser.

En tråd utfører instruksjoner og en prosess kan ha flere tråder.

Hvis en enkel tråd kjøres i en prosess heter det single-threaded. Hvis det kjøres flere tråder i en prosess heter det multithreading.

## 4) Hva tilbyr som oftest et filsystem?

Metode og datastruktur som OS bruker til å kontrollere hvordan data skal bli lagret og hentet.

## 5) Hva er en virtuell maskin(VM)?

En VM er en virtuell maskin som kjøres på en datamaskin som får tildelt CPU, minne og lagringsplass fra den fysiske datamaskinen den kjører på. Den virtuelle maskinen vil oppføre seg som en vanlig datamaskin og kan kjøre forskjellige OS.

Siden en VM får tildelt CPU kraft, minne og lagring, kan man kjøre flere VM på en fysisk datamaskin. En VM vil være partitionert fra systemet den kjører på som vil si at ting som kjøres i ett VM kan ikke forstyrre den fysiske datamaskinens OS.

En virtuell maskin vil ofte bli brukt til å teste ut programmer eller OS uten å risikere den fysiske datamaskinens OS.

## 6) Nevn noen basic NTFS tillatelser

- Read - Kan lese filer og mapper

- Write - Kan lese og opprette filer og mapper

- Read and Execute - Kan lese filer og kjøre programmer

- Modify - Kan gjøre alt ovenfor og slette filer og mapper

- Full Control - Kan gjøre alt ovenfor og endre rettigheter og ta eierskap

## 7) Nevn minst ett viktig tiltak for å sikre OS mot angrep

- Installere sikkerhetsoppdateringer

- Bruk antivirus

- Ikke gi applikasjoner eller brukere høyere tilgangsnivå enn det som er nødvendig

## 8) Hva er Rootkits?

Tidligere var rootkit et verktøy brukt av en hacker for å skaffe seg root access på en UNIX server og ofte hadde de også mulighet til å slette logger for å skule spor etter hackingen.

Men i dag er det kaller vi rootkit en teknikk som blir brukt av malware for å skule sine spor og gjøre seg usynlig på maskinen som er infisert.

## 9) Hva er stack-buffer overflow? Hvordan kan dette være en svakhet?

Når et program kjører og blir lagt til i minne, er det data i stack-bufferet. Problemet I lavnivåspråk er at det bufferet har ikke en maksgrense på hvor mye data som kan bli skrevet i den. Det er bare en stack pointer for peker hvor toppen av stacket er.

Det er en svakhet for hvis man skriver mer data i bufferet enn det den kan ha i det, vil den ekstra dataen som blir skrevet i bufferet, overskrive data over som, lokale variablene, retur adresse og hoved lokale variablene.

## 10) Hva er et “0-day”-attack?

Et 0-day attack er når en angriper angriper en sårbarhet som ikke er kjent. Det er farlig fordi selskapet ikke er kjent med sårbarheten og dermed er det ikke beskyttet mot sårbarheten.
