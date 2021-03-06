# 1. WWW og historie

## a) Forklar forskjellen mellom internett og WWW (World Wide Web)

Internett er en infrastruktur som kobler sammen nettverk med TCP/IP protollene.

WWW er et system(eller en "applikasjon") hvor dokumenter og ressurser er identifisert av URL og er sendt via HTTP.

Dokumentene og ressursene kan bli sendt til andre nettverk ved hjelp av TCP/IP protokollene.

## b) Gi noen eksempler på når du ville brukt utrykket "De Facto"

-   x64 isteden for x32
-   GUI isteden for CLI
-   Linux server isteden for Windows server

## c) Hva står RFC for?

RFC står for "Request for Comment" og er dokumenter som inneholder tekniske spesifikasjoner for internett.

## e) Nevn noen forskjeller mellom OSI og TCP/IP modellene.

-   OSI modellen har 7 lag og TCP/IP modellen har 4 lag
-   OSI modellen hjelper å standarisere ruter, hovedkort og andre maskinvare. Mens TCP/IP helper å opprette en kobling mellom ulike typer systemer.

## f) List opp de viktigste hendelsene i internettets historikk.

-   I 1961 kom [Kleinrock](https://en.wikipedia.org/wiki/Leonard_Kleinrock) med [pakkeswitching](https://no.wikipedia.org/wiki/Pakkesvitsjing) som prinsipp.
-   I 1969 ble første [ARPANET](https://no.wikipedia.org/wiki/ARPANET) node operativ
-   I 1972 ble Norge det første landet utenfor USA som koblet til ARPANET
-   I 1982 ble [SMTP protokoll](https://no.wikipedia.org/wiki/Simple_Mail_Transfer_Protocol) definert (sending av email)
-   I 1983 ble [TCP/IP](https://no.wikipedia.org/wiki/TCP/IP) standardprotokoll for ARPANET
-   I 1988 kom [TCP trafikk-kork kontroll](https://en.wikipedia.org/wiki/TCP_congestion_control), [IPv4](https://no.wikipedia.org/wiki/IPv4) og [UDP](https://no.wikipedia.org/wiki/UDP)
-   I 1991 introduserte [Tim Berners-Lee](https://no.wikipedia.org/wiki/Tim_Berners-Lee) [HTML](https://no.wikipedia.org/wiki/HTML) og [HTTP](https://no.wikipedia.org/wiki/HTTP)

# 2. Protokoller og andre begreper

## a) Sant/Usant: Protokoller definerer hvordan kommunikasjon over internett skal fungere.

Sant f.eks. TCP.

## b) Hva er forskjellen mellom en Klient-tjener-modell og en Peer-to-peer modell, tegn og vis.

En klient-tjener-modell er en modell hvor det hovedsakelig er for filoverføring. Du har en klient som er et system som sender et forespørsel til en server som inneholder tjenesten/filene. Fordelen med en klient-tjener-modell er at det er bedre sikkerhet fordi det er serveren som bestemmer hvem som får tilgang til filene. Klient-tjener-modellen er også mer robust siden det kan bli utvidet uten degradering på ytelsen. Ulempen med en klient-tjener-modell er en sentral server må bli bygd og være på hele tiden, hvis ikke vil nettverket kollapse.

En peer-to-peer modell er hovedsakelig for kommunikasjon. I et peer-to-peer modell er alle "peers" likeverdige og sammenliknet med klient-tjener-modellen er peers i peer-to-peer modellen både server og klient. Fordelen med peer-to-peer modell er at det trengs ikke å bli bygd en sentral server ettersom alle peers er koblet direkte til hverandre og oppfører seg som både server og klient. Ulempen med peer-to-peer modell er at det er mindre sikker siden peers er både server og klient. Det medfører at filene ikke kan bli håndert sentralt og medfører at det er opp til klienten hvor sikker tilkoblingen er og hvilke filer de får tilgang til. En annen ulempe er også at desto fler peers det er på nettverket, vil hastigheten minke fordi hver bruker er koblet til andre brukere.

## c) Hvilken port kobler en TCP-forbindelse seg mot for en hjemmeside.

Som standard vil en TCP-forbindelse koble seg til http på port 80 mens https vil koble seg på port 443.

## d) Bruk tracert (Windows) eller traceroute (OSX/LINUX) i terminalen mot www.vg.no, hvor mange stop gjør ruten?

På nettverket jeg er på nå tar ruten 11 stopp.

## e) Hvorfor deler man opp internett i ulike lag?

Det er flere grunner til at vi deler det opp, struktur, abstraksjon og sikkerhet.

## f) I forelesning snakket vi om organisering av internett: Tegn opp den oppdaterte TCP/IP modellen.

Application - Transport (host-to-host) - Internet - Network Access - Physical

## g) Hvorfor er internett usikkert oppbygget?

Fordi når internett ble først oppfunnet var det designet for et minimum av pålitelighet og det var svært lite tanke på sikkerhet.

## h) Hva kan gå galt når data overføres over internett?

Det kan bli tap av data, for lite båndbredde og for mye tidsforsinkelse.

# HTTP

## a) Sant/Usant: HTTP oppbevarer informasjon om tidligere forespørsler.

Usant. HTTP er det man kaller for "stateless". Det er cookies som oppbevarer informasjon.

## b) Sant/Usant: En URL er en type URI

Sant. En URL står for Uniform Resource Locator som forteller hvor ressursen er. En URI står for Uniform Resource Identifier som identifiserer ressursen.

## c) https://www.kristiania.no/sok?phrase=Digital%20Teknologi Identifiser de ulike delene av HTTP url-en, host, port, path, query, fragment. Alle er ikke nødvendigvis tilstede. Vet du også hva %20 betyr her?

Host : https://www.kristiania.no

Path : /sok

Query: phrase=Digital%20Teknologi

%20 står for mellomrom. Fordi det er mange tegn som ikke er lov å ha med i en URL, så må man heller skrive de tegnene hvor du starter med % tegnet og så hex nummeret til tegnet fra ASCII tabellen.

## d) I HTTP 1.0 GET-request, hvordan spesifiseres språk?

Språk spesifiseres i headeren.

## e) Hvilken type metoder har HTTP 1.1 som ikke HTTP 1.0 har?

-   PUT

    -   Laster opp en fil til adressen som er spesifisert i URL-feltet

-   DELETE

    -   Sletter filen som er spesifisert i URL-feltet

-   OPTION

-   TRACE

## f) Gi tre eksempler på statuskoder og hva de betyr.

**404 Not Found** er en statuskode som sier at det etterspurte ressursen ikke er funnet.

**200 OK** er en statuskode som sier at spørringen er vellykket.

**400 Bad Request** er en statuskode som sier at spørringen er ikke forstått av tjeneren.

# 4. DNS

## a) Hva bruken DNS til?

DNS står for Domain Name System og blir brukt til å identifisere og finne lokasjonen(ip adressen) på det etterspurte domenet.

## b) Hvordan er navne-tjenere fordelt?

Navne-tjenere er fordelt hierarkisk.

## c) Bruk `nslookup` mot www.vg.go i terminalen, hvilken informasjon vises?

Det vises servernavnet og adressen til DNS'en du spør.

```
Server:         1.1.1.1
Address:        1.1.1.1#53
```

Etterfølget av navn(ene) og ip(ene) til www.vg.no

```
Non-authoritative answer:
Name:   www.vg.no
Address: 195.88.55.16
Name:   www.vg.no
Address: 195.88.54.16
Name:   www.vg.no
Address: 2001:67c:21e0::16
```

## d) Prøv deg frem og endre Resource Records når du skal kjøre `nslookup`, hvordan ser de ulike svarene ut? Er det annerledes fra når du kjørte det første gang?

Du kan endre DNS serveren du vil bruke men du vil forstatt få samme identifikator og ip adressen til domenet.
