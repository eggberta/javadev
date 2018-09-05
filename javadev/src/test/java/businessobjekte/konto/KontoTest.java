
import junit.AbstractTest;
import businessobjekte.konto.Konto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//@RunWith()
public class KontoTest extends AbstractTest {

    private Konto konto;

    public KontoTest() {
        System.out.println("KontoTest.KontoTest()");
    }

    // @BeforeClass
    @Before // ist besser, weil parallelisierbar
    public void startBrowserOnce() {
        System.out.println("KontoTest.startBrowserOnce()");
    }

    // Arrange:
    @Before
    public void createKonto() {
        konto = new Konto("Mein Konto");
    }

    @After
    public void laeuftHinterher() {
        System.out.println("KontoTest.laeuftHinterher()");
    }

    @Test
    public void testEinzahlen() {

        // Arrange:
        double erwarteterKontostand = 100.01;

        // Act:
        konto.einzahlen(100.01);

        // Assert:
        double aktuellerKontostand = konto.getKontostand();
        assertEquals(erwarteterKontostand, aktuellerKontostand, 0.001);
    }

    @Test(expected = RuntimeException.class) // Assert:
    public void testEinzahlen_NegativerBetrag() {
        // Act:
        konto.einzahlen(-333);
    }

    @Test
    public void testEinzahlen_NegativerBetrag2() {

        thrown.expect(RuntimeException.class); // Assert:

        // Act:
        konto.einzahlen(-333);
    }

}
