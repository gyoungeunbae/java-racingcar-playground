import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformerTest {

    PlainTextTransformer transformer = new PlainTextTransformer();

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4"})
    void testWithColonSymbol(String number) {
        // Given
        String input = "1:2:3:4:";

        // When
        List<String> transformed = transformer.transform(input);

        // Then
        assertThat(transformed.contains(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void testWithCustomSymbol(String number) {
        // Given
        String input = "//;\n1;2;3";

        // When
        List<String> transformed = transformer.transform(input);

        // Then
        assertThat(transformed.contains(number)).isTrue();
    }
}
