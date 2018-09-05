package pattern.builder;

/**
 * Erstellen von Autos mit dem Fluentbuilder-Pattern
 */
public class FluentBuilderDemo {

  public static void main(String[] args) {

    CarBuilder builder = new CarBuilder();
    Car gruenesAuto = builder.setFarbe("gr�n")
        .setLeistung(30)
        .setSpritmenge(8)
        .getCar();

    System.out.println("Farbe: " + gruenesAuto.getFarbe());
    
    builder.setFarbe("gr�n");
    builder.setLeistung(30);
    builder.setSpritmenge(8);
    Car gruenesAuto2 = builder.getCar();
  }

}
