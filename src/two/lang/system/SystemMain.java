package two.lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
         // 현재 시간 (밀리초)
        long currentTimeMills = System.currentTimeMillis();
        System.out.println("currentTimeMills = " + currentTimeMills);

        // 현재 시간 (나노초)
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        // 환경 변수 읽기
        System.out.println("getEnv = " + System.getenv());

        // 시스템 속성 읽기
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java Version = " + System.getProperty("java.version"));

        // 배열 고속 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, copiedArray.length);

        // 배열 출력
        System.out.println("originalArray = " + Arrays.toString(originalArray));
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);


    }
}
