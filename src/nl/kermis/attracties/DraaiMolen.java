package nl.kermis.attracties;

import java.util.Random;

/*
Hier komt de functionaliteid van de draaimolen.
Zoals wat zijn de draai en onderhouds kosten.
En wat kost een ritje in de draaimolen en tevens ook hoe veel kost het totaal als bezoeker of bezoekers een ritje gaan maken.
 */
class DraaiMolen extends Attractie {

    DraaiMolen() {
        entreeKosten = kostenRitjeDraaimolen();
        draaimolenOpenOfDicht();
//        initDraaimolen(String );
    }

    DraaiMolen(String init) {

    }

    /*
    initDraaimolen start de initializatie van de draaimolen.
    Hier wordt gekeken wat de input wordt van de gebruiker.
    Wil hij de ticket prijs van de draaimolen weten?
    Of als hij ritje maakt hoeveel gaat het kosten?
    En zo niet moet de bezoeker terug naar kies een attractie of hij verlaat de kermis.
     */
    public void draaimolenOpenOfDicht () {
        if (isOpen() || onderHoud() ) {
//            attractieOpen = isOpen() && onderHoud();
            attractie = "Draaimolen is open";
            attractieOpen = true;
        } else if (isOpen()) {
            attractie = "Draaimolen is niet open";
            attractieOpen = false;
        } else {
            attractie = "Draaimolen is in onderhoud";
            attractieOpen = false;
        }
    }
    private boolean isOpen() {
        Random openDicht = new Random();
        boolean open;
        int openOfDicht = openDicht.nextInt(6) + 1;
        open = 2 < openOfDicht && onderHoud();
        return open;
    }

    @Override
    void draaien() {
        String bericht;
        if(attractieOpen) {
            System.out.println("De draaimolen gaat rond en rond en rond....");
        } else {
            System.out.println("De draaimolen is niet open");
            entreeKosten = 0;
//            System.out.println("U heef nu wind gekocht voor " + entreeKosten);
        }
    }

    String ritjedraaimolen() {
        return "je gaat nu in de draaimolen kosten zijn:  €";
    }

    double kostenRitjeDraaimolen() {
        this.attractie = "Deze Attractie kost € ";
        return 1.50;
    }

    void draaikostenDraaimolen() {

    }

    private boolean onderHoud() {
        Random openDicht = new Random();
        boolean onderhoud;
        int inOnderhoud = openDicht.nextInt(6) + 1;
        onderhoud = 2 < inOnderhoud;
        return onderhoud;
    }
}
