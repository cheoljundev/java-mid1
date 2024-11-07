package two.lang.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now(); // utc 기준
        System.out.println("now = " + now);

        // ZonedDateTime 에서 뽑아낼 수 있다. (utc 시간대가 있어서)
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // 에포크 시간
        Instant epochStart = Instant.ofEpochSecond(0); // 에포크시간 + 0초
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond); // epoch로부터 흐른 시간


    }
}
