package pattern.factory;


public class FactoryDemo {

  public static void main(String[] args) {

    Car blauesAuto = CarFactory.getCar("blau");
    Car rotesAuto = CarFactory.getCar("rot");

    int spritmangeBlau = blauesAuto.getTankinhalt();
    System.out.println("Das blaues Auto hat " + spritmangeBlau + " Liter Sprit");

    Car defaultAuto = CarFactory.getCar();
    System.out.println("Das Default-Auto hat die Farbe " + defaultAuto.getFarbe());

  }

}
