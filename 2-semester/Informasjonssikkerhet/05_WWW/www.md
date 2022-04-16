# Nettleser- og WWW-sikkerhet

## 1) Hvilke metoder finnes under HTTP/1.1

- GET
- POST
- HEAD
- PUT
- DELETE
- OPTION
- TRACE

## 2) Nevn noen grunner til å bruke «cookies»

Cookies kan brukes til å lagre informasjon om hvem som som bruker siden, instillinger eller om brukeren er innlogget på nettsiden.

Det kan være flere grunner til å bruke cookies men som regel er det 2 forskjellige cookies, "session cookies" og "persistent cookies".

Session cookies blir brukt for å lagre midlertidig informasjon så lenge nettleseren er åpen f.eks. lagre informasjon om hva brukeren har i handlekurven på en shopping nettside.

Persistent cookies blir brukt for å lagre informasjon over lengre tid til en gitt utløpsdato. Så selv om nettleseren blir lukket, vil informasjonen fortsatt bli lagret. Dette kan f.eks. bli brukt for "tracking" eller for å huske at denne brukeren er logget inn.

## 3) Hva er «session hijacking» (sniffing)?

Session hijacking er stjeling av cookies. F.eks. hvis brukeren er logget inn på en server, vil informasjonen om brukeren som er logget in, bli lagret i en cookie.

Session hijacking er å stjele/kopiere cookie som inneholder informasjon om brukeren som er logget inn. Dermed kan en angriper lure serveren til å tro at angriperen er den orginale brukeren som er logget inn.

## 4) Hva er et serfikat?

Når det kommer til nettsider med HTTPS, er et sertifikat er en digital signatur til å vise at den offentlige nøkkelen er gyldig. Det vil si at hvis det er et gyldig sertifikat på nettsiden, er nettsiden ekte og ikke forfalsket.

Det finnes et hierarki av sertifikater f.eks. nettsiden til Amazon er signert av Amazon selv men signaturen til Amazon er signert av en root Certificate Authority(CA) som er en tredjepart.

Sertifikater fra de fleste store CA er hardkodet til nettleseren. Dermed kan nettleseren verifisere direkte om siden er gyldig eller ikke.

## 5) Hva er «Cross Site Scripting» (XSS)?

XSS er en måte å kjøre script på en bruker gjennom nettsiden. En angriper kan legge inn en script på en nettside som er sårbar mot XSS. Når en en bruker laster opp nettsiden, vil scripten som angriperen har lagt inn på nettsiden, bli kjørt.

XSS er en av de mest utbredte sårbarhetene på nett. Utnyttelse av sårbarheten kan føre til ulike konsekvenser som en angriper får tilgang på konto, tap av konto, heving av rettigheter, infeksjon av malware mm.

## 6) Hva er «Cross Site Request Forgery» (CSRF)

CSRF er motsatt av XSS hvor brukeren blir lurt til å gå til en nettside som kjører en script lokalt på maskinen hvor den utnytter cookies som er lagret maskinen til å utføre handlinger på en nettside cookien blir brukt på.

## 7) Hva er «SQL-injection»?

SQL injection er en måte å utnytte databasen til å f.eks. vise fram informasjon som ikke er ment til å bli vist fram. Dette kan man gjøre når en SQL database er satt opp på SQL statements på en usikker måte slik at angriperen kan skrive inn andre SQL kommandoer.

## 8) Hva er “phishing”?

Phishing er meldinger som prøver å lure brukere til å oppgi personlig informasjon som f.eks. brukernavn og passord.

Mest kjente phishing metoden er gjennom epost, hvor eposten utgir seg for å være fra en bank eller en aktør som vi stoler på. Meldingen vil ofte inneholde en URL som vil ta brukeren til en side som ser ut som bankens nettside, men som egentlig er en nettside om ligner men hvor det er innlogging for å prøve å få brukeren til å skrive inn brukernavn og passord.
