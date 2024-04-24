package lang.math.test;

import java.util.Random;

public abstract class LottoGenerator1 {
    private static final Random random = new Random();

    static void play() {
        int[] lottoNums = {
                random.nextInt(45) + 1,
                random.nextInt(45) + 1,
                random.nextInt(45) + 1,
                random.nextInt(45) + 1,
                random.nextInt(45) + 1,
                random.nextInt(45) + 1
        };

        for (int i = 1; i < lottoNums.length; i++) {
            while (lottoNums[i] == lottoNums[i-1]) {
                lottoNums[i] = random.nextInt(45) + 1;
                if (lottoNums[i] != lottoNums[i-1]) {
                    break;
                }
            }
        }

        print(lottoNums);
    }

    private static void print(int[] lottoNums) {
        System.out.print("로또 번호 : ");
        for (int i = 0; i < lottoNums.length; i++) {
            System.out.print(lottoNums[i]);
            if (i != lottoNums.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


}
