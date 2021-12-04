# 1. Transportlaget

## a) Kort forklart, hva er hensikten med transportlaget?

Transportlaget er for håndtering av transport av applikasjonsmeldinger mellom klient og tjener til en applikasjon. Det overføres datasekvenser av variabel lengde samtidig som kvaliteten på QoS opprettholdes.

## b) Hvilke typer protokoller brukes i transportlaget?

Det er to typer protokoller i transportlaget, [TCP](https://en.wikipedia.org/wiki/Transmission_Control_Protocol) og [UDP](https://en.wikipedia.org/wiki/User_Datagram_Protocol). TCP(Transmission Control Protocol) oppretter en fast forbindelse og legger inn flyt-kontroll, sekvens-nummer, kvittering, tidskontroll, feilsjekking og kontroll av trafikk-kork. UDP(User Diagram Protocol) sender et datagram som kan bestå av flere deler og håper på at det kommer frem, legger til også ende-til-ende kontroll og feil-sjekking. TCP blir brukt til forbindelsesorientere overføringer mens UDP blir brukt til simplere overføringer.

## c) Forklar med tegning hvordan multipleksing og demultipleksing fungerer.

## d) Hva er et portnummer, og hvilken fordel gir det oss når vi sender data fra en maskin til en annen?

Portnummer er en type ID som brukes for å si hvilken applikasjon som skal motta den. Det er en fordel når man sender data til hverandre at applikasjonen vet hvor på maskinene dataen bli sendt til og fra.

## e) Hva menes med en "trafikk-kork"?

Trafikk-kork er når det er for mange kilder som sender for mye data for fort til at de som skal transportere dataen ikke klarer å håndtere det. Som oftest skjer trafikk-kork i ruterne som skaper nettverket dataen skal transporteres på. Problemet når det er trafikk-kork er at pakker kan bli tapte eller at det blir lange forsinkelser fordi det er kø.

## f) Sett sammen
