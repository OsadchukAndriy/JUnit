package lesson3;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {
    @Test
     void whenAssertionEquality_thenEqual(){
        String actual = "ITVDM";
        String expected = "ITVDM";
        String message = "Expected and actual not equal";
        assertEquals(actual,expected,message);
    }
    @Test
     void whenAssertionDoubleEquality_thenEqual(){
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.02;
        String message = "The difference between expected and actual more then " + delta;

        assertEquals(expected,actual, delta,message);
    }
    @Test
     void whenAssertionArrayEquality_thenEquals(){
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertArrayEquals(expected,actual);
    }
    @Test
     void givenNullArrays_whenAssertionArrayEquality_thenEquals(){
        int[] actual = null;
        int[] expected = null;
        assertArrayEquals(expected,actual);
    }
    @Test
     void whenAssertionNull_thenTrue(){
        Object tested = null;
        assertNull(tested, "Tested object should be null");
    }
    @Test
     void whenAssertionNotNull_thenTrue(){
        Object tested = new Object();
        assertNotNull(tested);
    }
    @Test
     void whenAssertionNotSameObject_thenDifferent(){
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat,dog);
    }
    @Test
     void whenAssertionSameObject_thenNotDifferent(){
        String actual = "TEST";
        String expected = new String("TEST").intern();
        assertSame(actual, expected);
    }
    @Test
     void whenAssertionConditions_thenVerify(){
        String trueMassage = "5 is greatest then 4";
        assertTrue( 5 > 4, trueMassage);
        String falseMassage = "5 is not greaten then 6";
        assertFalse(5 > 6, falseMassage);
    }
    @Test
    void whenCheckingExceptionMessage_thenEquals(){
        UnsupportedOperationException exception_not_thrown = assertThrows(UnsupportedOperationException.class,
                this::methodThatShouldThrowException, "Exception not thrown");

            String expected = "Operation not supported";
        assertEquals(expected, exception_not_thrown.getMessage());
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported");
    }
    @Test
     void testAssertThatHasItems(){
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        assertThat(list, CoreMatchers.hasItems("Java", "Kotlin"));
    }


}