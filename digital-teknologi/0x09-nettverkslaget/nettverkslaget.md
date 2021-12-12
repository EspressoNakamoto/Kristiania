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

Nei, for de er ikke på samme nettverk. Når man utfører AND operasjonen så finner man ut at det nettverket på den første IP'en er 10.21.3.0/24, og den andre IP'en er 10.21.2.0.23.

## k) Hva menes med private adresser?

Det er adresser som blir brukt i et lokalt nettverk.

## l) Hva er et subnet?

Et subnet et undernettverk som er på et nettverk. F.eks. 223.1.1.1 og 223.1.2.1 er på 2 forskjellige undernettverk. Det blir brukt for å ha større mengde med enheter på ett nettverk.

# ICMP

## a) Hvem er det som bruker ICMP?

Host, router og gateway bruker ICMP(Internet Control Message Protocol) for feil-rapportering av datagram.

## b) Hva er en host, router og en gateway?

Host er en maskin koblet til nettverket. Router er en nettverks maskin som sender datapakker mellom maskiner og nettverk.

## c) Hvorfor utnytter `tracert/traceroute` ICMP protokollen?

For å ekkoe pakker til destinasjonen, TRACERT bruker da TTL verdien 1. Den vil da sende tilbake hvor mange hopp den tok når ICMP Time Exceeded melding blir sendt tilbake. Med det kan man finne ut hvor i ruten det kan være forsinkelser/problemer.

## d) Test å "pinge" vg.no, hvilken informasjon får du av det?

Ved å pinge vg.no vår jeg opp hvor mange bytes fra vg.no, ip-adressen til vg.no, ICMP sekvens-nummer, TTL verdien og tiden den brukte i ms.

# NAT

## a) Hva er problemet/problemene som NAT løser?

NAT løser problemet at det ikke trenger at alle maskiner har en offentlig IP-adresse. NAT "oversetter" LAN til WAN adresse og omvendt.

En NAT-ruter vil erstatte avsenders IP-adresse og portnummer med NAT IP-adresse og nytt portnummer. NAT vil da huske i oversettelsestabellen hver avsenders IP-adresse og portnummer med NAT IP-adresse og det nye portnummeret. Når datagram kommer inn vil NAT IP-adresse on nye portnummeret bli konvertert til avsenders IP-adresse og portnummer som er lagret i NAT tabellen.

## b) Hva er spesielt med 192.168.x.x og 10.x.x.x adresser?

Det er private IP-adresser som brukes i lokale nettverk.

## c) Sant/Usant: Du og din venn er koblet på samme LAN og sender datagram ut til internettet, dere har da ulike IP-adresser for å kunne identifisere seg.

Usant, vi bruker samme gateway men NAT vil oversette det og sende begge pakker ut fra en felles IP-adresse.

## d) Forklar kort hva traversering-problemet med NAT betyr.

Traversering-problemet er når en ekstern klient vet bare det offentlige ip adressen men ikke den lokale IP-adressen den vil nå.

# IPv6

## a) Hva er de største forskjellene mellom IPv4 og IPv6?

IPv6 har 128 bit adressefelt og IPv4 har 32 bit adressefelt. IPv6 forenkler header-format ved å fjerne mulighet for fragmentering og fjerner sjekksummen. IPv6 forenkler adressering og data-fly og header har en fast lengde på 40 byte.

## b) Hvordan ser IPv6 notasjonen ut?

IPv6 notasjonen er på max 128 bit og blir skrevet hexadesimalt i 8 grupper på 2 byte/16 bit. Om det er kun 0 i en gruppe så kan hele adressen forkortes gjennom å skrive "::".

IPv6 eksempel: 2001:0DB8:AC10:FE01::

## c) Forklar kort hva "Unicast", "Anycast" og "Multicast" er.

Det er forskjellige typer IPv6 adresser.

Unicast: Enkeltadresse

Anycast: Adresse som er bestemt av ruter

Multicast: Adresse til en forhåndsdefinert gruppe

## d) Hva er forskjellen på Dual stack og Tunneling, og hva brukes det til?

På grunn av overgangsperioden til IPv6 er det umulig å oppgradere alle rutere samtiding. Dermed må vi kunne gjøre sånn at begge typer rutere kan operere sammen. Det er 2 hovedløsninger som er I bruk:

-   Dual stack = Ruteren forstår begge protokoller og oversetter mellom

-   Tunneling = IPv6 ruter behandler IPv6 datagram som data og pakker det inn i IPv4
