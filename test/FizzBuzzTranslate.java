import Rikkei.academy.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslate {
    @Test
    void FizzBuzzTranslate(){
    int number = 3;
    String expected = "Fizz";
    String result = FizzBuzz.FizzBuzz(number);
    assertEquals(expected, result);
}

}
