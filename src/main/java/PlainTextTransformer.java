import java.util.Arrays;
import java.util.List;

public class PlainTextTransformer {

    List<String> transform(String input) {
        String[] splitted = {};
        if (input.contains("//") && input.contains("\n")) {
            char decimal = input.charAt((input.indexOf("\n")-1));
            input = input.replaceAll("//","").replaceAll("\n", "");
            splitted = input.split(String.valueOf(decimal));
        }
        if (input.contains(":")) {
             splitted = input.split(":");
        } else if (input.contains(",")) {
            splitted = input.split(",");
        }
        return Arrays.asList(splitted);
    }
}
