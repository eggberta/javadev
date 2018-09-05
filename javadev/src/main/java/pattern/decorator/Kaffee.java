package pattern.decorator;

public class Kaffee implements IGetraenk {

  private static final double myPrice = 1.0;
  private static final String myText = "Kaffee";

  @Override
  public double getPrice() {
    return myPrice;
  }

  @Override
  public String getRechnungsText() {

    return myText;
  }

}
