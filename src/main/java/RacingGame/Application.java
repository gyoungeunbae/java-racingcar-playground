package RacingGame;

import java.util.List;

public class Application {

    private static InputManager inputManager = new InputManager();
    private static RacingGame racingGame = new RacingGame();
    private static InputView inputView = new InputView();
    private static ResultView resultView = new ResultView();

    public static void main(String[] args) {
        String names = inputView.inputNames();
        List<Car> cars = inputManager.transformer(names);
        int number = inputView.inputNumber();
        resultView.getResult(cars, number);
    }
}
