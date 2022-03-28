package lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NamingTest {
    private Naming naming = new Naming();

    @Test
    public void isAdult_AgeLessThen18_False() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void isAdult_False_AgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
    public void testIsNotAnAdultAgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
    public void IsNotAnAdultAgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
    public void should_ReturnFalse_When_AgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
    public void given_TryToBuyACigarette_When_AgeLessThen18_Expect_isAdultAsFalse() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
}