package pattern.delegation;

public class DelegationDemo {

  public static void main(String[] args) {

    try {
      
      OverflowInteger oi = new OverflowInteger(Integer.MAX_VALUE);
      OverflowInteger zahl2 = oi.add(30);     
      System.out.println(zahl2);
    } catch (OverflowExpeption e) {

      e.printStackTrace();
    }
    
    
    
 
  }

}
