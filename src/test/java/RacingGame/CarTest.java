package RacingGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void test() {
        // Given
        String name = "name1";

        // When
        Car car = new Car(name);

        // Then
        Assertions.assertEquals(car.name, name);
    }
}
