import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformerTest {

    PlainTextTransformer transformer = new PlainTextTransformer();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testWithColonSymbol(int number) {
        // Given
        String input = "1:2:3:4:";

        // When
        List<Integer> transformed = transformer.transform(input);

        // Then
        assertThat(transformed.contains(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithCustomSymbol(int number) {
        // Given
        String input = "//;\n1;2;3";

        // When
        List<Integer> transformed = transformer.transform(input);

        // Then
        assertThat(transformed.contains(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithMultiDelimeter(int number) {
        // Given
        String input = "1,2:3";

        // When
        List<Integer> transformed = transformer.transform(input);

        // Then
        assertThat(transformed.contains(number)).isTrue();
    }
}
