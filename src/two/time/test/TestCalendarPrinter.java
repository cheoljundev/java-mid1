package two.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요:");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요:");
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1); // 입력받은 날짜로 날짜 객체 생성
        LocalDate nextMonth = date.plusMonths(1); // 다음달 날짜 객체 생성, 다음달 이전까지만 출력하기 위함
        int offsetWeekDays = date.getDayOfWeek().getValue() % 7; // DayOfWeek는 월 ~ 일까지 이므로 (1~7) 나머지 연산으로 0~6으로 바꿈. 시작 요일 얻기
        System.out.println("Su Mo Tu We Th Fr Sa"); // 요일 하드코딩
        for (int i = 0; i < offsetWeekDays; i++) { // 맨 처음에 시작요일만큼 밀기
            System.out.print("   ");
        }

        LocalDate dayIterator = date; // 날짜를 돌아갈 객체 복사

        while(dayIterator.isBefore(nextMonth)) { // 다음 달 이전까지만 루프
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // printf로 형식을 두자리 정수로 지정해서 출력
            dayIterator = dayIterator.plusDays(1); // 날짜 + 1
            if (dayIterator.getDayOfWeek() == DayOfWeek.SUNDAY) { // 다음에 출력할 요일이 일요일이면 개행
                System.out.println(); // 개행
            }
        }
    }
}
