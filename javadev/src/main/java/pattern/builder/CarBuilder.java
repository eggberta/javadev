package pattern.builder;

public class CarBuilder {

  private String farbe;
  private int spritmenge;
  private int leistung;

  public CarBuilder setFarbe(String farbe) {
    this.farbe = farbe;
    return this;
  }

  public CarBuilder setLeistung(int leistung) {
    this.leistung = leistung;
    return this;
  }
  
  
  public  CarBuilder setSpritmenge(int spritmenge) {
    this.spritmenge = spritmenge;
    return this;
  }

  public Car getCar() {

    Car auto = new Car(farbe, leistung, spritmenge);

    return auto;
  }

}
