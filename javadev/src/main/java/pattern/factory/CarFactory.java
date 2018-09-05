package pattern.factory;

public class CarFactory {

  private static final int default_leistung = 45;
  private static final int default_spritmenge = 5;
  private static final String default_farbe = "silber";

  public static Car getCar(String farbe) {
    Car auto = new Car(farbe, default_leistung, default_spritmenge);
    return auto;
  }
  
  public static Car getCar() {
    Car auto = new Car(default_farbe, default_leistung, default_spritmenge);
    auto.setVerbandskasten("Trostpflaster");
    return auto;
  }


}
