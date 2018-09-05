package pattern.singleton;

public final class Dienstwagen2 {
  
  private final static Dienstwagen2 instance = new Dienstwagen2();
  
  private int tankinhalt;
   
  private Dienstwagen2() {
    // Singleton
  }

  public static Dienstwagen2 getInstance() {

      return instance;
  }

  
  public void tanken(int liter) {
    tankinhalt += liter;
  }
  
  public int getTankinhalt() {
    return tankinhalt;
  }
}
