package datentypen;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Dies ist eine Klasse zur Darstellung von Listoperationen, die Größe einer Liste ist veränderbar
 * Bitte immer Vector statt ArrayList nutzen, Vector ist thread-safe
 *
 */

public class ListDemo {

    public ListDemo() {

        demoArrayList();
        demoVector();
        performanceVector();
        performacheArrayList();
        demoList();

    }

    private void demoList() {
        System.out.println("ListenDemo.demoList()");

        List<String> vieleWoerter = new ArrayList<>();
        vieleWoerter.add("Ferrari");
        vieleWoerter.add("Trabbi");
        System.out.println(vieleWoerter.size());

    }

    private void performacheArrayList() {
        System.out.println("ListenDemo.performanceArrayList()");
        int counter = 1000000;
        long zeitVorSchleife = System.currentTimeMillis();

        ArrayList<String> daten = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            daten.add("" + i);
        }
        long zeitNachSchleife = System.currentTimeMillis();
        long zeitDifferenzVorNachSchleife = zeitNachSchleife - zeitVorSchleife;
        System.out.println("Der Schleifendurchlauf dauert " + zeitDifferenzVorNachSchleife + " bei "
                + counter + " Durchläfuen");

    }

    private void performanceVector() {
        System.out.println("ListenDemo.performanceVector()");
        int counter = 1000000;
        long zeitVorSchleife = System.currentTimeMillis();

        Vector<String> daten = new Vector<>();
        for (int i = 0; i < counter; i++) {
            daten.add("" + i);
        }
        long zeitNachSchleife = System.currentTimeMillis();
        long zeitDifferenzVorNachSchleife = zeitNachSchleife - zeitVorSchleife;
        System.out.println("Der Schleifendurchlauf dauert " + zeitDifferenzVorNachSchleife + " bei "
                + counter + " Durchläfuen");

    }

    private void demoVector() {
        System.out.println("ListenDemo.demoVector()");
        Vector<String> vieleWoerter = new Vector<>();
        vieleWoerter.add("Ferrari");
        vieleWoerter.add("Trabbi");
        vieleWoerter.add("Gogomobil");
        vieleWoerter.add("Tesla");
        int anzahlWoerterInDerListe = vieleWoerter.size();
        System.out.println("Anzahl Wörter in der Liste: " + vieleWoerter.size());
        for (int i = 0; i < 20; i++) {
            String akutellesWort = "" + i;
            vieleWoerter.add((akutellesWort));
        }
        for (int i = 0; i < vieleWoerter.size(); i++) {
            String aktuellesWort = vieleWoerter.get(i);
            System.out.println("for-Schleife: " + aktuellesWort);
        }
        for (String aktuellesWort : vieleWoerter) {
            System.out.println("for-each-Schleife: " + aktuellesWort);
        }
    }


    private void demoArrayList() {
        System.out.println("ListenDemo.demoArrayList()");
        ArrayList<String> vieleWoerter = new ArrayList<>();
        vieleWoerter.add("Ferrari");
        vieleWoerter.add("Trabbi");
        vieleWoerter.add("Gogomobil");
        vieleWoerter.add("Tesla");
        vieleWoerter.add(null);
        int anzahlWoerterInDerListe = vieleWoerter.size();
        System.out.println("Anzahl Wörter in der Liste: " + vieleWoerter.size());
        for (int i = 0; i < 20; i++) {
            String akutellesWort = "" + i;
            vieleWoerter.add((akutellesWort));
        }
        for (int i = 0; i < vieleWoerter.size(); i++) {
            String aktuellesWort = vieleWoerter.get(i);
            System.out.println("for-Schleife: " + aktuellesWort);
        }
        for (String aktuellesWort : vieleWoerter) {
            System.out.println("for-each-Schleife: " + aktuellesWort);
        }
    }
}
