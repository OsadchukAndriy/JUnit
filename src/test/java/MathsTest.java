import lesson1.Maths;

import static org.junit.Assert.*;

public class MathsTest {

    @org.junit.Test
    public void sum() {
        Maths maths = new Maths();
       int actuals = maths.sum(5);
       int expected = 15;
       assertEquals(expected, actuals);

    }

    public static void main(String[] args) {
        int a = 10;
        if (a > 0){
            System.out.println("a > 0");
        }
    }
}