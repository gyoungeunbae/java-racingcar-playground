package RacingGame;

import java.util.Arrays;
import java.util.List;

public class InputManager {

    public boolean checkName(List<String> elements) {
        for (String element : elements) {
            if (element.length() == 0 | element.isEmpty()) {
                return false;
            }

            if (element.length() > 5) {
                return false;
            }
        }
        return true;
    }


    public List<String> transformer(String input) {
        return Arrays.asList(input.split(","));
    }
}
