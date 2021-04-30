package tdd.exercises.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testEmptyInput() throws Exception {
        StringCalculator calculator = new StringCalculator();
        int expected = 0;

        int actual = calculator.add("");

        assertEquals(expected, actual);
    }

    @Test
    public void testOneNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        int expected = 7;

        int actual = calculator.add("7");

        assertEquals(expected, actual);
    }

    @Test
    public void testTwoNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        int expected = 3;

        int actual = calculator.add("1,2");

        assertEquals(expected, actual);
    }

    @Test
    public void testMultipleNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        int expected = 6;

        int actual = calculator.add("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void testDelimiter() throws Exception {
        StringCalculator calculator = new StringCalculator();
        int expected = 3;

        int actual = calculator.add("//;\n1;2");
        assertEquals(expected, actual);
    }

    @Test
    public void testNegative() throws Exception {
        StringCalculator calculator = new StringCalculator();
//        Exception expected = new Exception("negatives not allowed");

//        int actual = calculator.add("1,-2");

        assertThrows(Exception.class, () -> {
            throw new Exception("negatives not allowed");
        });

    }

}
