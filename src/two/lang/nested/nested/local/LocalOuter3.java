package two.lang.nested.nested.local;

public class LocalOuter3 {
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
        return printer;
    }

    public static void main(String[] args) {
        LocalOuter3 localOuter = new LocalOuter3();
        Printer printer = localOuter.process(2);
        // printer.print()를 process()의 스택 프레임이 사라진 이후에 실행한다.
        printer.print();
    }
}
