package two.lang.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currentDt = LocalDate.of(2030, 12, 15);
        LocalDate plusDt = currentDt.plus(period);
        System.out.println("currentDt = " + currentDt);
        System.out.println("plusDt = " + plusDt);

        // 기간 차이
        LocalDate startDt = LocalDate.of(2023, 1, 1);
        LocalDate endDt = LocalDate.of(2023, 4, 2);
        Period betweenPeriod = Period.between(startDt, endDt);
        System.out.println("betweenPeriod = " + betweenPeriod);
        System.out.println("기간 : " + betweenPeriod.getMonths() + "개월 " + betweenPeriod.getDays() + "일");
    }
}
