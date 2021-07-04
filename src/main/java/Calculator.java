import java.util.List;

public class Calculator {
    public Integer sumAll(List<Integer> numbers) {
        Integer total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return total;
    }
}
