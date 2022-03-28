import lesson1.Maths;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class MathsTest {

    @org.junit.jupiter.api.Test
     void sum() {
        Maths maths = new Maths();
       int actuals = maths.sum(5);
       int expected = 15;
       Assertions.assertEquals(expected, actuals);

    }
}