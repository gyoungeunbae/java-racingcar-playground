package Calculator;

import Calclulator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void test() {
        // Given
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3});

        // When
        int result = calculator.sumAll(list);

        // Then
        Assertions.assertEquals(6, result);
    }
}
