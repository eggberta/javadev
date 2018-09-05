package datentypen.string;

public class StringDemo {


    public StringDemo() {

        int laenge = "hello,world".length();
        System.out.println("Die Länge von 'hello, world' ist: " + laenge);

        // In Kleinbuchstaben umsetzen
        String textInKleinbuchstaben = "VIEL SPAß".toLowerCase();
        System.out.println(textInKleinbuchstaben);

        // In Großbuchstaben  umsetzen
        String textInGrossbuchstaben = textInKleinbuchstaben.toUpperCase();
        System.out.println(textInGrossbuchstaben);

        trimmeSpaces();

        entferneFuehrendeNullen();

        ermittleSubstring();

        zerlegeStringAnhandEinesTrennzeichens();

        pruefeAufTeilstring();

        verketteStrings();
    }


    private void trimmeSpaces() {

        String trimmmeString = "   abc   xyz   ".trim();
        System.out.println(trimmmeString);
    }

    private void entferneFuehrendeNullen() {
        // Führende Nullen entfernen
        String zahlMitFuehrendenNull = "00012345600";
        String regexFuehrFuehrendeNullen = "^0*"; // ^ Zeichen für Anfang, * Zeichen für beliebig viele
        String zahlOhneFuehrendenullen = zahlMitFuehrendenNull.replaceAll(regexFuehrFuehrendeNullen, "");
        System.out.println(zahlOhneFuehrendenullen);
    }

    private void ermittleSubstring() {
        String subString05 = "hello, wolrd".substring(0, 5);
        System.out.println(subString05);
    }

    private String zerlegeStringAnhandEinesTrennzeichens() {
        String csvString = "Cordula;Wensing;Cordula.Wensing@axa.de";
        String[] spalten = csvString.split(";");
        System.out.println("Anzahl Spalten: " + spalten.length);
        System.out.println("Inhalt Spalte 1: " + spalten[0]);
        System.out.println("Inhalt Spalte 2: " + spalten[1]);
        System.out.println("Inhalt Spalte 3: " + spalten[2]);
        return csvString;
    }

    private void pruefeAufTeilstring() {
        String csvString = "Cordula;Wensing;Cordula.Wensing@axa.de";
        boolean atZeichenVorhanden = csvString.contains("@");
        if (atZeichenVorhanden) {
            System.out.println("Das Zeichen @ ist vorhanden");
        } else {
            System.out.println("Das Zeichen @ ist nicht vorhanden");
        }
    }

    private void verketteStrings() {
        String helloString = "hello";
        String worldString = " world";
        String helloWorldString = helloString + "," + worldString;
        System.out.println(helloWorldString);

        String kette1 = helloString.concat(", ");
        String kette2 = kette1.concat("world");
        System.out.println(kette2);
    }
}
