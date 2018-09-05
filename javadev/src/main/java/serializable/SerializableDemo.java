package serializable;

public class SerializableDemo {

  public static void main(String[] args)  {
    
    try {
      methode1();
    } catch (MyException e) {
      System.out.println(e.getFormattedMessage());
    }
  }

  private static void methode1() throws MyException {

    throw new MyException("Fehler auf dem Server");
    
  }
}
