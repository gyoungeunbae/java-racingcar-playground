import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlainTextTransformer {

    List<Integer> transform(String input) {
        String[] splitted = {};
        if (input.contains("//") && input.contains("\n")) {
            String decimal = String.valueOf(input.charAt((input.indexOf("\n")-1)));
            input = input.replaceAll("//","").replaceAll("\n", "").replaceAll(decimal, "");
            splitted = input.split("");
            return Arrays.stream(splitted).map(Integer::valueOf).collect(Collectors.toList());
        }

        if (input.contains(":") && input.contains(",")) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != ':' && input.charAt(i) != ',') {
                    list.add(Integer.valueOf(String.valueOf(input.charAt(i))));
                }
            }
            return list;
        }

        if (input.contains(":")) {
             splitted = input.split(":");
        } else if (input.contains(",")) {
            splitted = input.split(",");
        }
        return Arrays.stream(splitted).map(Integer::valueOf).collect(Collectors.toList());
    }
}
