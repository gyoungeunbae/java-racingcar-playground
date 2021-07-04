import java.util.List;
import java.util.Scanner;

public class Application {

    static InputManager inputManager = new InputManager();
    static PlainTextTransformer plainTextTransformer = new PlainTextTransformer();
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 값을 입력해주세요.");
        String input = scanner.nextLine();
        if (inputManager.checkInput(input)) {
            List<Integer> transformed = plainTextTransformer.transform(input);
            int total = calculator.sumAll(transformed);
            System.out.println(total);
        } else {
            System.out.println("0");
        }
    }
}
