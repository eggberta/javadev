package pattern.decorator;

public class Zucker implements IGetraenk {

  private static final double myPrice = 0.1;
  private static final String myText = ", Zucker";
  private IGetraenk getraenk;

  public Zucker(IGetraenk getraenk) {
    this.getraenk = getraenk;
  }

  @Override
  public double getPrice() {

    double basePrice = getraenk.getPrice();
    double totalPrice = basePrice + myPrice;      
    return totalPrice;
  }

  @Override
  public String getRechnungsText() {
    String baseText = getraenk.getRechnungsText();
    String totalText = baseText + myText;

    return totalText;
  }

}
