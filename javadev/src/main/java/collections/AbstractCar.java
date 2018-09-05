package collections;

import java.awt.*;

public class AbstractCar {

  private Color farbe;

  public AbstractCar(Color farbe) {
    this.farbe = farbe;

  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((farbe == null) ? 0 : farbe.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof AbstractCar)) {
      return false;
    }
    AbstractCar other = (AbstractCar) obj;
    if (farbe == null) {
      if (other.farbe != null) {
        return false;
      }
    } else if (!farbe.equals(other.farbe)) {
      return false;
    }
    return true;
  }

  
}
