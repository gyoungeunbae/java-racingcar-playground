
public class InputManager {

    private boolean checkEmpty(String input) {
        if (input.isEmpty() || input.equals("")) {
            return false;
        }
        return true;
    }

    public boolean checkInput(String input) {
        boolean result = false;
        result = checkEmpty(input);

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

    public InputType getInputType(String input) {
        if (input.contains("//") && input.contains("\n")) {
            return InputType.CUSTOM;
        }

        if (input.contains(":") && input.contains(",")) {
            return InputType.MULTI;
        }

        if (input.contains(":")) {
            return InputType.COLON;
        } else if (input.contains(",")) {
            return InputType.COMMA;
        }
        return null;
    }

    public String getDelimeter(String input) {
        return String.valueOf(input.charAt((input.indexOf("\n")-1)));
    }
}
