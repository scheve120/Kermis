package nl.kermis.attracties;

import java.util.Scanner;

class Attractie {
    String kiesAttractie;
    int personen;

    Attracties aantalpersonen = new Attracties();
    Attracties naardraaimolen = new DraaiMolen();
    Attracties naarbotsautos = new BotsAutos();

    void welkeAttractie(Scanner userInput) {
        Attracties kermis = new Attracties();
        kermis.info = "Naaar welke attractie wil je?";
        if(userInput.nextLine().equals("Draaimolen")) {
            System.out.println(naardraaimolen.attractie);
            attractieDraaimolen(userInput);
        } else {
            System.out.println("Deze attractie is er er niet.");
        }
    }

    void attractieDraaimolen(Scanner init) {
        String SwitchTest = "";
        aantalpersonen.info = "Info";
        System.out.println(aantalpersonen.info);

        if(init.nextLine().equals("Test")) {
            System.out.println(naardraaimolen.info + naardraaimolen.attractie + naardraaimolen.entreeKosten);
        } else {
            System.out.println(naardraaimolen.attractie);
        }
    }
}

class Attracties {

    double entreeKosten;
    int aantalpersonen;
    String attractie;
    String info = "Test";

    Attracties() {

    }

    Attracties(String attractie, int prijs) {
        this.entreeKosten = prijs;
        this.attractie = attractie;
    }

    Attracties(int personen) {
        this.aantalpersonen = personen;
    }

    Attracties(double entreePrijs1) {

    }

    void initAttracties() {

    }
}

class DraaiMolen extends Attracties {

    DraaiMolen() {
        initDraaimolen();
    }

    DraaiMolen(String init) {

    }

    void initDraaimolen() {

        this.attractie = "Welkom bij de draaimolen. Hoeveel kaartjes wil je? Zeg info voor prijs";

        if(this.info.equals("Info")) {
            this.entreeKosten = this.kostenRitjeDraaimolen();
        } else if (this.info.equals("Ritje")) {
            Kassa entreeprijs = new Kassa();
            this.entreeKosten = entreeprijs.draaimolenEntreePrijs(10, kostenRitjeDraaimolen());
            this.attractie = this.ritjedraaimolen();
        } else if(this.info.equals("Draaimolen")) {
            this.entreeKosten = kostenRitjeDraaimolen();
            this.attractie = "Draaimolen";
        } else {
            this.attractie = "Welkom bij de draaimolen. Hoeveel kaartjes wil je? Zeg info voor prijs";
        }
    }

    String ritjedraaimolen() {
        return "je gaat nu in de draaimolen kosten zijn:  €";
    }

    private double kostenRitjeDraaimolen() {
        this.attractie = "Deze Attractie kost €";
        return 1.50;
    }

    void draaikostenDraaimolen() {

    }

    void onderHoud() {

    }
}

class BotsAutos extends Attracties {

    BotsAutos() {
        rondjeBotsautos();
    }

    void rondjeBotsautos() {
        this.attractie = "Je gaat nu naar de botsautos";
        this.entreeKosten = 20;
    }
}

class SchietTent extends Attracties {
//    int entreeKosten;

}

