package RacingGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class InputManagerTransformerTest {

    InputManager inputManager = new InputManager();

    @ParameterizedTest
    @ValueSource(strings = {"kim", "lee", "park"})
    void test(String value) {
        // Given
        String input = "kim,lee,park";

        // When
        List<String> actual = inputManager.transformer(input);

        // Then
        Assertions.assertEquals(actual.size(), 3);
        Assertions.assertTrue(actual.contains(value));
    }

    @Test
    void testWithOver5characters(String value) {
        // Given
        String input = "kimsughanmu,lee,park";

        // When
        List<String> actual = inputManager.transformer(input);

        // Then
        Assertions.assertEquals(actual.size(), 3);
        Assertions.assertTrue(actual.contains(value));
    }
}
