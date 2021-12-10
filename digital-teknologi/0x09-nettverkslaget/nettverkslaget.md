# Nettverkslaget

## a) Forlkar kort hva hovedoppgaven til nettverkslaget er.

Sende pakker fram og tilbake mellom forskjellige nettverk. Nettverkslaget er det 3 laget i OSI modellen og IP(Internet Protocol)er en av hovedprotokollene på dette laget, sammen med andre protokoller for routing, testing og kryptering.

## b) Test å skriv in `netstat -r` eller `route print` i terminalen på din maskin, hva får du for informasjon?

Det viser IP routing tabellen for kernel.

## c) Hva menes med "routing av datagram"?

At pakken som blir sendt, blir sendt gjennom forskjellige punkter/nettverk for å komme fram til mottaker.

## d) Hva er forskjellen mellom Intra-AS og Inter-AS ruting?

**Intra-AS** ruting er brukt for lokale nettverk og Inter-AS er for ruting mellom to nettverk. Intra-AS har interne gateways og Inter-AS har eksterne gateways.

Det er gateway protokoller som blir brukt og i Intra-AS blir det også kalt Interior Gateway Protocols(IGP). De vanligste protokollene som blir brukt i Intra-AS ruting er:

-   Routing Information Protocol (RIP)
-   Open Shortest Path First (OSPF)
-   Interior Gateway Routing Protocol (IGRP)
    -   Bare Cisco
    -   EIGRP videreutvikling av IGRP

De protokollene er implementer i programmer på routerene og utveksler routing-informasjon med andre routere innenfor AS/WAN.

**Inter-AS** bruker Border Gateway Protocol (BGPv4) som standard protokoll for internett.

Bruker også Path Vector protokoll som opprettholder ruting informasjon som blir oppdatert dynamisk ved at ASBR(Autonomous System Boundrary Routers) sender meldinger til å reklamere tilgjengeligheten til nettverkene. Hver ruter som får meldingen må verifisere meldingen. Hvis den blir verifisert, vil ruteren modifisere ruting tabellen før den blir sendt til nabo-ruter.

Her blir det brukt TCP mellom ruterne for pålitelighet ved 4 typer meldinger:

-   OPEN: Åpner TCP forbindelse og bekrefter avsender
-   UPDATE: Åpner ny rute eller lukker gammel
-   KEEPALIVE: Holder liv i forbindelsen uten UPDATE
-   NOTIFICATION: Sender feilmelding. Lukker forbindelse

**Hvorfor** benyttes det Intra- og Inter-AS ruting?

-   Inter-AS vil ha kontroll over rutingen mellom nettverkene og må ta hensyn til peering-avtaler og priser.

-   Intra-AS vil ha enhetlig kontroll av rutingen i nettverket, fokus på effektivitet og lastbalansering.

-   Ved heirarkisk ruting sparer det tabellplass og reduserer oppdaterings-mengden.

-   Inter-AS policy ofte viktigere enn ytelse

-   Intra-AS ytelse ofte viktigere enn policy

## e) Hva er adresse til localhost?

Vanlighvis er adresse til localhost `127.0.0.1`. Hvis man prøver å koble til `127.0.0.1` i IPv4 vil det trigge en loopback som vil sende deg tilbake til egen web server. For å trigge en loopback i IPv6 kan man bruke `:1` istedenfor `127.0.0.1`.

# IPv4

## Hvor lang er en IPv4 adresse og hvorfor kalles det for en adresse?

IPv4 adresse er 32-bit lang og blir kalt en adresse fordi det er en "adresse" på samme måte som adresse på hus. Det er en identifikasjon for hver nettverksadapter. Hvis man vil koble seg til f.eks. google.com så må maskinen vite adressen til google for å kunne koble seg til. IPv4 adressen får du fra DNS server som du da bruker for å koble deg til den serveren/nettstedet du vil til.

## b) Skriv in `ipconfig` (Windows) eller `ifconfig` (OSX/Linux) i terminalen, hvilken informasjon får du frem?

ifconfig viser ip configurasjonen til interfacene/adapterne. Her står det informasjon om IPv4 adressen, nettmaske(undernettverk) og standard gateway(veien ut til internett).

## c) Hva er din "Default Gateway" på din maskin akkurat nå?

Min default gateway på min maskin akkuratt nå er 172.31.143.25.

## d) Hvordan får du tildelt din IPv4 adresse i et Local Area Network?

Man får vanlighvis tildelt IPv4 adresse i et LAN fra DHCP(Dynamic Host Configuration Protocol). Det er oftest på ruteren som har DHCP og bestemmer IPv4 adressene til enhetene på nettverket. Man kan også sette en fast IPv4 adresse på en enhet via DHCP instillingene på enheten eller DHCP instillingene på ruteren.

## e) Forklar kort hvordan et datagram transporteres fra avsender til mottaker, de er på ulike nettverk.

Først å finner senderen adressen til mottakeren fra DNS, så ser avsender om mottaker er på samme nettverk eller ikke. Om ikke, gir ruting tabellen beskjed om hvor neste stopp er for veien til motakker. Så blir en link laget til de nødvendige stoppene. Så sendes datagrammet gjennom stoppene ved hjelp av linker til mottakers gateway, så til slutt mottaker.

## f) Hva trengs for å finne nettverksprefixen?

Prefixen bestemmes av IP-adressen og nettmaskinen. Så for å finne prefixen trenger man nettmasken og IP adressen.

## g) Hva er en Nettmaske og hvorfor brukes den?

Nettmaske er for å dele opp ip adresse i subnets og hosts. Dette er for å finne ut om maskiner er på samme IP-nettverk og om de har mulighet til å sende data direkte mellom hverandre eller om de må utenfor nettverket.

## h) Hvilken operasjon brukes for å regne ut adresse med nettmaske?

Det brukes AND operasjonen for å regne ut adresse med nettmaske.

## i) Kan 10.21.3.5 med nettmaske 255.255.254.0 sende direkte til 10.21.2.255 med nettmaske 255.255.254.0? Hint: Se slideseries fra forelesning for hvordan du skal regne ut dette.

Ja for de er på samme nettverk. Når man utfører AND operasjonen så finner man ut at det lokale nettverket på begge er 10.21.2.0/23.

## j) Kan 10.21.3.5 med nettmaske 255.255.255.0 sende direkte til 10.21.2.255 med nettmaske 255.255.255.0? Hint: Se slideserien fra forelesning for hvordan du skal regne ut dette.

Nei, for de er ikke på samme nettverk. Når man utfører AND operasjonen så finner man ut at det nettverket på den første IP'en er 10.21.3.0
