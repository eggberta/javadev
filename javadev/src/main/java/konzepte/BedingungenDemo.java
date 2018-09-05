package konzepte;

import datentypen.Wochentag;

public class BedingungenDemo {



    public static void main(String[] args) {
        demoEinfachesIf();
        demoMehrfachAuswahlUeberZahlen();
        demoMehrfachAuswahlUeberStrings();
        demiMehrfachAuswahlUeberEnum();
    }

    private static void demiMehrfachAuswahlUeberEnum() {
        Wochentag wochentagAlsEnum = Wochentag.DIENSTAG;
        switch (wochentagAlsEnum){
            case MONTAG:
                System.out.println("Es ist Montag");
                break;
            case DIENSTAG:
                System.out.println("Es ist Dienstag");
                break;
            case MITTWOCH:
                System.out.println("Es ist Mittwoch");
                break;
           default:
               break;
        }
    }


    private static void demoEinfachesIf() {
        int zahl1 = 5;
        int zahl2 = 7;

        if (zahl1 < 3) {   // Vergleichsoperatoren <, <=, >, >=, ==, !=

            System.out.println("der True Zweig läuft");
        } else {
            System.out.println("der FALSE Zweig läuft");
        }

        if (zahl1 == 5 && zahl2 != 1) { // Verknüpfungen mit && (und), || (oder) , ! (not)

            System.out.println("Beide Aussagen sind WAHR");
        }

    }


    private static void demoMehrfachAuswahlUeberZahlen() {
        int wochentagAlsZahl = 1;
        switch (wochentagAlsZahl) {
            case 0:
                System.out.println("Es ist Montag");
                break;
            case 1:
                System.out.println("Es ist Dienstag");
                break;
            case 2:
                System.out.println("Es ist Mittwoch");
                break;

            default:
                System.out.println("Andere Tage");
                break;
        }
    }

    private static void demoMehrfachAuswahlUeberStrings() {
        String wochentagAlsString = "Dienstag";
        String wochentagInKleinbuchstaben = wochentagAlsString.toLowerCase();

        switch (wochentagInKleinbuchstaben ) {
            case "montag":
                System.out.println("Es ist Montag");
                break;
            case "dienstag":
                System.out.println("Es ist Dienstag");
                break;
            case "mittwoch":
                System.out.println("Es ist Mittwoch");
                break;

            default:
                System.out.println("Andere Tage");
                break;
        }
    }

}
