package pattern.factory;

public class Car {

  private String farbe;
  private int leistung;
  private int tankInhalt;
  private String verbandskasten;

  public Car(String farbe, int leistung, int spritmenge) {
    this.farbe = farbe;
    this.leistung = leistung;
    this.tankInhalt = spritmenge;
  }

  public int getTankinhalt() {

    return tankInhalt;
  }

  public String getFarbe() {

    return farbe;
  }

  public void setVerbandskasten(String string) {
    this.verbandskasten = verbandskasten;

  }

}
