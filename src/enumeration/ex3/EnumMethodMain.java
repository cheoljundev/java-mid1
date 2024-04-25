package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal()); // ordinal 값 사용 비추천.
        }

        // String -> ENUM 변환
        // 주어진 이름과 일치하는 ENUM 상수 반환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
