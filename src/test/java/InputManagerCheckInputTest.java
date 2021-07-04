import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InputManagerCheckInputTest {

    InputManager inputValidator = new InputManager();

    @Test
    void test() {
        // Given
        String input = "";

        // When
        boolean isEmpty = inputValidator.checkInput(input);

        // Then
        Assertions.assertTrue(isEmpty);
    }

    @Test
    void testWithInput() {
        // Given
        String input = "1:2:3:-4";

        // When & Then
        Assertions.assertThrows(
                NumberFormatException.class, () -> {
                    inputValidator.checkInput(input);
                });
    }

    @Test
    void testWithString() {
        // Given
        String input = "5,김,6,4";

        // When & Then
        Assertions.assertThrows(
                NumberFormatException.class, () -> {
                    inputValidator.checkInput(input);
                });
    }
}
