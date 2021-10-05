### OS

1.  Forklar med egne ord hva et operativsystem er og hvorfor man trenger/ikke trenger et OS.  
    Et operativsystem gir ut grensesnitt mellom bruker og hardware. Operativsystemer som Microsoft Windows, MacOS og Linux har GUI grensesnitt som gir brukere en enklere måte å hamhandle på. Man trenger ikke et OS når man skal ha maskinene til å kjøre en spesifik oppgave eller på en mikroprosessor.

2.  Hva betyr abstraksjon i OS sammenheng?  
    Det er fordi OS som MacOS og Microsoft Windows gir et veldig enkelt brukergrensesnitt for brukeren men "under the hood" skjer det mye mer enn man tror. Når man f.eks. åpner ett program så skjer mye mer som man ikke legger merke til som kommunikasjon mellom komponenter, filoverføringer osv. Det vil si også bare en vanlig fil inneholder metadata som brukeren vanlighvis ikke trenger å tenke på.

3.  Hva er forskjellen på Monolithic kernel og Micro kernel?  
    I en Monolithic kernel er koden skrevet sånn at alt er koblet sammen til ett objekt. Det er effektivt fordi det bruker ikke tid til å hente informasjon fra forskjellige "services" som fil server, network server osv. fordi det er koblet sammen. Mens det gjør det mer effektivt så er det mer kompleks som gjør det mer utsatt for kræsj. Hvis det skjer noe feil i en del av kernel så vil hele kræsje.  
    I Micro kernel er alt delt opp f.eks. i file manager server, display server osv. Det vil si at microkernel må kommunisere med de forskjellige serverne og applikasjonen. Meldingsutvekslingen er ineffektivt fordi det tar tid å kommunisere med de forskjellige delene. Ulempen med Micro kernel også er at det er minimal funksjonalitet. Men fordelen er at det er modulært og utvidbart.

4.  Hva er de viktigste funksjonene i operativsystemer?  
    Operativsystemet er den som kobler til hardware og bestemmer hvordan de skal brukes. Så operativsystemet har ansvaret på håndering av ressurser, maskinvare, nettverk og sikkerhet. I tillegs så må operativsystemet klare å kjøre applikasjonene og gi brukeren et brukergrensesnitt.  
    Hovedfunksjonene til operativsystemet er behandlig av det interne, prosesser, minne, disk, utstyr, nettverk og service programmer.
    

5.  Forklar kort hva en ressurs er i sammenheng med et OS.  
    Ressurs er de tingene et program trenger for å kjøre ferdig. F.eks CPU, RAM, I/O.

---

### Kjernen

1.  Forklar hva som skjer i en oppstart av en maskin med operativsystem.  
    1. Hent bootstrap
    2. Hent Boot-loader
    3. Hent OS
    4. Initialiser maskinvare
    5. Lag brukergrensesnitt
    6. Start faste programmer

2.  Hva er en kjerne/kernel og hva har den for oppgaver?  
    En kernel har som oppgave å starte opp og konfigurere hardware og administrere prosesser, tråder og ressurser.

3.  Hva er risikoene ved å kjøre på kjernemodus?  
    Hvis man kjører ett program på kjernemodus så har man full tilgang til å gjøre hva som helst på datamaskinen. Som vil si at programmet har tilgang til hele minnet, alle instruksjoner kan kjøres og det er ingen sikring fra hardware. Hvis programmet er kodet feil så kan det kræsje systemet eller hvis programmet er ett virus så har den tilgang til å gjøre hva den vil. Så for sikkerhet, ting som vi ikke vil ha tilgang til alt kjører vi i brukermodus.

4.  Når skal man kjøre på bruker- vs kjernemodus i et OS?  
    Man skal kjøre i kjernemodus når man vil ha tilgang til hele minnet og alle instruksjoner. F.eks. OS må ha tilgang til hele minnet når den skal gi et program en del av minnet.

5.  Hva er en prosess og en tråd, og hva er forskjellen mellom de?  
    