package pattern.builder;

public class Car {

  private String farbe;
  private int leistung;
  private int spritmenge;

  public Car(String farbe, int leistung, int spritmenge) {
    this.farbe = farbe;
    this.leistung = leistung;
    this.spritmenge = spritmenge;
  }

  public String getFarbe() {
    return farbe;
  }

}
