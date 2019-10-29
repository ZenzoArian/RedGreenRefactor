import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DuplicatorTest {

    Duplicator SUT;

    @Before
    public void setup() {
        SUT = new Duplicator();
    }

    @Test
    public void showColor_isRedColor_redReturned() {
    int result = SUT.duplicateCounter(5);
    assertThat(result, is(10));
    System.out.println(SUT.duplicateCounter(5));
    }
}
