package RacingGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RacingGameMoveTest {

    private RacingGame racingGame = new RacingGame();

    @Test
    void test() {
        // Given
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");

        List<Car> list = Arrays.asList(car1, car2, car3);

        // When
        List<Car> result = racingGame.move(list);

        // Then
        Assertions.assertNotEquals(0, result.get(0).speed);
        Assertions.assertNotEquals(1, result.get(1).speed);
        Assertions.assertNotEquals(2, result.get(2).speed);
    }
}
