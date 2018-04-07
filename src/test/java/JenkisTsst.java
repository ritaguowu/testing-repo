import org.junit.Test;
import java.util.ArrayList;

public class JenkisTsst {

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }


}
