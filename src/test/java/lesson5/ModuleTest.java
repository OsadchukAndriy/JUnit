package lesson5;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ModuleTest {

    @Test
    @Category(FastTest.class)
    public void testAccount(){
        System.out.println("Fast testAccount ");
    }
    @Test
    @Category({FastTest.class, SlowTest.class})
    public void addAccountToDb(){
        System.out.println("fast and Slow addAccountToDb");
    }
}
