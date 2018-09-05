package pattern.delegation;

import java.math.BigInteger;

public class OverflowInteger {

  private BigInteger value;

  public OverflowInteger(int zahl) {
    value = new BigInteger("" + zahl);
  }

  public OverflowInteger add(int increment) throws OverflowExpeption {

    // Delegation 'add'
    BigInteger newValue = value.add(new BigInteger("" + increment));
    if (newValue.intValue() <= Integer.MAX_VALUE && newValue.intValue() <= value.intValue()) {
      throw new OverflowExpeption();
    }

    value = newValue;
    return this;
  }

  @Override
  public String toString() {
    return value.toString();
  }

}
