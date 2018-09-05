package generics;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyList<T> implements Iterable<T> {

  private List<T> daten = new Vector<>();

  public void add(T value) {
    daten.add(value);
  }

  public T get(int i) {
    return daten.get(i);
  }

  public int size() {
    
    return daten.size();
  }

  @Override
  public Iterator<T> iterator() {
    return daten.iterator();
  }

}
