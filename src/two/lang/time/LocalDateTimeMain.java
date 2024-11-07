package two.lang.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2024, 11, 17, 9, 10, 30);

        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        // 날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산
        LocalDateTime ofDtPlusD = ofDt.plusDays(1000);
        System.out.println("ofDtPlusD = " + ofDtPlusD);
        LocalDateTime ofDtPlusY = ofDt.plusYears(100);
        System.out.println("ofDtPlusY = " + ofDtPlusY);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가 ? : " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가 ? : " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간과 같은가 ? : " + nowDt.isEqual(ofDt)); // 타임존과 무관하게 시간이 같은지 확인.
    }
}
