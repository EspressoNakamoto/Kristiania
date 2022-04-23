# Modeller, standarder, lover og penetrasjonstesting

## 1) Hva er en sikkerhetsmodell?

En sikkerhetsmodell er en abstraksjon som bidrar administratorer med å spesifisere sikkerhetspolicy.

I en sikkerhetsmodell er det typisk et hierarki av adgangs- og modifiserings-rettigheter som blir tildelt ansatte i en organisasjon basert på stilling.

## 2) Hva er «DAC» (Discretionary Access Control)?

DAC er en adgangskontroll der brukerne selv gis mulighet til å bestemme hvilke rettigheter som skal gjelde for egne filer.

## 3) Hva er «MAC» (Mandatory Access Control)?

MAC er mer restriktiv en DAC hvor det ikke tillater brukere selv å bestemme rettigheter på filer og ressurser. Alle sikkerhetsavgjørelser foretas av en sentral policy administrator.

## 4) Nevn og beskriv minst to ulike adgangskontroll-modeller

**Bell-La Padula (BLP)** modellen er en MAC modell for å beskytte konfidensialitet. Det har en streng lineær orden av brukernivåer for dokumenter og adgang. En bruker kan lese alle dokumenter på eget klareringsnivå og under. En bruker kan skrive på eget klareringsnivå og oppover men kan ikke skrive til et lavere nivå. Altså informasjonsendringer flyter bare oppover. Dette er for å forhindre lekkasje.

Ulempen med BLP modellen er at den har en stor svakhet. Modellen forutsetter at vi vet hvordan informasjonen er kodet. Det tar ikke i hendhold om andre uforutsette kanaler, som steganografi ol.

**BiBa** modellen ligner på BLP men er mer for å beskytte integritet foran konfidensialitet. Integritetsnivåer defineres for brukere og objekter. For brukere vil en mangeårig ansatt ha en høyere integritetsnivå enn en nyansatt. For objekter vil f.eks. et dokument lagret på en server vil nok ha høyere integritetsnivå enn en fil på en laptop.

Reglene for BiBa modellen er motsatt av i BLP modellen. Reglene i BiBa modellen tillater ikke lesing fra lavere nivå eller skriving til høyere. Det vil si at informasjonsendringer skal bare flyte nedover.

## 5) Hvordan ser sikkerhetsprosessen ut?

Sikkerhetsprosessen har 5 steg:

1. Vurdere risiko av verdier, trusler og tap

2. Utforme policy for informasjon, systemer, bruk, backup, tilgang, hendelser og avbruddsplan

3. Innføre rapportering, autentisering, innbruddsdeteksjon, kryptering og fysisk sikkerhet

4. Opplæring av ansatte, ledere, utviklere og sikkerhetsansatte

5. Revisjon av etterlevelse, periodisk vurdering og innbruddstesting

## 6) Beskriv "Standard: ISO 27000"

ISO 27000 er en standard for sikkerhetsteknikker og beskriver formålet med et ISMS. Det blir brukt for å administrere informasjonssikkerhets-risikoer i et organisasjon.

ISO 27000 fokuserer på sikring av tilgjengelighet, integritet og konfidensialitet av informasjon. Sikringen foretas gjennom et sett kontroller som angir konkrete krav. Kontrollene beskrives og vedlikeholdes i organisasjonen. Standarden kan opprettholdes og dokumenteres gjennom en sertifiseringsordning, og kontrolleres via intern og ekstern revisjon.

## 7) Hva er "PCI DSS"?

PCI DSS står for Payment Card Industry Data Security Standard som kort-leverandører som Visa og Mastercard bruker. PCI DSS stiller krav til sikring av kunde, leverandør og transaksjon. Det må sertifiseres og revideres etter denne standarden dersom man skal f.eks. drive en server-farm for en bank, nettbutikk e.l.
