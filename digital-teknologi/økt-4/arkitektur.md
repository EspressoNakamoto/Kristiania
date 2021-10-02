### Boolsk Algebra

1.  Tegn opp grunnoperasjonene(porter/gates) med tilhørende sannhetstabell

    - NOT
    - AND
    - NAND
    - OR
    - NOR
    - XOR
    - XNOR

    Se [PDF](boolsk-algebra1.pdf)

2.  Regneoppgaver, bruk sannhetstabellene til grunnoperasjonene. Bruk penn og papir.

    - 1100 0010 **AND** 1100 0000 = 1100 0000
    - 0000 1100 **OR** 0000 1111 = 0000 1111
    - 0101 0010 **XOR** 1110 1101 = 1011 1111
    - **NOT** 0110 1111 = 1001 0000
    - 0000 1000 **NOR** 1111 0000 = 0000 0111
    - 1111 1111 **AND** 1111 1111 = 1111 1111
    - 1000 1001 **NAND** 0001 1001 = 1111 0110
    - 1010 1010 **AND** 0101 0101 = 0000 0000

3.  Hva brukes en 8-bits full adder til? Forklar med egne ord hvordan den fungerer.  
    En full adder brukes til å legge sammen bits. Så en 8-bits full adder er å legge sammen 8 bits tall. Det fungerer ved å starte på den første og legge til bits på full adder så hvis det er en i mente så går den over til neste full adder osv. til den har regnet ut hele 8-bits full adder.

4.  ASCII-koden for "F" er 0x46. Hvilket tegn/glyf får vi fra ASCII tabellen dersom vi utfører: 0x46 OR 0x20? Bruk penn og papir for utregning.  
    Se [bilde](boolsk-algebra4.png)

5.  Parr riktig logisk operator med bitwise operator.
    - NOT - ~
    - AND - &
    - OR - |
    - XOR - ^

---

### Regneoppgaver

1.  Følg stegene under:

    1.  Finn den heksadesimale verdien til tegnet ^ i ASCII-tabellen.  
        ^ = 0x5E
    2.  Gjør verdien til det binære tallsystemet.  
        0x5E = 0101 1110
    3.  Brukt AND-operasjonen med verdien du har funnet og 0110 0001.  
        0101 1110 AND 0110 0001 = 0100 0000
    4.  Gjør om det binære tallet du står igjen med til heksadesimal.  
        0100 0000 = 0x40
    5.  Finn tegnet til den heksadesimale verdien, dette er svaret på oppgaven.  
        0x40 = @

2.  (0x37 XOR 0xF3) XOR 0x37 = ? (Oppgi svar i heksadesimal)  
    0x37 XOR 0xF3 = 0011 0111 XOR 1111 0011 = 1100 0100  
    0x37 = 0011 0111  
    1100 0100 XOR 0011 0111 =1111 0011  
    1111 0011 = 0xF3

---

### Arkitektur

1.  Nevn noen av de viktigste elementene på et hovedkort.  
    CPU, BIOS, RAM, north bridge og south bridge.

2.  Gi eksempler på hva som kan kobles til et hovedkort.

    - CPU
    - GPU
    - HDD/SSD
    - RAM
    - På IO panelet kan man også koble på F.eks. mus, tastatur, skjerm osv.

3.  Forklar hva en GPU er.  
    GPU(Graphics Processing Unit) er enten noe man kan er for å vise grafikk på skjermen. Som vanlig kan man enten koble GPU på en PCI eller så kan en CPU innholde en GPU.

---

### CPU

1.  Hva er en instruksjon?  
    En instruksjon er gitt til en CPU som forteller hvordan den skal gjennomføre en spesifik oppgave.

2.  Forklar forskjellene mellom en CISC-prosessor og en RISC-prosessor.  
    CISC(Complex Instruction Set Computer) blir brukt til komplekse systemer som stasjonære pcer og servere. Mens RISC(Reduced Instruction Set Computer) blir mer brukt til mindre systemer som embedded og mobiler. CISC blir brukt til for kalkulering av større data og har instruksjoner som bruker mer enn en syklus for å bli utført. RISC blir brukt for systemer som er enklere og trenger en rask utførelse fra prosessoren og utfører en instruksjon per syklus. RISC bruker mer RAM enn CISC, så CISC bruker RAM mer effektivt.

3.  Finn ut av hva slags type prosessor du har i din PC og telefon, og hva slags ISA den prosessoren har.  
    PC: Intel Core i5-8250U, x86 64-bit  
    Telefon: Snapdragon 888 5G, ARMv8-A 64-bit

4.  Hva er en mikrokontroller og hvor brukes det?  
    En mikrokontroller er en mini-pc som konfigureres for å gjøre en spesifik ting. En mikroprosessor er i alle elektroniske ting som vaskemaskiner, routere, radioer, bankkort osv.

5.  Skriv kort om x86 instruksjonssett.  
    x86 blir brukt brukt på prosessorer med CISC arkitektur som er utviklet av Intel. x86 instruksjonssett er en liste over instruksjoner som en prosessor can utføre. I x86 finns det instruksjoner for data flytting(mov, push, pop), kontrolloverføring(je, jg, jmp, call, ret), aritmetikk/logisk(cmp, add, sub osv.), input/output og debug og interrupt håndtering(int, sti, hlt, nop). Det finnes også egne instruksjoner for flyttall, SIMD vektor og matriseinstruksjoner og egne instruksjoner for å endre prosessortilstand.

---

### Teknikker og begreper

1.  Hva er forskjellen på en system-klokke og en vanlig klokke.  
    En system-klokke holder bare takten, den viser ikke tiden som en vanlig klokke.

2.  Når du kjører et program på en datamaskin, hvor ligger det fulle programmet?  
    Når du kjører et program på datamaskinen vil du ta fra programmet som er lagret på HDD/SSD og kjøre programmet på RAM. Videre vil CPU-en få instruksjoner og data fra RAM via north bridge.

3.  Hvorfor har en CPU flere kjerner?  
    For å kunne kjøre programmer parallelt. Men det kan bare mulig hvis programmet har blit programmert sånn at det kan parallelliseres og ikke at den kan bare kjøres sekvensielt.

4.  Hva representerer minnehierarkiet?  
    Minnehierarkiet er for å få en forståelse på hvilket type minne som kan bli brukt for å oppnå mest effektivitet, mest sparsom eller enkel å eksessere.

5.  Ut ifra minnehierarkiet hva slags type lagring ville du brukt om du skulle lagret noe du bare trenge tilgang til hvert 5. år.  
    Jeg hadde brukt offline type lagring som en minnepenn eller harddisk. Minnepenn hvis det er lite data eller harddisk for større data.

6.  Hva brukes cache-minnet til?  
    Cache-minnet brukes for raskt tilgjengelighet. Når programmer kjøres, blir ca. 5% av koden kjørt ca. 95% av tiden. Så instruksjoner som skal utføres er lagret i cache i den rekkefølgen de skal utføres. Det medfører at det blir raskere å gjennomføre instruksjonene neste gang de kjøres. Vanlighvis vil cache også lagres i raskere lagring for raskere tilgjenglighet f.eks. på CPU-en.

7.  Hva går en CPU gjennom for å hente data fra RAM-en.  
    CPU-en må gå gjennom north bridge for å hente data fram RAM-en.
