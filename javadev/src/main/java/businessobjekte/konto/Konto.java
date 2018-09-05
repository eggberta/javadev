package businessobjekte.konto;


public class Konto {

  private double kontostand;

  public Konto(String string) {
  }

  public double getKontostand() {

    return kontostand;
  }

  public void einzahlen(double betrag) {
    
    if (betrag<0) {
      throw new RuntimeException("Der Betrag muss postiv sein");
    }
    kontostand += betrag;
  }

}
