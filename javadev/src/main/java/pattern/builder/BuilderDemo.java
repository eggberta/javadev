package pattern.builder;

/**
 * Erstellen von Autos mit dem Builder-Pattern
 */
public class BuilderDemo {

  public static void main(String[] args) {

    CarBuilder builder = new CarBuilder();
    builder.setFarbe("blau");
    builder.setSpritmenge(50);
    Car blauesAuto = builder.getCar();
    System.out.println("Aktuelle Farbe: " + blauesAuto.getFarbe());
    
    

  }
}
