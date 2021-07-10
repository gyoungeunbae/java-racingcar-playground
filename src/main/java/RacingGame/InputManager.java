package RacingGame;

import java.util.Arrays;
import java.util.List;

public class InputManager {

    public boolean checkName(String name) {
        if (name.length() == 0 | name.isEmpty()) {
            return false;
        }

        if (name.length() > 5) {
            return false;
        }
        return true;
    }

    public List<String> transformer(String input) {
        return Arrays.asList(input.split(","));
    }
}
