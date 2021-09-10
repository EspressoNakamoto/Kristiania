# HTML og CSS

1.  Hva brukes CSS til?  
    CSS brukes til å endre utseende til en HTML side.

2.  Hva er en CSS-regel og hva er oppbygningen av den?  
    En CSS-regel er en kode som velger et element, og gir den en deklarasjon. CSS-regel er en velger + en deklarasjon. F.eks. `h1 {color: red}`. Hele koden er en regel.

3.  Hva er en CSS-velger (selector)?  
    En CSS-velger (selector) er brukt til å velge en HTML kode. F.eks. `h1 {color: red}`, hvor "h1" er en CSS-velger.

4.  Hvilke CSS-velgere finnes?  
    Det finnes enkle selectors som er basert på navn, id, class. Men det finnes også Combinator selectors, Pseudo-class selectors, Pseudo-elements selectors og Attribute selectors.

5.  Hva er forskjellen mellom id- og class-velgerne i CSS?  
    id kan man bare bruke til en element. class kan man gi til flere elementer.

6.  Legg til tekst i en h1-tag. Endre på tekstfargen og størrelsen på deler av teksten/bokstavene slik at du får en kreativ og fargerik tekst. Hint: span.  
    Se [oppgave6.html](oppgave6.html)

7.  Hvordan kan man få tekst til å være høyrejustert istedenfor venstrejustert?  
    Man kan bruke text-align attributen. F.eks. `text-align: right;`

8.  Hvordan endrer man bildestørrelse med CSS?  
    Man kan bruke width attributen. F.eks. `width: 50px`

9.  Hvordan lager man interne lenker slik Wikipedia bruker i Contents-boksen: https://en.wikipedia.org/wiki/HTML  
    Man bruker id og href attributen. F.eks:

    ````html
    <a href="text">link til paragraf</a>

    <p id="text"></p>
    ```
    ````

10. Hva er hensikten med div-tagen?  
    div-tagen definerer en seksjon i en HTML-dokument og blir brukt som en container for HTML elementer.

11. Er det riktig at en id bare brukes kun på ett element i et HTML-dokument?  
    Man kan ha fler id tagger i et HTML-dokument, men man må ha en unik id på et element.

12. Boksmodellen (engelsk: box model) viser til tre egenskaper. Hvilke tre er disse og hva er de til?  
    Padding, som lager plass rundt innholdet. Padding er også gjennomsiktig. Border, er en grense som går rundt padding. Border er ikke gjennomsiktig. Margin, lager plass rundt utenfor border. Margin er gjennomsiktig.

13. Kan man sette bakgrunnsfarge på egenskapen margin?  
    Nei, margin er gjennomsiktig.

14. Hvordan kan man slå sammen border-color, border-style og border-width?  
    Du kan had alt i "border". F.eks:
    `css {border: solid coral 10px;} `

15. Hva er CSS web tiling? Opprett noen divisjoner hvor du tiler bakgrunnen på dem.  
    Web tiling er seksjoner av en webside. Se [oppgave15.html](oppgave15.html)

16. Hva styrer repeat-x og repeat-y? Hvilke andre verdier finnes det som kan angis i denne sammenheng?  
    Når du angir f.eks. en `backgroud-image` så kan du legge til en `background-repeat: repeat-x repeat-y;`. Det koden forteller er at bakgrunnsbildet skal gjenta seg i x-aksen og i y-aksen. Verdiene man kan bruke til `background-repeat` er repeat, repeat-y, repeat-x, no-repeat, space, round, initial og inherit.

17. Test ut egenskapen min-width på en div som du gir bredde, høyde og bakgrunnsfarge en nettside.  
    Se [oppgave17.html](oppgave17.html)

18. Hva er white-space egenskapen for?
    White-space egenskapen spesifiserer hvordan innhold i et element blir håndtert i forhold til skjermen.

19. Hva skjer når du bruker negativ verdi på margin? Test ut ved å ha to synlige elementer ved siden av hverandre.  
    Se [oppgave19.html](oppgave19.html). Negativ verdi på margin vil håntere elementet som mindre enn det den egentlig er.

20. Kan man ha forskjellige størrelser på marginen på forskjellige sider av et element? Gjelder det samme mht. border og padding?  
    Ja, fordi man kan bruke f.eks. `margin-top` istedenfor bare `margin`. Og vi har det for alle sider, top, right, bottom og left. Det fins properties for alle sider i boks-modellen.
    Eksempel:

        ```css
        /* Istedenfor */
        img {
            margin: 10px;
        }
        /* Bruk */
        img {
            margin: 10px 20px 30px 40px;
        }
        /* Eller */
        img {
            margin-top: 10px;
            margin-bottom: 20px;
            margin-left: 30px;
            margin-right: 40px;
        }
        ```

21. Kan man sette forskjellige farger på forskjellige sider av en borderfor eksempel at border på toppen av et element er rød og border på bunn er blå?  
    Ja, man må definere hvilken side man vil ha rød og blå på.

        ```css
        img {
            border-top: red;
            border-bottom: blue;
        }
        ```
