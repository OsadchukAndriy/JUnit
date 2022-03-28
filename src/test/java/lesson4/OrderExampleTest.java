package lesson4;


import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderExampleTest {
    @BeforeAll
     static void beforeClass(){
        System.out.println("Before OrderExampleTest.class");
    }
    @AfterAll
     static void afterClass(){
        System.out.println("After OrderExampleTest.class");
    }

    @Test
    @Order(1)
     void firstTest(){
        OrderExample.printDetail("firstTest");
    }
    @Test
    @Order(2)
     void test(){
        OrderExample.printDetail("test");
    }
    @Test
    @Order(3)
     void secondTest(){
        OrderExample.printDetail("secondTest");
    }


}