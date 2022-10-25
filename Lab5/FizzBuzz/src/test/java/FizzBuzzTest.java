import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        assertEquals(expected, fizzBuzz.getFizzyBuzz(69));
    }
    @Test
    void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        assertEquals(expected, fizzBuzz.getFizzyBuzz(85));
    }
    @Test
    void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizzbuzz";
        assertEquals(expected, fizzBuzz.getFizzyBuzz(75));
    }@Test
    void boomTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Boom";
        assertEquals(expected, fizzBuzz.getFizzyBuzz(31));
    }

}
