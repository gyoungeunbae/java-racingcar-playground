
public class InputValidator {

    public boolean checkInput(String input) {
        if (input.isEmpty() || input.equals("")) {
            return false;
        }
        return true;
    }
}
