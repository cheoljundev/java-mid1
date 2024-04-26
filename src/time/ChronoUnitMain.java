package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration() = " + ChronoUnit.HOURS.getDuration());
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.getDuration() = " + ChronoUnit.DAYS.getDuration());

        // 차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long secondBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondBetween = " + secondBetween);

        long minuteBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("minuteBetween = " + minuteBetween);
    }
}
