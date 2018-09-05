package collections;

import java.util.Set;
import java.util.TreeMap;

/**
 * Hier wird eine Auto-Collection sortierDas
 */
public class TreeMapDemo {

  public static void main(String[] args) {

    demoStringAsKey();
    demoEigenerComparator();
  }

  private static void demoEigenerComparator() {
    System.out.println("TreeMapDemo.demoEigenerComparator()");

    StringDescendatComparator stringDescendatComparator = new StringDescendatComparator();

    TreeMap<String, Auto> sortierteMap = new TreeMap<>(stringDescendatComparator);

    Auto willisAuto = new Auto("Willis Auto");
    Auto ernasAuto = new Auto("Ernas Auto");
    Auto dienstwagen = new Auto("Dienstwagen");
    
    sortierteMap.put("auto-1", dienstwagen);
    sortierteMap.put("auto-3", ernasAuto);
    sortierteMap.put("auto-2", willisAuto);

    Set<String> keySet = sortierteMap.keySet();

    for (String key : keySet) {
      System.out.println(sortierteMap.get(key).toString());
    }

  }

  private static void demoStringAsKey() {
    
    System.out.println("TreeMapDemo.demoStringAsKey()");
    
    TreeMap<String, Auto> sortierteMap = new TreeMap<>();

    Auto willisAuto = new Auto("Willis Auto");
    Auto ernasAuto = new Auto("Ernas Auto");
    Auto dienstwagen = new Auto("Dienstwagen");

    sortierteMap.put("auto-1", dienstwagen);
    sortierteMap.put("auto-3", ernasAuto);
    sortierteMap.put("auto-2", willisAuto);

    Set<String> keySet = sortierteMap.keySet();

    for (String key : keySet) {
      System.out.println(sortierteMap.get(key).toString());
    }
  }
}
