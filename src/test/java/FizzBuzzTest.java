import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void should_get_1_Given_1() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("1",result);
    }
    @Test
    void should_get_2_Given_2() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 2;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("2",result);
    }
    @Test
    void should_get_Fizz_Given_3() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("Fizz",result);
    }
    @Test
    void should_get_Fizz_Given_6() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("Fizz",result);
    }
    @Test
    void should_get_Buzz_Given_5() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("Buzz",result);
    }
    @Test
    void should_get_Buzz_Given_10() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("Buzz",result);
    }
}
