package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.of(2024, 1, 1);
        Period period = Period.ofWeeks(0);
        Period period2 = Period.ofWeeks(2);
        for (int i = 0; i < 5; i++) {
            System.out.println("날짜 " + (i+1) + ": " + dt.plus(period));
            period = period.plus(period2);
        }
    }
}
