package nl.kermis.attracties;

import java.util.Scanner;

class Entree {
    void Entree() {
        System.out.println("Hallo welkom op kermis scheve120!!");
        Kermis kermisAttractie = new Kermis();
        kermisAttractie.welkeAttractie(inputScanner());
    }

    static Scanner inputScanner() {
        Scanner userInput = new Scanner(System.in);
        return  userInput;
    }

    static void bezoeker() {

    }

    static void aantalPersonen() {

    }

}
