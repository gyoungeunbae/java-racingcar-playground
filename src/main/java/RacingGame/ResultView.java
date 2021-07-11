package RacingGame;

import java.util.List;

public class ResultView {

    private RacingGame racingGame = new RacingGame();

    public void getResult(List<Car> cars, int number) {
        System.out.println("실행결과");
        for (int i = 0; i<number; i++) {
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
