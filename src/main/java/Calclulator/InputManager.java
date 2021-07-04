package Calclulator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputManager {

    private boolean isEmpty(String input) {
        if (input.isEmpty() || input.equals("")) {
            return true;
        }
        return false;
    }

    public boolean checkInput(String input) {
        boolean isEmpty = isEmpty(input);
        if (! isEmpty) {
            String delimeter = this.getDelimeter(input);
            for (int i = 0; i < input.length(); i++) {
                try {
                    String element = String.valueOf(input.charAt(i));
                    if (!element.equals(delimeter) && !element.equals("\\") && !element.equals("n") && !element.equals("/")) {
                        Integer.parseInt(element);
                    } else {
                        continue;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            isEmpty = true;
        }
        return isEmpty;
    }

    public InputType getInputType(String input) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        boolean test = matcher.find();
        if (matcher.matches()) {
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
        InputType inputType = this.getInputType(input);
        if (inputType.equals(InputType.CUSTOM)) {
            return String.valueOf(input.charAt((input.indexOf("/")+2)));
        } else if (inputType.equals(InputType.COLON)) {
            return ":";
        } else if (inputType.equals(InputType.COMMA)) {
            return ",";
        }
        return null;
    }
}
