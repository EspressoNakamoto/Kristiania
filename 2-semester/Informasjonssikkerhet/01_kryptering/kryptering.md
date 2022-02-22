# T-01 KRYPTERING

## 1. Hva er kryptering?

Kryptering er teknikken for å få sikre informasjon eller et system for å forhindre at det skal kunne bli lest eller brukt av uautoriserte personer.

## 2. Hva er substitusjonschiffer?

Substutisjonschiffer er den eldste og mest kjente metoden til å skrive informasjon uten at uautoriserte personer kan lese det.

Måten det fungerer er at bytter ut bokstaver og erstatter det med andre bokstaver. På den måten kan det se ut som bare noen tilfeldige bokstaver men hvis man erstatter de bokstavene med de som senderen velgte å bruke, vil man få den egentlige meldingen.

## 3. Kan man bruke substitusjon på binærtall?

Ja, substitusjon kan man bruke på alle språk, tall og symboler. I binærtall bytter man ut et tall med et annet tall før man sender det, og når mottaker får meldingen bytter han ut de tallene med de orginale tallene som både sender og mottaker vet om.

## 4. Hva er "One-Time pads" og er dette sikkert?

One-Time pads er en type kryptering som i teorien, ikke er mulig å knekke.

Istedenfor vanlig substitusjon "kryptering", så vil vi skifte ut hver bokstav med en annen tilfeldig bokstav. Det er viktig at bokstaven den bytter til må være helt tilfeldig. Det skal være veldig sikkert siden antall mulig kombinasjoner vil være veldig høyt.

I substitusjonschiffer vil man bytte ut en bokstav med en annen bokstav et viss antall bokstaver fram eller tilbake. Og antallet bokstaver fram eller tilbake vil man bruke på hver bokstav i hele meldingen.

Men I "One-Time pads" vil man ha et tilfeldig bokstav som blir erstattet for hver bokstav i meldingen. For eksempel kan man tenkte det på antall mulige kombinasjoner som i alfabetet, som er 29. Så en melding "hallo" vil få h=29, a=29, l=29, l=29, o=29. Altså 29 forskjellige kombinasjoner for hver bokstav. Så hele meldingen vil få 29x29x29x29x29=20 511 149 mulige kombinasjoner. Meldingen som blir sendt vil da være èn av de 20 511 149 mulige kombinasjoner, som vil være umulig å finne for en som ikke vet nøkkelen.

## 5. Hva står "AES" for?

Advanced Encryption Standard

## 6. Hvilke av disse er "AES" versjoner?

- AES-156
- AES-128
- AES-192
- AES-124
- AES-128
- AES-256
- AES-520

AES-128, AES-192 og AES-256. De er versjoner ut fra nøkkel-lengde.

## 7. Er "AES" 100% sikkert?

Ettersom AES ikke har noen kjente svakheter og med dagens datakraft, så kan vi anta at AES er 100% sikkert hvis vi antar at en angriper ikke kan få tak i nøkkelen og ikke har fysisk tilgang til systemet når den krypterer meldingen.

## 8. Hva er asymetrisk kryptering? (public key kryptering)
