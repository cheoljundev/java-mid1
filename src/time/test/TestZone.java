package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 9, 0);
        ZonedDateTime seoul = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간: " + seoul);
        System.out.println("런던의 회의 시간: " + london);
        System.out.println("뉴욕의 회의 시간: " + newYork);
    }
}
