# Opphavsrett og Spam

## 1) Hva er patent? Hva er patent godt for?

Patent er noe man kan søke om fra patentstyret (gjennom Altinn i Norge) som gir enerett til kommersiell bruk av en oppfinnelse for 20 år innenfor et juridisk område.

Det er godt for å hindre andre i å produsere, importere og selge samme oppfinnelsen, men patenten kan lisensieres/leies ut.

Når man søker om patent vil det offentligjøre oppfinnelsen sånn at andre kan se og lære fra det. Men som "takk" vil oppfinnelsen gi rettsbeskyttet monopol til oppfinneren.

## 2) Hva skal «DRM» (Digital Rights Management) beskytte mot?

DRM er systemer som skal beskytte mot lovstridig endring, deling, kopiering, utskrift og fremvising av digitale media. Dette hevder noen innhavere/eiere er nødvendig for å forhindre tapt fortjeneste på grunn av ulovlig distrubusjon av ens åndsverk.

## 3) Hvilke metoder kan brukes til kopibeskyttelse?

Noen metoder som kan brukes til kopibeskyttelse er:

- Dongle - fysisk elektronisk nøkkel som må plugges inn som inneholder en nøkkel/kryptoprosessor som kreves for å kjøre programvaren.

- Produkt-nøkkel - en string av tekst som legges inn under installasjon som testes online for duplikater og knyttes til maskinen via OS- eller HW-signatur.

- Telefon-aktivering - ringe opp og snakke med noen for å aktivere lisens

## 4) Hva står «DKIM» for? (i forhold til email)

DKIM står for DomainKeys Identified Mail.

## 5) Hva er «DKIM»? (i forhold til email)

DKIM er en autentiseringsmetode for å oppdage falske email adresser (email spoofing). I et DKIM signatur er det algoritmen som blir brukt, domene og nøkkel-id, signerte headere, hash av meldingskropp og signaturen.

Det er basert på DNS og siden det er vanligvis serveren som signerer og verifiserer emails, blir hver utgående email bli signert, også header-feltene. Mottaker kan verifisere signaturen ved å slå opp senderens public key i DNS.

Denne metoden garanterer også deler av emailen har ikke blitt modifisert siden signaturen av emailen.

## 6) Gi et eksempel på hvordan man kan legge ut en epostadresse med en format som er vanskelig å identifisere. Altså ikke skrive emailen som «foo@bar.com».

Man kan skrive det på en annen måte f.eks. foo(at)bar(dot)com. Det forutser at de som leser det vet at "at" er alfakrøll og "dot" er punktum. Eller så kan man skrive det i et bilde.

## 7) Hva kan «Captcha» være godt for i forhold til email?

Det vil vanskeliggjøre automatisk opprettelse av webmail kontoer. Siden det kan være bots som blir lagd for å opprette webmail-kontoer som kan bli brukt til spam mail.
