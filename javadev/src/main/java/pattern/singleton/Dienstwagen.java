package pattern.singleton;

public final class Dienstwagen {
  
  private static Dienstwagen instance;

 
  private Dienstwagen() {
    // Singleton
  }

  public synchronized static Dienstwagen getInstance() {

    if (instance==null) {
      instance = new Dienstwagen();      
    }
    return instance;
  }

}
