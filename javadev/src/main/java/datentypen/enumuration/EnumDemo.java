package datentypen.enumuration;

public class EnumDemo {

  public static void main(String[] args) {

    System.out.println(Farbe.ROT);
    Farbe aktuelleFarbe = Farbe.GRUEN;
    
    
    switch (aktuelleFarbe) {
    case ROT:
      System.out.println("Es is rot");
      break;
    case BLAU:
      System.out.println("Es is blau");
      break;
    default:
      System.out.println("Sonstige Farbe: " + aktuelleFarbe);
      break;
    }

  }

}
