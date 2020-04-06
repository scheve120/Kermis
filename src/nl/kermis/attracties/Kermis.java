package nl.kermis.attracties;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kermis {

    Entree scanner = new Entree();
    //    Attractie kermis = new Attractie();
    Attractie naarDraaimolen = new DraaiMolen();
    Attractie naarbotsautos = new BotsAutos();
    Kassa afrekenen = new Kassa();
    // Eerst losse attracties, later lijst van attracties

    Kermis() {
//        scanner.inputScanner();
        System.out.println("Welkom bij de kermis");
//        welkeAttractie();
    }

    void openen() {

        String actie = watGaanWeDoen(scanner.inputScanner());
//        attractieDraaimolen(scanner.inputScanner());
        // WaarWilJeKaartjesVoorKopen
        // welkeAttractieGaanWeDraaien
        //
    }

    // loop
    // wat gaan we doen? (kaartjes kopen / draaien / onderhoud
    // if/switch => juiste methode aanroepen voor input welke kaartjes / welke attractie

    private String watGaanWeDoen(Scanner bezoeker) { // verwerken invoer
//        Scanner userInput = new Scanner(System.in);
        boolean bool;
        System.out.println("Naaar welke attractie wil je? (1 = Draaimolen, 2 = ");
        do {
            switch (bezoeker.nextInt()) {
                case 1:
                    System.out.println("Je gaat nu naar de draaimolen.");
                    attractieDraaimolen(bezoeker);
                    bool = false;
                    break;
                case 2:
                    System.out.println("Je gaat nu naar de botsauto's");
                    botsautos(bezoeker);
                    bool = false;
                    break;
                default:
                    System.out.println("Deze attractie bestaat niet.");
                    bool = true;
            }
        } while (bool);
//        naarDraaimolen.info;
        // Alternatief voor keuzes
//        List<Attractie> attractieLijst = new ArrayList<>();
//        attractieLijst.add(new DraaiMolen());
//        attractieLijst.add(new BotsAutos());
//        for (int i = 0; i < attractieLijst.size(); i++) {
//            System.out.print(attractieLijst.get(i).getNaam() + " " + (i + 1));
//        }
//        System.out.println();
        String actie = bezoeker.nextLine();
        return actie;
    }

    void welkeAttractie(Scanner userInput) {
//        Attractie kermis = new Attractie();
        if (userInput.nextLine().equals("Draaimolen")) {
            attractieDraaimolen(userInput);
        } else {
            System.out.println("Deze attractie bestaat niet");
        }
    }

    private void attractieDraaien(String actie) {
        // ipv if => attractieLijst.get(actie - 1).draaien();
        naarDraaimolen.draaien();
    }

    void attractieDraaimolen(Scanner init) {
        boolean bool;
        System.out.println("Welkom bij de draaimolen.");
//        naarDraaimolen.initAttractie();
//        naarDraaimolen.;
        new DraaiMolen().draaimolenOpenOfDicht();
        System.out.println(naarDraaimolen.attractie + " Info " + naarDraaimolen.attractieOpen);
        if (naarDraaimolen.attractieOpen){
            do {
                int bezoeker = init.nextInt();
                if (bezoeker < 3) {
//                init.nextLine();
                    if (naarDraaimolen.entreeKosten != 0) {
                        ((DraaiMolen) naarDraaimolen).initAttractie(bezoeker);
                    } else {
                        System.out.println("Druk 4 om kaartjes te kopen.");
                    }
                    bool = true;
                } else if (bezoeker == 4) {
                    System.out.println("Voor hoeveel personen wil je een kaartje?");
                    naarDraaimolen.entreeKosten = afrekenen.draaimolenEntreePrijs(init.nextInt(), naarDraaimolen.entreeKosten);
                    System.out.println("Dit kost totaal € " + naarDraaimolen.entreeKosten);
                    System.out.println("Druk op 2 om een rondje te maken.. ");
                    bool = true;
                } else {
                    bool = false;
                }
            } while (bool);

        } else {
            System.out.println("Draaimolen is niet open.");
        }
//        new DraaiMolen();
        openen();
//        System.out.println("Dit rondje koste " + naarDraaimolen.entreeKosten);
    }

    /*
    Hier gaan we naar de botsautos.
     */
    void botsautos(Scanner init) {
        System.out.println("Welkom bij de botsautos");
        openen();
    }
}

