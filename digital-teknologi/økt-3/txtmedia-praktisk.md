# Textformater og HexEditor

## Spørsmål 1
**Hvorfor leder de ulike kodingstypene til filer med ulike størrelse.**

Fordi det er forskjellige måter å representere dataene på. Og de forksjellige måtene å encode filene bruker forskjellige tegn og forskjellige antall tegn. Derfor kan samme fil inneholde mer fordi en encoding type bruker flere tegn.

## Spørsmål 2
**Nå skal du åpne filen som er lagret i det Windows Notepad kaller ANSI-format i Hexeditoren din. Hva er den hexadesimale og desimale ("titalls") koden for stor Å i Windows ANSI-format (Windows-1252)?**

Den hexadesimale koden for "Å" er `0xC5` og desimale er `197`.

## Spørsmål 3
**Åpne nå filen med Unicode Big Endian koding av texten, og klikk på det området i bildet under som inneholder koder som IKKE befant seg i den opprinnelige teksten (, og vanligvis heller ikke vil fremvises som text).**
**Framgangsmåte: Sammenlign med innholdet i den opprinnelige filen. Ta hensyn til at dette formatet (Unicode kodet som UTF-16) benytter 16 bit pr tegn, mens den opprinnelige ("ANSI") bruker en byte. Finn hvilke byte som har blitt føyd til av Notepad når den lagret filen som "Unicode Big Endian".**

- **Du bør også sammenligne med filen som er lagret som "bare Unicode". Hva er forskjellen?**  
Forskjellen er at 
- **Du bør også prøve å fjerne disse ekstra tegnene i Hexeditoren, lagre filen, og se hvordan den da blir seende ut i Notepad.)**

