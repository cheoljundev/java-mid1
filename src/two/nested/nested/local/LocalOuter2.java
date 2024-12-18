package two.nested.nested.local;

public class LocalOuter2 {
    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuter2 localOuter = new LocalOuter2();
        localOuter.process(2);
    }
}
