import org.junit.Test;
import java.util.ArrayList;

public class JenkisTest {
    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

}
