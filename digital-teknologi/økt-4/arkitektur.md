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
    