package pattern.listener;

import java.util.Vector;

public class NewsServer {

  private Vector<INewsClient> alleClients = new Vector<>();

  public void register(INewsClient client) {
    alleClients.add(client);
  }

  public void newsFuerDemozweckeAusloesen() {

    for (INewsClient client : alleClients) {
      Nachricht nachricht = new Nachricht("für Demozwecke");
      client.news(nachricht);
    }
  }

  public void unregister(INewsClient client) {
    alleClients.remove(client);
  }

}
