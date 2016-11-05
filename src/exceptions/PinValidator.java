package exceptions;

import java.util.Scanner;

/**
 * Created by Administrator on 04.11.16.
 */
public class PinValidator {
    private static final int PIN = 4752;
    public void enterPinKod() {
        int count = 3;
        System.out.println("Введите пин-код");
        Scanner scanner = new Scanner(System.in);
        do {
            if (isCorrect(scanner.nextInt())) {
                System.out.println("Добро пожаловать в терминал");
                break;
            } else {
                if (count <= 0) {
                    try {
                        System.out.println("Аккаунт заблокирован на 5 секунд");
                        Thread.currentThread().wait(5000);

                        enterPinKod();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Попробуйте еще раз");
            count--;
        } while (count > 0);
    }

    public boolean isCorrect(int value) {
        return value == PIN;
    }
}
