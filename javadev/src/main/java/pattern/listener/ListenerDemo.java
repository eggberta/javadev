package pattern.listener;

/**
 * Beispiel fuer das Listener-Pattern
 * New-Server mit mehreren Clients verbinden
 * 
 * 'Listener'-Pattern == 'Observer'-Pattern
 */
public class ListenerDemo {

  public static void main(String[] args) {
    
    //NewsServer erzeugen
    NewsServer server = new NewsServer();
    
    //Client erzeugen
    Client erna = new Client("Erna");
    
    //CLient regristrieren
    server.register(erna);
    
    // News verschicken
    server.newsFuerDemozweckeAusloesen();
    
    //Client abmelden
    server.unregister(erna);
    
    server.newsFuerDemozweckeAusloesen();
  }
}
