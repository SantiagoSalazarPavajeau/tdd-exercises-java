/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tdd.exercises.java;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    @Test
    public void testDivisableBy3() {
        String expected = "Fizz";
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.solve(27);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivisableBy5() {
        String expected = "Buzz";
        FizzBuzz fizzbuzz = new FizzBuzz();

        String actual = fizzbuzz.solve(25);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivisableBy3and5() {
        String expected = "FizzBuzz";
        FizzBuzz fizzbuzz = new FizzBuzz();

        String actual = fizzbuzz.solve(15);
        assertEquals(expected, actual);
    }
    @Test
    public void testOther() {
        String expected = "7";
        FizzBuzz fizzbuzz = new FizzBuzz();

        String actual = fizzbuzz.solve(7);
        assertEquals(expected, actual);
    }


}
