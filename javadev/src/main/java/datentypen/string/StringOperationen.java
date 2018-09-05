package datentypen.string;

/**
 * Klassen enthält typische Beispiele für die Bearbeitung von Zeichenketten
 *
 * @author Cordula Wensing, O66025
 */

public class StringOperationen {


    String eingabeString1;
    String eingabeString2;


    public StringOperationen() {

        this.eingabeString1 = "";
        this.eingabeString2 = "";

    }


    public String trimmeSpaces(String eingabeString) {
        String trimmmeString = eingabeString.trim();
        return trimmmeString;
    }

    public String entferneFuehrendeNullen(String eingabeString) {
        String regexFuehrFuehrendeNullen = "^0*"; // ^ Zeichen für Anfang, * Zeichen für beliebig viele
        String zahlOhneFuehrendenullen = eingabeString.replaceAll(regexFuehrFuehrendeNullen, "");
        return zahlOhneFuehrendenullen;
    }

    public String ermittleSubstring(String eingabeString1, String eingabeString2) {
        String subString05 = eingabeString1.substring(0, 5);
        return subString05;
    }

    public String zerlegeStringAnhandEinesTrennzeichens() {
        String csvString = "Cordula;Wensing;Cordula.Wensing@axa.de";
        String[] spalten = csvString.split(";");
        System.out.println("Anzahl Spalten: " + spalten.length);
        System.out.println("Inhalt Spalte 1: " + spalten[0]);
        System.out.println("Inhalt Spalte 2: " + spalten[1]);
        System.out.println("Inhalt Spalte 3: " + spalten[2]);
        return csvString;
    }

    public String pruefeAufTeilstring(String eingabeString1, String eingabeString2) {

        boolean atZeichenVorhanden = eingabeString1.contains(eingabeString2);
        if (atZeichenVorhanden) {
            return "Eingabestring 1 enthält Eingabestring 2";
        } else {
            return "EingabeString 2 ist nicht Teil von Eingabestring 1";
        }
    }

    public String verketteStrings(String eingabeString1, String eingabeString2) {
        //Alternative Lösung
        String ausgabeString = eingabeString1.concat(eingabeString2);

        return ausgabeString;

    }
}
