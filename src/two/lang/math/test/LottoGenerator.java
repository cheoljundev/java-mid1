package two.lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private final int[] numbers = new int[6];

    public void generate() {
        int count = 0;
        numbers[count++] = getNumber();

        while (count <= 5) {
            int number = getNumber();
            if (isValidNumber(numbers, number)) {
                numbers[count++] = number;
            }
        }

        printNumber();
    }

    private void printNumber() {
        System.out.print("로또 번호 : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    private int getNumber() {
        return random.nextInt(45) + 1;
    }

    private boolean isValidNumber(int[] numbers, int number) {
        for (int i : numbers) {
            if (i == number) return false;
        }
        return true;
    }
}
