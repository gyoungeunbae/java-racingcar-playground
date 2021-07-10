package RacingGame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RacingGame {
    public List<Car> move(List<Car> list) {
        for (Car car : list) {
            int speed = RandomNumberGenerator.generate();
            car.speed += speed;
        }
        return list;
    }

    public List<Car> compare(List<Car> cars) {
        List<Car> winners = new ArrayList<>();
        int max = cars.stream().max(Comparator.comparingInt(Car::getSpeed)).get().speed;
        for (int i=0;i<cars.size();i++) {
            if (cars.get(i).speed == max) {
                winners.add(cars.get(i));
            }
        }
        return winners;
    }
}
