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
}
