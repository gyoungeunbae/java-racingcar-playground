package RacingGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputManagerCheckNameTest {

    InputManager inputManager = new InputManager();

    @Test
    void test() {
        // Given
        String input = "abcddd";

        // When
        boolean result = inputManager.checkName(input);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    void testWithEmpty() {
        // Given
        String input = "";

        // When
        boolean result = inputManager.checkName(input);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    void testWithTrue() {
        // Given
        String input = "apple";

        // When
        boolean result = inputManager.checkName(input);

        // Then
        Assertions.assertTrue(result);
    }
}
