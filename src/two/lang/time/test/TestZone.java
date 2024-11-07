package two.lang.time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime korTime = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime engTime = korTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime usaTime = korTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("korTime = " + korTime);
        System.out.println("engTime = " + engTime);
        System.out.println("usaTime = " + usaTime);
    }
}
