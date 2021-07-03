import java.util.List;

public class InputValidator {

    private boolean checkEmpty(String input) {
        if (input.isEmpty() || input.equals("")) {
            return false;
        }
        return true;
    }

    public boolean checkInput(String input) {
        boolean result = checkEmpty(input);
        for (int i=0;i<input.length();i++) {
            try {
                char element = input.charAt(i);
                Integer.parseInt(String.valueOf(element));
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return result;
    }
}
