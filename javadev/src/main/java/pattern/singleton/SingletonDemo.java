package pattern.singleton;

/**
 * Es soll nur einen Deinstwage geben
 */
public class SingletonDemo {

  public static void main(String[] args) {

    // 'new' darf nicht sein:
    Dienstwagen auto1 = Dienstwagen.getInstance();
    Dienstwagen auto2 = Dienstwagen.getInstance();

    System.out.println(auto1);
    System.out.println(auto2);
    
    // 'new' darf nicht sein:
    Dienstwagen2 auto3 = Dienstwagen2.getInstance();
    Dienstwagen2 auto4 = Dienstwagen2.getInstance();

    System.out.println(auto1);
    System.out.println(auto2);

    auto3.tanken(10);
    auto4.tanken(20);
    int tankinhaltAuto3 = auto3.getTankinhalt();
    System.out.println(tankinhaltAuto3);
  }

}
