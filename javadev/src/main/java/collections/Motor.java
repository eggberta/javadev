package collections;

public class Motor {

  private int leistung;

  public Motor(int leistung) {
    this.leistung = leistung;

  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + leistung;
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
    if (!(obj instanceof Motor)) {
      return false;
    }
    Motor other = (Motor) obj;
    if (leistung != other.leistung) {
      return false;
    }
    return true;
  }

}
