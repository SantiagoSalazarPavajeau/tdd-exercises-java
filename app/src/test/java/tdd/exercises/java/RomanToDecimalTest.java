package tdd.exercises.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @Test
    public void testOneRomanToDecimal(){
        RomanToDecimal romantodecimal = new RomanToDecimal();
        int expected = 1;

        int actual = romantodecimal.convert("I");

        assertEquals(expected, actual);
    }

    @Test
    public void testFiveRomanToDecimal(){
        RomanToDecimal romantodecimal = new RomanToDecimal();
        int expected = 5;

        int actual = romantodecimal.convert("V");

        assertEquals(expected, actual);
    }

    @Test
    public void testFourRomanToDecimal(){
        RomanToDecimal romantodecimal = new RomanToDecimal();
        int expected = 4;

        int actual = romantodecimal.convert("IV");

        assertEquals(expected, actual);
    }

    @Test
    public void test2006RomanToDecimal(){
        RomanToDecimal romantodecimal = new RomanToDecimal();
        int expected = 2006;

        int actual = romantodecimal.convert("MMVI");

        assertEquals(expected, actual);
    }

    @Test
    public void test1944RomanToDecimal(){
        RomanToDecimal romantodecimal = new RomanToDecimal();
        int expected = 1944;

        int actual = romantodecimal.convert("MCMXLIV");

        assertEquals(expected, actual);
    }
}
