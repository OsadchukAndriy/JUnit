package lesson4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderExampleTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before OrderExampleTest.class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After OrderExampleTest.class");
    }

    @Test
    public void firstTest(){
        OrderExample.printDetail("firstTest");
    }
    @Test
    public void test(){
        OrderExample.printDetail("test");
    }
    @Test
    public void secondTest(){
        OrderExample.printDetail("secondTest");
    }


}