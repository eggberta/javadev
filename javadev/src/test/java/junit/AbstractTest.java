package junit;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AbstractTest {

  @Rule  
  public ExpectedException thrown = ExpectedException.none();
  
}
