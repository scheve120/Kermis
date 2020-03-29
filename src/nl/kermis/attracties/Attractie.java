package nl.kermis.attracties;

import java.util.Random;

abstract class Attractie { // Deze class moet eigenlijk abstract zijn.

    protected double entreeKosten;
    protected int aantalpersonen;
    protected String attractie;
    protected String info = "";
    protected String bezoeker = "";

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

    void initAttractie() {

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
        this.attractie = "Je gaat nu naar de botsautos";
        this.entreeKosten = 20;
    }
}

class SchietTent extends Attractie {
//    int entreeKosten;

}