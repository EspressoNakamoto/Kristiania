# T-05 Nettverk og internett 1

## 1) Hva er "MAC-spoofing"?

MAC-spoofing er å forfalske MAC adressen for å utgi seg for å ha en annen MAC-adresse.

## 2) Hva er "ARP-spoofing"?

ARP-spoofing er å sende en ARP melding til LAN nettverket hvor målet er å assosiere angriperens MAC-adresse med IP adressen til en annen maskin. Dermed endre routingen på nettverket som gjør det mulig for en MITM angrep.

## 3) Hvorfor er "ip-spoofing" ofte brukt i "DOS-angrep"?

IP-spoofing bruker man fordi det er ikke viktig for angriperen å få svar fra mottakeren. Det er også bra å bruke når den som blir angrepet vil blokkere IP-adressen, da kan man bare spoofe IP-adressen igjen og fortsette og angripe.

## 4) Hva er ett "Smurf-attack" Smurfe-angrep?

Et Smurfe-angrep bruker ICMP protokollen hvor angriperen vil sende en broadcast melding til nettverket med offerets spoofede IP-adresse som avsender. Alle på nettverket som mottar meldingen vil svare tilbake til avsender.

Siden meldingen har en spoofet IP-adresse til avsenderen, vil den som har den IP-adressen som ble spoofet til, få alle meldingene fra alle de andre på nettverket. Dette kan da føre til at mottakerens maskin slutte å virke.

Det er en DoS-angrep hvor man bruker det som heter amplification hvor man sender en ting, men så skjer det mye mer i nettverket.

Man kan beskytte mot dette f.eks. ved å sette opp enkeltmaskiner til å ignorere broadcast adresserte ping meldinger eller å få firewall/ruter til å filtrere ut dette.

## 5) Hva er "SYN-flod attack"?

En SYN-flood attack er en typisk DoS angrep som er basert på å sende forespørsler om å opprette en TCP forbindelse raskere enn tjeneren kan behandle dem.

Angriper vil lage en stor mengde pakker med med SYN og spoofet avsender adresse til en som ikke fins. Tjeneren vil da svare med SYN/ACK og åpne en socket. Men siden avsender adresse er spoofet til en som ikke finnes, vil tjeneren aldri få noen respons.

Til slutt vil all kapasiteten på tjeneren bli brukt opp med for mange åpne sockets at tjeneren vil stoppe å funke og ingen andre kan koble til tjeneren fordi alle sockets er brukt opp.

For å beskytte mot dette kan man f.eks. sende en cookie med SYN/ACK som man sender tilbake, og at den ikke åpner en socket etter å ha mottatt en SYN pakke for å ta vare på sockets. Så når man får ACK tilbake og kvitteringsnummeret stemmer med SYN cookien, så kan man åpne forbindelsen.

## 6) Hva er "(D)DoS"?

DoS står for Denial of Service som handler om å forhindre andre brukere fra å få tilgang til en tjeneste.

DDoS står for Distrubuted Denial of Service som er det samme som DoS men at det blir brukt flere maskiner for angrepet.

## 7) Hva mener Kripos er de typiske formene for datakriminalitet?

Kripos mener at de vanligste formene for datakriminalitet er:

- Datainnbrudd - skaffe seg tilgang til et datasystem uten lov

- Løsepengervirus - også kalt Ransomware, er kryptering av innholdet på en datamaskin og krever penger for at offeret får tilbake tilgang til innholdet

- DoS angrep - forhindre at andre brukere får tilgang til tjenesten

- Skadevare - program som kan f.eks. stjele informasjon, gjøre skade på maskinen eller tilrettelegge for ransomware

## 8) Kan man bruke Wireshark, nmap eller andre sikkerhetsverktøy utenfor sin egen eiendom/område så lenge man ikke planlegger å gjøre skade?

Nei, så lenge man ikke har fått eksplisitt tillatelse til det så er det ulovlig.
