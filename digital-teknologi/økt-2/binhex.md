# BinHex

### Binær koding

1. Hvilke ulike måter er det vist i forelesning at man kan representere karakterene i ASCII tabellen?  
   Dec, Hex, Oct, HTML og Char.

2. Hvilke hovedtyper data, eller informasjon, behandler en datamaskin?  
   En generell datamaskin behander 5 hovedtyper informasjon, numerisk(tallberegninger), karakterbasert(tekstmanipulasjon), visuell(bilder), audio(lyd) og instruksjoner(interne ordre til CPU'en og hva den skal gjøre).

3. Fyll inn tabellen under.  
   2⁰ = 1  
   2¹ = 2  
   2² = 4  
   2³ = 8  
   2⁴ = 16  
   2⁵ = 32  
   2⁶ = 64  
   2⁷ = 128  
   2⁸ = 256  
   2⁹ = 512  
   2¹⁰ = 1028

4. Hvor mange bitmønstre (forskjellige kombinasjoner av 0 og 1) kan du lage med 8 bits?  
   256 fordi 2⁸ = 256

5. Hva har det binære tallsystemet som base?  
   Det binære tallsystemet har 2 som base fordi den har bare 2 symboler.

6. Hvorfor bruker vi presisjon? Nevn 4 vanlige presisjoner.  
   Presisjon bruker vi når vi skal finne ut hvor detaljert regning vi vil ha. De 4 vanlige presisjoner er Byte(8 bit), Word(16 bit), Dword(32 bit) og Qword(64 bit).

7. Fyll inn tallene som skal erstatte x i utrekningene under.  
   0001 = 0 + 0 + 0 + 2⁰ = 0 + 0 + 0 + 1 = 1  
   0010 = 0 + 0 + 2¹ + 0 = 0 + 0 + 2 + 0 = 2  
   0011 = 0 + 0 + 2¹ + 2⁰ = 0 + 0 + 2 + 1 = 3  
   0100 = 0 + 2² + 0 + 0 = 0 + 4 + 0 + 0 = 4  
   0101 = 0 + 2² + 0 + 2⁰ = 0 + 4 + 0 + 1 = 5  
   0110 = 0 + 2² + 2¹ + 0 = 0 + 4 + 2 + 0 = 6  
   0111 = 0 + 2² + 2¹ + 2⁰ = 0 + 4 + 2 + 1 = 7  
   1000 = 2³ + 0 + 0 + 0 = 8 + 0 + 0 + 0 = 8  
   1001 = 2³ + 0 + 0 + 2⁰ = 8 + 0 + 0 + 1 = 9  
   1010 = 2³ + 0 + 2² + 0 = 8 + 0 + 2 + 0 = 10

8. Fyll inn tabellen under, skriv det ned på papir.  
   4⁰ = 1  
   4¹ = 4  
   4² = 16  
   4³ = 64  
   4⁴ = 256  
   4⁵ = 1024  
   4⁶ = 4096  
   4⁷ = 16 384  
   4⁸ = 65 536  
   4⁹ = 262 144  
   4¹⁰ = 1 048 576

---

### Konvertering

1. Konverter disse tallene fra binærtall(base 2) til desimaltall(base 10)

- 1111 1111 = 255
- 0000 0000 = 0
- 1001 1001 = 153
- 1100 0011 = 195
- 1010 1010 = 170
- 0100 0101 = 69
- 0010 1101 = 45
- 1011 0010 = 178

2. Konverter disse tallene fra desimaltall(base 10) til binærtall(base 2)

- 21 = 0001 0101
- 9 = 1001
- 16 = 0001 0000
- 196 = 1100 0100
- 232 = 1110 1000
- 72 = 0100 1000
- 32 = 0010 0000
- 256 = 0001 0000 0000

---

### Addisjon binært

1. Adder disse tallene, bruk en byte (8 bit) presisjon.

- 0000 0000 + 0010 0010 = 0010 0010
- 1001 1001 + 0110 0110 = 1111 1111
- 0001 1010 + 0000 0101 = 0001 1111
- 1111 1111 + 0001 0000 = 0000 1111
- 1111 1010 + 0101 0110 = 0101 0000
- 1010 1010 + 0001 0101 = 1011 1111
- 0110 0110 + 1100 1100 = 0011 0010
- 1011 1100 + 0001 0011 = 1100 1111
- 1100 1001 + 1111 1001 = 1100 0010
- 1010 1000 + 1110 1010 = 1001 0010

2. Adder disse tallene. Oppgi svaret i en word(16 bit) presisjon.

- 0000 0000 0000 0000 + 0101 1110 1100 1000 = 0101 1110 1100 1000
- 1001 1001 1001 1001 + 0110 0110 0110 0110 = 1111 1111 1111 1111
- 0001 0111 0110 1001 + 0010 1010 1001 = 0001 1010 0001 0010
- 1111 0101 0001 + 0100 0110 1101 0011 = 0101 0110 0010 0100
- 1010 0110 1101 1010 + 0101 1010 0110 1111 = 0000 0001 0100 1001

---

### Enerkomplement og toerkomplement

1. Hva er enerkomplement og hva er toerkomplement?

- Enerkomplement er å flippe alle tallene (0 til 1 og 1 til 0). Det er for å vise negative tall i gamle pc'er.
- Toerkomplement er å flippe alle tallene (0 til 1 og 1 til 0) men også legge til 1. Det er for å å vise negative tall i nyere pc'er.

2. Bruk enerkomplement på disse(5) tallene:  
   0000 = 1111  
   0101 = 1010  
   1100 1110 = 0011 0001  
   0011 0001 1111 0000 = 1100 1110 0000 1111  
   1010 0011 = 0101 1100

3. Hvorfor trenger man presisjon i toerkomplement?  
   For at vi kan ignorere overflow.

4. I 8 bit presisjon, hva er det største og det minste tallet man kan representere binært uten toerkompliment?  
   I 8 bit presisjon er det største tallet 1111 1111 som er 255. Det mistre tallet er 0000 0000 som er 0.

5. I 8 bit presisjon, hva er det største og det minste tallet man kan representere med toerkomplement?  
   Det største tallet man kan representere med toerkomplementet i 8 bit presisjon er 0111 1111 som er 127. Og det minste er 1000 0000 som er -128.

6. Hvilken bit er det som gjør at et tall er negativt i toerkomplement?  
   Første bit/høyste bit.

7. Sant / Usant: Man kan ikke se av seg selv om et binærtall er på toerkomplementform, det er noe man må få oppgitt.  
   Sant.

8. Hva er «the silly number»? Også kjent som «tulletallet».
   -128 er kjent som tulletallet fordi det finnes ingen positiv versjon av det.

9. Forklar og vis med eksempler hva overflow er, i 8 bits presisjon.  
   Overflow er når man driver med en spesifik presisjon og man får ett tall høyere en angitt presisjon. F.eks i 4 bit presisjon: 1111 + 0001 = 0001 fordi uten presisjon ville svaret blitt 0001 0000 som er 8 bit.

---

### Konvertering toerkomplement

Konverter binærtallene på toerkomplement med 8 bits presisjon under til desimaltall. Bruk penn og papir.

1. 1111 1111 = (-128) + 64 + 32 + 16 + 8 + 4 + 2 + 1 = -1
2. 0000 1000 = 8
3. 1000 0000 = -128
4. 1110 0000 = (-128) + 64 + 32 = -32
5. 0010 0000 = 32
6. 0110 0010 = 64 + 32 + 2 = 98
7. 1100 1000 = (-128) + 32 + 8 = -56
8. 1111 0111 = (-128) + 64 + 32 + 16 + 4 + 2 + 1 = -9

Konverter desimaltallene under til binærtall på toerkomplementmed 8 bits presisjon. Bruk penn og papir.

1. 10 = (-128) + 8 + 2 = 0000 1010
2. -8 = (-128) + 64 + 32 + 16 + 8 = 1111 1000
3. -77 = (-128) + 32 + 16 + 2 + 1 = 1011 0011
4. 69 = 64 + 4 + 1 = 0100 0101
5. -42 = (-128) + 64 + 16 + 8 = 1101 1000
6. -153 = Ingen løsning, tallet er utenfor presisjon som er oppgitt
7. -12 = (-128) + 64 + 32 + 16 + 4 = 1111 0100

---

### Subtraksjon og toerkomplement

Subtraher tallene under ved hjelp av toerkomplement med 8 bits presisjon. Oppgi svaret i binærtall (base 2) og vis utregning. Bruk penn og papir.

Se [PDF](subtraksjon-og-toerkomplement.pdf)

---

### Heksadesimal

1. Hvorfor bruker vi heksadesimale tall?  
   Fordi vi kan skrive binærtall mer kompakt.

2. Hva er prefix-en for heksadesimale tall?  
   Prefiks-en for heksadesimale tall er 0x, f.eks. **0x**7F = 127 = **0b**0111 1111.

3. Hvor stor er en nibble?  
   En nibble er en gruppe med fire binærtall eller fire bits.

4. Skriv alle tall sifrene i det heksadesimale tallsystemet.  
   0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.

5. Hvor mange heksadesimale siffer trenger man for å representere 16 bit?
   Man trenger 2 heksadesimale siffer for å representere 16 bit. Siden F er det høyeste som er 15.

---

### Konvertering heksadesimal

Konverter tallene under fra det binære tallsystemet (base 2) til det heksadesimale tallsystemet (base 16).

1. 1000 = 0x8
2. 0010 1101 = 0x2D
3. 0101 1100 = 0x5C
4. 1110 1110 = 0xEE

Konverter tallene under fra det heksadesimale tallsystemet (base 16) til det binære tallsystemet (base 2).

1. 0x2 = 0010
2. 0xFF = 1111 1111
3. 0xD3 = 1101 0011
4. 0x5F = 0101 1111

Konverter tallene under fra det heksadesimale tallsystemet (base 16) til det desimale tallsystemet (base 10).

1. 0x3 = 0010 = 3
2. 0xAB = 1010 1011 = 171
3. 0xFF = 1111 1111 = 255
4. 0x01 = 0000 0001 = 1

Konverter tallene under fra det desimale tallsystemet (base 10) til det heksadesimale tallsystemet (base 16).

1. 7 = 0111 = 0x7
2. 130 = 1000 0010 = 0x82
3. 54 = 0011 0110 = 0x36
4. 23 457 = 0101 1011 1010 0001 = 0x5BA1

---

### Addisjon heksadesimal

Legg sammen tallene, og oppgi svaret på base 16 (heksadesimalt), bruk penn og papir. (Flere konverteringer kan være nødvending underveis)

Se [PDF](addisjon-heksadesimal.pdf)

---

### Subtraksjon heksadesimal

Subtraher tallene, og oppgi svaret på base 16 (heksadesimalt), bruk penn og papir. (Flere konverteringer kan være nødvendig underveis)

Se [PDF](subtraksjon-heksadesimal.pdf)

---

### ASCII

1. Bruk ASCII-tabellen og finn disse tegnene. Hva er heksadesimale tallet til hvert tegn?

- G - 0x47
- % - 0x25
- = - 0x3D
- } - 0x7D
- h - 0x68
- q - 0x71

2. Skriv ditt eget navn i heksadesimal fra ASCII tabellen på både store og små bokstaver.  
   0x50 65 74 65 72 20 54 76 65 69 74

3. Hva er forskjellen på 0x41 og 0x61?
