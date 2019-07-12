import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void should_get_1_() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        //When
        String result = fizzBuzz.convert(number);
        //Then
        Assertions.assertEquals("1",result);
    }
}
