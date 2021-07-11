package RacingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputManager {

    public boolean checkName(String name) {
        if (name.length() == 0 | name.isEmpty()) {
            return false;
        }

        if (name.length() > 5) {
            System.out.println(name);
            System.out.println(name.length());
            return false;
        }
        return true;
    }

    public List<Car> transformer(String input) {
        List<String> names = Arrays.asList(input.split(","));
        List<Car> result = new ArrayList<>();

        for (String name: names) {
           if(checkName(name)) {
               Car car = new Car(name);
               result.add(car);
           }
        }
        return result;
    }
}
