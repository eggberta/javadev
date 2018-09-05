package collections;

import java.util.Comparator;

public class StringDescendatComparator implements Comparator<String> {

  @Override
  public int compare(String left, String right) {
    // Die normale Sortierfolge von Strings (aufstigend) ....
    int result =  left.compareTo(right);
    // ... in absteigend ver�nder:
    return result * -1;
  }

}
