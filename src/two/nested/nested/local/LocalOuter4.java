package two.nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuter4 {
    private int outInstanceValue = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print(); // print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        // 여기서 바꾸면 다시 캡쳐를 해야할까?
        // 이런 문제를 동기화 문제라고 한다. 자바는 값을 변경하는 것을 차단하는 것으로 문제를 해결한다.
        // localVar = 20; // 컴파일 오류
        // paramVar = 30; // 컴피알 오류

        return printer;
    }

    public static void main(String[] args) {
        LocalOuter4 localOuter = new LocalOuter4();
        Printer printer = localOuter.process(2);
        // printer.print()를 process()의 스택 프레임이 사라진 이후에 실행한다.
        printer.print();

        // 필드 확인
        for (Field field : printer.getClass().getDeclaredFields()) {
            System.out.println("field = " + field);
        }
    }
}
