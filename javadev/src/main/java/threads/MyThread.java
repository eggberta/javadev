package threads;

public class MyThread extends Thread {

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println(super.getName() + " l�uft");
    for (int i = 0; i < 10; i++) {
      System.out.println(getName() + ": " + i);
    }
  }

}
