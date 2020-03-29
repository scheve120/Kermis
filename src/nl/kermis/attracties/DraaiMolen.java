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
    void initDraaimolen(int bezoeker) {

//        boolean bool;
        switch (bezoeker) {
            case 1:
                System.out.println(attractie+entreeKosten);
                break;
            case 2:
                draaien();
                System.out.println("Dit koste u € " + entreeKosten);
                break;
            case 3:
                break;
            default:
                System.out.println("Wat wil je doen?");
        }
    }

    private boolean isOpen() {
        Random openDicht = new Random();
        boolean open;
        int openOfDicht = openDicht.nextInt(4) + 1;

        if(openOfDicht > 2) {
            open = true;
        } else {
            open = false;
        }
        return open;
    }

    @Override
    void draaien() {
        String bericht;
        if(isOpen()) {
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

    void onderHoud() {

    }
}
