package generics;

import java.util.Date;

public class GenericsDemo {

  public static void main(String[] args) {

    demoListMitStringsbzwDate();
    demoListMitZahlen();
  }

  private static void demoListMitZahlen() {
    
    MyList<Number> listeMitZahlen = new MyList<>();
    
    listeMitZahlen.add(new Integer(4711));
    listeMitZahlen.add(new Double(0.815));
    int zahlAlsInt =125;  // Autoboxing
    listeMitZahlen.add(128);
    listeMitZahlen.add(zahlAlsInt);   
    
    Number number = listeMitZahlen.get(3);
    int zahl3 = (Integer) listeMitZahlen.get(3);
    System.out.println(zahl3);
    
    for (Number zahl :listeMitZahlen) {
     System.out.println(zahl);
    }
  }

  private static void demoListMitStringsbzwDate() {
    MyList<String> listeMitStrings = new MyList<>();
    
    listeMitStrings.add("eins");
    listeMitStrings.add("zwei");
    listeMitStrings.add("drei");
    
    String element = listeMitStrings.get(1);
    
    System.out.println(element);

    MyList<Date> listeMitDate = new MyList<>();
    listeMitDate.add(new Date());
    listeMitDate.add(new Date(4711));
    
    int size =  listeMitDate.size();
    
    System.out.println("Es gibt " + size + " Einträge in der Datumsliste");
  }

}
