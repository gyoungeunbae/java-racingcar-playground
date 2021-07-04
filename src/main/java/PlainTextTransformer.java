import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlainTextTransformer {

    InputManager inputManager = new InputManager();

    List<Integer> transform(String input) {
        String[] splitted = {};
        InputType inputType = inputManager.getInputType(input);
        if (inputType.equals(InputType.CUSTOM)) {
            String delimeter = inputManager.getDelimeter(input);
            input = input.replaceAll("//","").replaceAll("\\\\n", "").replaceAll(delimeter, "");
            splitted = input.split("");
            return Arrays.stream(splitted).map(Integer::valueOf).collect(Collectors.toList());
        }

        if (inputType.equals(InputType.MULTI)) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != ':' && input.charAt(i) != ',') {
                    list.add(Integer.valueOf(String.valueOf(input.charAt(i))));
                }
            }
            return list;
        }

        if (inputType.equals(InputType.COLON)) {
            splitted = input.split(":");
        } else if (inputType.equals(InputType.COMMA)) {
            splitted = input.split(",");
        }
        return Arrays.stream(splitted).map(Integer::valueOf).collect(Collectors.toList());
    }
}
