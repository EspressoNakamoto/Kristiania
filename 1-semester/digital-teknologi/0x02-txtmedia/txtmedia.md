### Tegnsett og kodetabeller

1.  Hva er en glyf?  
    En glyf er et skjermbilde av et tegn som bestemmes av kodetabellen. Og hvordan den ser ut bestemmes av font tabellen.

2.  Hva er et charset/tegnsett?  
    Charset står for character set som er et sett med tegn som brukes for encoding.

3.  Skriv litt om kodetabellene ASCII, ISO-8859-1, Windows 1252 og forskjellen mellom de.

    - ASCII er basert på det engelske alfabetet og encoder 128 tegn på 7 bit presisjon.
    - ISO-8859-1 er basert på ASCII og er en standard for encoding av det latinske alfabetet. Det omfatter alle tegn i ASCII og de fleste spesialtegn i vesteuropeisk språk.
    - Windows 1252 la til tegnene som manglet fra ISO-8859-1 og har blitt foretrukket ovenfor ISO-8859-1.

4.  Hva er ulempen med ASCII-kodetabellen?  
    Ulempen med ASCII-kodetabellen er at det støtter bare det amerikanske alfabetet så det er nødvendig med alternative kodetabeller og fonter.

5.  Slå opp i ASCII-tabellen og fyll inn riktig svar.

    - 0x21 = !
    - 0x44 = D
    - 0x4F = O
    - 0x43 = C
    - 0x54 = T
    - 0x45 = E
    - 0x20 = space

6.  Hvorfor bruker ASCII kun syv bit?  
    For å unngå forvirring rundt positive og negative tall.

7.  Bruk ASCII-tabellen til åsortere tegnene under i riktig rekkefølge. Det med minst tallverdi i tabellen til venstre, høyest verdi til høyre.  
    A 
    2 
    ; 
    ">" 
    R 
    Y 
    V 
    ! 
    $
    
    = !, $, 2, ;, >, A, R, V, Y

8.  Parr tegnene til venstre med sine respektive ASCII-koder(Desimal).  
    A = 65  
    D = 68  
    y = 121  
    "+" = 43  
    / = 47

---

### UNICODE

1.  Skriv kort om UTF-8 og UTF-16, og forklar forskjellen mellom de.  
    UTF-8 og UTF-16 er en UNICODE standard. Begge krever opp til 32 bits per tegn. Forskjellen mellom de er at UTF-8 encoder de vanlige tegnene inkludert engelsk og tall ved bruk at 8 bits. Mens UTF-16 bruker minst 16 bits for hver tegn.

2.  Hva er prefix-en til Unicode?  
    U+

3.  Hva er spesielt med kodene U+000 til U+007F i Unicode?  
    Det er samme som ASCII som er 7 bit.

4.  Se videoen: The Unicode Consortium Overview (5 min) og skriv kort om hva Unicode er og hva det brukes til. https://www.youtube.com/watch?v=-n2nlPHEMG8&feature=youtu.be  
    Unicode er en universal standard for encoding og ble oppfunnet for å legge en base for all moderne programvare og IT protokoller. Det sier ikke noe om hvordan tegnene skal kodes binært. Det inneholder ASCII, ISO 8859-1 og inkluderer alle kjente tegn og emoji.

5.  Hva er strukturen til Unicode?  
    Det er delt i 17 plan som er på 65536 kodepunkter i hver. Det brukes 21 bit til kodepunkter. På plan 0 er det BMP(Basic Multilingual Plane), som er alle tegn som er i "vanlige" språk. Plan 1 er SMP (Supplementary Multilingual Plane), som er historiske språk(hieroglyfer), musikk(noter), emojis, spillkort osv. Plan 2 er de "uvanlige" kinesiske tegn. Plan 14 er spesialtegn for tagging av språk o.l. Og plan 15-16 er for privat bruk, som firmalogoer o.l kan registreres her.

6.  Hva brukes for å transformere Unicode-kodepunkter til binære tall, kan lese de og vise tegn på skjermen?  
    Det brukes charset for å transformere Unicode-kodepunkter til binære tall, det som er oftest brukt til det er UTF-8 og UTF-16.

7.  Tegn opp "vognene" i Unicode UTF-8 (7, 11, 16 og 21 bit). Hint: se slidesettet fra forelesningen.  
    Se [vogner](vogner.png)

8.  Forklar hva padding er i UTF-8 transformering.  
    Padding er 0 i vognene (fra forrige oppgave). Hvis vognene ikke fylles opp vil det bli fylt opp med padding.

9.  Regn disse punktene i UNICODE (se eksempel med karakteren "Å" forelesningen):  
    U+0042 = B
    U+0003 = 3  
    U+00F1 = ñ  
    U+0067 = g  
    U+0021 = !

10. Hvor mange adresselokasjoner kan adresseres dersom start- og stoppadressene er som angitt: 0x3CA8 og 0x3CFF?  
    Hvis man konverterer de heksadesimale tallene til desimal, får man 15528 og 15615. Differansen mellom disse er 87, men siden det første tallet er start, og det siste er stopp, teller begge tallene, og dermed blir svaret 1 høyere.

---

### Filformater

1.  Hva er data og metadata i filformater.  
    Data er selve informasjonen i en fil. Metadata er informasjon om hvordan filen skal behandles av programmet.

2.  Hva er et "magic number", hvorfor trenger man det?  
    Mange filformater starter med det, som fungerer som ID for filformatet. F.eks. .docm har "magic number" 504b0304.

3.  Hva er "magic number"-ene til filtypene .java, .exe og .pdf?  
    .java = CAFE BABE  
    .exe = MZ  
    .pdf = %PDF  

4.  Nevn noen typer tekst-filer, og noen typer binære filer.  
    Eksempler på tekst-filer er XML, HTML, CSS osv. Tekst-filer skal tolkes som tekst. Eksempler på binære filer er .exe, .dll, .bmp osv. Binære filer skal tolkes i henhold til gitt format(kompilerte programmer).

---

### Bilder, lyd og komprimering

1.  Gi eksempel på når man bruker CMYK og når man bruker RGB. Forklar også kort hva additiv og subtraktiv er og om CMYK og RGB er additive eller subtraktive.  
    Vi bruker RGB når det er digitalt og bruker CMYK når vi skal ha utskrift. Fordi RGB er additiv som betyr at det viser den fargen vi vil se. Mens CMYK er subtrakriv fordi "blekket" reflekterer bare den fargen vi vil se og absorberer de andre.

2.  Hva er bruksområdene for vektorgrafikk mot Bitmap?  
    Vektorgrafikk bruker man som regel til grafisk design og bitmap bruker man til detaljerte bilder og foto. Fordelen med vektorgrafikk er at det kan skalere uten å miste kvalitet og at det tar mindre plass ettersom det er laget av linjer av koder istedenfor pixler som i bitmap.

3.  Hvorfor komprimerer man filer, og hvilke typer fil komprimerer man ofte?  
    Man komprimerer filer for å spare plass. Grafikk og multimedia blir ofte komprimert. Vi har forskjellige typer komprimering som Run-length encoding, Frekvensavhengig koding, Relativ/diffrensiell koding og Ordbok-koding.

4.  Gitt setningen: «Min a_en år gamle ka_ var beta_ av en ha_ så han må_e på aku_sykehus» Finn ut hva _ er.  
    _ er tt