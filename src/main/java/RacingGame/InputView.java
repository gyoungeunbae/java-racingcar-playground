package RacingGame;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String inputNames() {

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = scanner.nextLine()+" ".trim();

        return names;
    }

    public int inputNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        int number = scanner.nextInt();
        return number;
    }
}
