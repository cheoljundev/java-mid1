package two.lang.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜를 문자열로
        LocalDate date = LocalDate.of(2024, 12, 25);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String format = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + format);

        // 파싱 : 문자를 날짜로
        String input = "2024년 11월 17일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("파싱된 날짜 = " + parsedDate);
    }
}
