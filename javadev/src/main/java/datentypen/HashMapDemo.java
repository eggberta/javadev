package datentypen;

import java.util.HashMap;
import java.util.Set;

/**
 * Eine Hash Map garantiert keine Reihenfolge der Elemente
 */

public class HashMapDemo {

    public HashMapDemo() {
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("Hash-Map Demo");
        System.out.println("---------------------------------------------------------");

        HashMap<String,String> maeppchen = new HashMap<>();

        maeppchen.put("Stift 1", "roter Filzstift");
        maeppchen.put("Stift 3", "Tintenkiller");
        maeppchen.put("Stift 2", "grüner Textmarker");
        maeppchen.put("Stift 4", "Füller");
        maeppchen.put("Stift 1", "Ganz neuer Stift");

        System.out.println("Anzahl der Stift im Mäppchen: " + maeppchen.size());
        System.out.println("Der dritte Stift ist: " + maeppchen.get("Stift 3"));
        maeppchen.replace("Stift 3", "Rosa Buntstift");
        System.out.println("Der dritte Stift ist: " + maeppchen.get("Stift 3"));

        Set<String> keySet = maeppchen.keySet();
        System.out.println("");
        System.out.println("Liste aller Stifte");
        for (String key:keySet) {
            System.out.println(key + ": " + maeppchen.get(key));
        }
    }
}
