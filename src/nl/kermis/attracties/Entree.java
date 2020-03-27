package nl.kermis.attracties;

import java.util.Scanner;

public class Entree {
    public static void main(String[] args) {
        System.out.println("Hallo welkom op kermis scheve120!!");
        Attractie kermisAttractie = new Attractie();
        kermisAttractie.welkeAttractie(inputScanner());
    }

    static Scanner inputScanner() {
        Scanner userInput = new Scanner(System.in);
        return  userInput;
    }
}
