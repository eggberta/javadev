package pattern.listener;

public class Client implements INewsClient {

  private String name;

  public Client(String name) {
    this.name = name;
  }

  @Override
  public void news(Nachricht nachricht) {
    // TODO Auto-generated method stub
    System.out.println(name + ": " +  nachricht.toString());
  }

}
