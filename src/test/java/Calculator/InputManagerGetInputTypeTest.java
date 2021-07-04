package Calculator;

import Calclulator.InputManager;
import Calclulator.InputType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputManagerGetInputTypeTest {
    InputManager inputManager = new InputManager();

    @Test
    void test() {
        // Given
        String input = "1,2,3";

        // When
        InputType inputType = inputManager.getInputType(input);

        // Then
        Assertions.assertEquals(InputType.COMMA, inputType);
    }

    @Test
    void testWithCustom() {
        // Given
        String input = "//;\n1;2;3";

        // When
        InputType inputType = inputManager.getInputType(input);

        // Then
        Assertions.assertEquals(InputType.CUSTOM, inputType);
    }

    @Test
    void testWithMulti() {
        // Given
        String input = "1,2:3";

        // When
        InputType inputType = inputManager.getInputType(input);

        // Then
        Assertions.assertEquals(InputType.MULTI, inputType);
    }
}
