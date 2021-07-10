package RacingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static InputManager inputManager = new InputManager();
    private static RacingGame racingGame = new RacingGame();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = scanner.nextLine()+" ".trim();
        List<Car> cars = inputManager.transformer(names);

        System.out.println("시도할 회수는 몇회인가요?");
        int number = scanner.nextInt();

        System.out.println("실행결과");
        for (int i=0;i<number;i++) {
            racingGame.move(cars);
            for (Car car : cars) {
                System.out.print(car.name+ " : ");
                for (int j=0;j<car.speed;j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }

        List<Car> winners = racingGame.compare(cars);
        for (int i=0;i<winners.size();i++) {
            System.out.print(winners.get(i).name);
            if (i != winners.size()-1) {
                System.out.println(",");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
