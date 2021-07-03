import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InputValidatorTest {

    InputValidator inputValidator = new InputValidator();

    @Test
    void test() {
        // Given
        String input = "";

        // When
        boolean isValid = inputValidator.checkInput(input);

        // Then
        Assertions.assertFalse(isValid);
    }

    @Test
    void testWithInput() {
        // Given
        String input = "123-4";

        // When & Then
        Assertions.assertThrows(
                NumberFormatException.class, () -> {
                    inputValidator.checkInput(input);
                });
    }

    @Test
    void testWithString() {
        // Given
        String input = "5김64";

        // When & Then
        Assertions.assertThrows(
                NumberFormatException.class, () -> {
                    inputValidator.checkInput(input);
                });
    }
}
