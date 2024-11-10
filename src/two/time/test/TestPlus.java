package two.time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각 = " + dt);
        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.ofHours(4);
        LocalDateTime futureDt = dt.plus(period).plus(duration);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + futureDt);
    }
}
