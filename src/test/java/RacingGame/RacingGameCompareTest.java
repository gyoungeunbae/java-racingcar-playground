package RacingGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RacingGameCompareTest {

    private RacingGame racingGame = new RacingGame();

    @Test
    void test() {
        // Given
        Car car1 = new Car("first");
        car1.speed = 10;

        Car car2 = new Car("secd");
        car2.speed = 3;

        Car car3 = new Car("third");
        car3.speed = 10;

        List<Car> cars = Arrays.asList(car1, car2, car3);

        // When
        List<Car> winners = racingGame.compare(cars);

        // Then
        Assertions.assertTrue(winners.contains(car1));
        Assertions.assertTrue(winners.contains(car3));
    }
}
