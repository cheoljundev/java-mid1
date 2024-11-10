package two.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자열로
        LocalDateTime ldt = LocalDateTime.of(2024, 12, 25, 11, 12, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String formattedDateTime = ldt.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDateTime);

        // 파싱 : 문자를 날짜와 시간으로
        String input = "2024년 11월 17일 10시 30분 20초";
        LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter); // 예외 발생
        System.out.println("parsedDateTime = " + parsedDateTime);
    }
}
