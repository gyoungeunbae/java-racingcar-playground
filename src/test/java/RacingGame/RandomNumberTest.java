package RacingGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {
    @Test
    void test() {
        // Given

        // When
        int number = RandomNumberGenerator.generate();

        // Then
        Assertions.assertThat((((Object) number).getClass().isInstance(int.class)));
    }
}
