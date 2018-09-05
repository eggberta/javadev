package collections;

import java.awt.*;

public class Auto extends AbstractCar {

  private String name;
  private Motor motor;
  private Verbandskasten verbandskasten;

  public Auto(String name) {
    super(Color.BLUE);
    this.name = name;
    this.verbandskasten = new Verbandskasten();
    this.motor = new Motor(45);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((motor == null) ? 0 : motor.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (!(obj instanceof Auto)) {
      return false;
    }
    Auto other = (Auto) obj;
    if (motor == null) {
      if (other.motor != null) {
        return false;
      }
    } else if (!motor.equals(other.motor)) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    return true;
  }

}
