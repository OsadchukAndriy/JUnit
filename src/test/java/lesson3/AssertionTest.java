package lesson3;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AssertionTest {
    @Test
    public void whenAssertionEquality_thenEqual(){
        String actual = "ITVDM";
        String expected = "ITVDM";
        String message = "Expected and actual not equal";
        assertEquals(message,actual,expected);
    }
    @Test
    public void whenAssertionDoubleEquality_thenEqual(){
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.009;
        String message = "The difference between expected and actual more then " + delta;

        assertEquals(message,expected,actual, delta);
    }
    @Test
    public void whenAssertionArrayEquality_thenEquals(){
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void givenNullArrays_whenAssertionArrayEquality_thenEquals(){
        int[] actual = null;
        int[] expected = null;
        assertArrayEquals(expected,actual);
    }
    @Test
    public void whenAssertionNull_thenTrue(){
        Object tested = null;
        assertNull("Tested object should be null", tested);
    }
    @Test
    public void whenAssertionNotNull_thenTrue(){
        Object tested = new Object();
        assertNotNull(tested);
    }
    @Test
    public void whenAssertionNotSameObject_thenDifferent(){
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat,dog);
    }
    @Test
    public void whenAssertionSameObject_thenNotDifferent(){
        String actual = "TEST";
        String expected = new String("TEST").intern();
        assertSame(actual, expected);
    }
    @Test
    public void whenAssertionConditions_thenVerify(){
        assertTrue("5 is greatest then 4", 5 > 4);
        assertFalse("5 is not greaten then 6", 5 > 6);
    }
    @Test
    public void whenCheckingExceptionMessage_thenEquals(){
        try{
        methodThatShouldThrowException();
    }catch (UnsupportedOperationException e){
            String expected = "Operation not supported";
        }
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported");
    }
    @Test
    public void testAssertThatHasItems(){
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        assertThat(list, CoreMatchers.hasItems("Java", "Kotlin"));
    }


}