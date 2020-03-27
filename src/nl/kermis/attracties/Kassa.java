package nl.kermis.attracties;

class Kassa implements PrijzenAttracties {
    int productPrijs;

    double draaimolenEntreePrijs(int personen, double prijsPerKaartje) {
        int aantalPersonen = personen;
        double prijsKaartje = prijsPerKaartje;
        double totaal = aantalPersonen * prijsKaartje;
        return totaal;
    }

    static void prijzen() {

    }
}

interface PrijzenAttracties {

}