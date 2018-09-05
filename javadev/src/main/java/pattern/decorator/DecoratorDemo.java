package pattern.decorator;

public class DecoratorDemo {

  public static void main(String[] args) {

    demoBestellung1();
    demoBestellung2();
  }

  private static void demoBestellung1() {

    System.out.println("Bestellung 1");
    Kaffee kaffee = new Kaffee();

    Zucker zucker = new Zucker(kaffee);

    double betrag = zucker.getPrice();
    String text = zucker.getRechnungsText();

    System.out.println(text);
    System.out.println(betrag);
  }

  private static void demoBestellung2() {

    System.out.println("Bestellung 2");
    Kaffee kaffee = new Kaffee();

    Zucker zucker1 = new Zucker(kaffee);
    Zucker zucker2 = new Zucker(zucker1);
    Zucker zucker3 = new Zucker(zucker2);

    double betrag = zucker3.getPrice();
    String text = zucker3.getRechnungsText();
  
 
    System.out.println(text);
    System.out.println(betrag);
  }
}
