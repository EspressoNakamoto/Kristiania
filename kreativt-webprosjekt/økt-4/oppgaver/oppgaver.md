1. Hvilke 3 måter kan CSS hentes inn HTML på?  
   Vi kan hente CSS ved å bruke inline måten, som er den minst optimale måten fordi man må skrive CSS på hver element man vil endre på. Internal måten skriver vi CSS i head, da kan vi også referere til flere elementer ved å bruke id og class. Så har vi den mest optimale måten ved å bruke external måten, hvor vi skriver CSS i en annen fil og linker til HTML siden vår. Dermed kan vi også bruke CSS koden til å linke til flere HTML sider.

2. Hvordan kan vi velge klassen i CSS fra eksempelet under?

   ```html
   <p class="Common">
     Perhaps we don’t always discriminate between senseand nonsense.
   </p>
   ```

   Vi må fortelle koden at vi vil referere til en class. For å referere til en class bruker vi "." f.eks:

   ```css
   .Common {
   }
   ```

3. Hvordan ville vi valgt etter id i CSS fra eksempelet under?

   ```html
   <p id="Unique">
     Perhaps we don’t always discriminate between sense andnonsense.
   </p>
   ```

   Vi må fortelle koden at vi vil referere til en id. For å referere til en id bruker vi "#" f.eks:

   ```css
   #Unique {
   }
   ```

4. Lag alle `<h1>` til `<h6>` tagger som id’er og gi de forskjellig RGB verdi sombakgrunnsfarge.  
   Se [oppgave4.html](oppgave4.html)

5. Forklar forskjellen mellom id og klasse attributt i html.  
   "id" attributt må være unik og kan bare bli brukt en gang per side. "class" attributt kan man bruke flere ganger på en side og trenger ikke å være unik.

6. I eksempelet under kan man i css bruke p, .message og #introduction til å endre paragraph. Hvilken vil css prioritere av p{color: blue}, .message{color:yellow} og #introduction{color:red}?

   ```html
   <p class="”message”" id="”introduction”">
     HTML is about content and CSS isabout style.
   </p>
   ```

   CSS vil prioritere `#introduction{color:red}` først fordi `id` er mest unik. `.message{color:yellow}` er andre prioritet fordi `class` er mindre unik enn `id`. Så til slutt så vil `p{color:blue}` bli prioritert minst fordi den omfanger alle `p` elementer.

7. Hva er en psudoklasse?  
   En psudoklasse er for å definere tilstanden til velger.

8. Nevn minst 3 psudoklasser.  
   link, active, hover og visited.

9. Forklar hva :link og :visited gjør.
   `:link` velger alle ubesøkte linker. `:visited` velger alle besøkede linker.

10. Forklar :hover og :active.  
    `:hover` velger linker som har mus over. `:active` velger linker som blir trykket på.
