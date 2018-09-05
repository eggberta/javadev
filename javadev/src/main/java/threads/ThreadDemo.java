package threads;

/**
 * Erzeugen und starten von Threads
 */
public class ThreadDemo {

  
  private static final int THREAD_COUNTER = 10;

  public static void main(String[] args) {
    
    for (int i = 0; i < THREAD_COUNTER ;i++) {
      MyThread thread1 = new MyThread("#" + i);
      thread1.start();

      
    }
  }
  
  
}
