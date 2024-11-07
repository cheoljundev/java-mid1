package two.lang.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024, 11, 17);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산
        LocalDate plusDays = ofDate.plusDays(1);
        System.out.println("ofDate+1Day = " + plusDays);
    }
}
