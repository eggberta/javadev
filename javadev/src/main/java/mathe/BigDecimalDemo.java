package mathe;

import java.math.BigDecimal;

public class BigDecimalDemo {

  public static void main(String[] args) {

    demoOhneBigDecimal();
    demoMitBigDecimal();
  }

  private static void demoMitBigDecimal() {
    System.out.println("BigDecimalDemo.demoMitBigDecimal()");

    double zinssatz = 4.15;
    double anfangsbetrag = 150000;
    int anzahlJahre = 10;

    double klammer = 1 + zinssatz / 100;
    double zinsFaktorUeberAlleJahre = Math.pow(klammer, anzahlJahre);
    double ergebnis = anfangsbetrag * zinsFaktorUeberAlleJahre;

    System.out.println("Ergebnis: " + ergebnis);

  }

  private static void demoOhneBigDecimal() {
    System.out.println("BigDecimalDemo.demoOhneBigDecimal()");

    BigDecimal zinssatz = new BigDecimal("4.15"); 
    BigDecimal anfangsbetrag = new BigDecimal(150000);
    int anzahlJahre = 10;

    BigDecimal zinsFactor = BigDecimal.ONE.add(zinssatz.divide(new BigDecimal(100)));
    BigDecimal zinsFaktorUeberAlleJahre = zinsFactor.pow(anzahlJahre);
    BigDecimal ergebnis = anfangsbetrag.multiply(zinsFaktorUeberAlleJahre);

    // Alles in einer Zeile
    // BigDecimal ergebnis =
    // anfangsbetrag.multiply(BigDecimal.ONE.add(zinssatz.divide(new
    // BigDecimal(100))).pow(anzahlJahre));

    System.out.println("Ergebnis: " + ergebnis);

  }
}
