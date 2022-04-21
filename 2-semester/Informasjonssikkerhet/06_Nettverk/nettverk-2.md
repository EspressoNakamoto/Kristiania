# T-07 Nettverk og internett 2

## 1) Hva står "DNS" for?

DNS står for Domain Name System og er en tjeneste som har informasjon om hvilke domene er knyttet til hvilke IP adresse.

## 2) Hva er forskjellen på Pharming og Phishing?

Phishing er å lage en nettside som ser ekte ut som får offeret til å oppgi personlig informasjon som innloggingsinformasjon, bankinformasjon ol. Med denne teknikken må offeret trykke på en feil link.

Pharming er å lede offeret til en annen IP adresse som ligner på den siden de skal til for å få offeret til å skrive inn innloggingsinformasjon, laste ned malware ol. Med denne teknikken så går offeret selv til nettsiden og eneste måten offeret kan legge merke til at det er feil side, er enten at angriperen har ikke klart å etterligne den ekte siden helt, eller at offeret ser at IP adressen dem er koblet til feil, noe som er en urealistisk scenario.

## 3) Hva er DNS cache-forgiftning?

DNS cache-forgiftning er å gi DNS tjenere falske svar og få dem cachet. Altså en angriper får en DNS tjener til å koble et domene til en annen IP adresse.

For at DNS cache-forgiftning skal være mulig må en DNS tjener se bort fra ID, har forutsigbare ID, aksepterer DNS RR som den ikke har spurt om eller gjennom MITM angrep.

## 4) Hvorfor kan vi bare gjette oss til DNS ID?

På grunn av bursdags-paradoxet som sier at hvis man har 23 personer i et rom, er sannsynligheten at 2 personer har samme fødselsdag 20,7%.

Så hvis vi sender n responser på n ulike forespørsler, så vil vi i teorien etter 213 forsøk, ha 50% sannsynlighet og etter 400 forsøk, 92,4%, for å gjette oss til DNS ID.

## 5) Hva er en brannmur?

En brannmur er en samlig av sikkerhetstiltak som skal forhindre uautorisert tilgang til et nettverk.

Dette gjør den gjennom "regler" hvor den tillater eller blokkerer ingående og/eller utgående pakker.

## 6) Hva er black- og white-listing?

Det er 2 forskjellige strategier for å minimere sårbarhet mot eksterne trusler men fortsatt beholde funksjonalitet for interne tjenester.

Black-listing tillater alle pakker gjennom bortsett fra de som er definert i regnlene. Denne metoden er mest fleksibel men naiv da den forutsetter at man kan forutse alle trusler og kan oppstå.

White-listing tillater ingen pakker gjennom bortsett fra de som er definert i reglene. Denne metoden er mest sikker da den forutser at alt kan være en trusser og slipper bare pakker som er definert i reglene.

## 7) Hva er "tunneling"?

Tunneling protokoll er en måte å forhindre avlytting uten å endre software. Siden innholdet i TCP segmenter er vanlighvis ikke kryptert og tillater avlytting av nyttelasten, vil en tunneling protokoll krypteres og gjør at avlytting blir vanskelig/umulig.

## 8) Hva står "VPN" for?

VPN står for Virtual Private Network og er en fellesbetegnelse på ulike teknologier som tillater sikker tilgang til private nettverk over internett.

Dette gjør den ved å bruke tunnelig protokollen for å kryptere pakkene over internett. Det blir typisk sikret med enten SSL/TLS eller IPSec.

Det er to hovedtyper VPN, remote access VPN og site-to-site VPN.

Remote access VPN gir autoriserte klienter tilgang til et privat nettverk. Denne typen VPN vil gi tilgang til LAN ressurser og vil se ut som om man er i LANet.

Site-to-site VPN knytter sammen et WAN og fungerer som en sikker bro mellom to eller flere fysiske nettverk over internett.

Det finnes også en type VPN til som blir mer brukt personlig og anonymisering. En privatperson kan kjøpe en VPN tjeneste hvor data blir kryptert gjennom en tunnel og blir ukryptert da den går ut fra VPN serveren et annet sted.

## 9) Hva betyr "portscanning"? Hva brukes det til?

Portscanning er å scanne for åpne porter. Det blir ofte brukt til å avdekke brannmurers svakheter.
