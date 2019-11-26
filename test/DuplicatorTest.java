import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DuplicatorTest {

    Duplicator SUT;

    @Before
    public void setup() {
        SUT = new Duplicator();
        SUT.createFile();
    }

    @After
    public void end() {
        SUT.deleteFile();
    }

    @Test
    public void showColor_isRedColor_redReturned() {
    int result = SUT.duplicateCounter(5);
    assertThat(result, is(10));
    System.out.println(SUT.duplicateCounter(5));
    }

//    ---------------------------------------------------------------

    @org.junit.Test
    public void testMultiplier_isResult_50Returned() {
        int result;

        Euro cash = new Euro(10);
        result = cash.multiply(5);
        System.out.println(result);
        assertEquals(result, 50);

    }

    @org.junit.Test
    public void testMultiplierWith_isMultiplyAmount_ReturnedWith() {
        int result;

        Euro cash = new Euro(10);
        result = cash.multiplyAmountWith(2, 5);
        System.out.println(result);
        assertEquals(result, 100);

    }
}
