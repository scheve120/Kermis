package nl.kermis.attracties;

import java.util.Random;

abstract class Attractie { // Deze class moet eigenlijk abstract zijn.

    protected double entreeKosten;
    protected int aantalpersonen;
    protected String attractie;
    protected boolean attractieOpen;
    boolean bezoeker;

    Attractie() {

    }

    Attractie(String attractie, int prijs) {
        this.entreeKosten = prijs;
        this.attractie = attractie;
    }

    Attractie(int personen) {
        this.aantalpersonen = personen;
    }

    Attractie(double entreePrijs1) {

    }

    Attractie(String test) {

    }

    void initAttractie(int bezoeker) {
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

    void draaien() { // zou ook abstract kunnen zijn.
        System.out.println("De attractie gaat nu draaien");
    }
}

class BotsAutos extends Attractie {

    BotsAutos() {
        rondjeBotsautos();
    }

    void rondjeBotsautos() {
        this.attractie = "Deze Attractie kost € ";
        this.entreeKosten = 2.00;
    }
}

class SchietTent extends Attractie {
//    int entreeKosten;

}