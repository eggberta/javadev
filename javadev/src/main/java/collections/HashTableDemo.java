package collections;

import java.util.Hashtable;

public class HashTableDemo {

  public static void main(String[] args) {
    demoHashtableMitAuto();
  }

  private static void demoHashtableMitAuto() {

    Hashtable<Auto, String> daten = new Hashtable<>();

    Auto willisAuto = new Auto("Auto von Willi");
    Auto chantalsAuto = new Auto("Auto von Chantal");
    Auto dienstwagen = new Auto("Auto f�r alle");

    daten.put(willisAuto, "Willi");
    daten.put(chantalsAuto, "Chantal");
    daten.put(dienstwagen, "alle");

    System.out.println(" Anzahl Daten in der Hashtable: " + daten.size());

    Auto willisZweitesAuto = new Auto("Auto von Willi");
    daten.put(willisZweitesAuto, "Willi");

    System.out.println(" Anzahl Daten in der Hashtable: " + daten.size());

  }
}
