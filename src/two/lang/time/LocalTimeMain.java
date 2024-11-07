package two.lang.time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);

        // 계산
        LocalTime ofTImePlus = ofTime.plusSeconds(30);
        System.out.println("ofTImePlus = " + ofTImePlus);
    }
}
