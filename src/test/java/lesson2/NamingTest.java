package lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class NamingTest {
    private Naming naming = new Naming();

    @Test
     void isAdult_AgeLessThen18_False() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
     void isAdult_False_AgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
    void testIsNotAnAdultAgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
     void IsNotAnAdultAgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
     void should_ReturnFalse_When_AgeLessThen18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
    @Test
     void given_TryToBuyACigarette_When_AgeLessThen18_Expect_isAdultAsFalse() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
}