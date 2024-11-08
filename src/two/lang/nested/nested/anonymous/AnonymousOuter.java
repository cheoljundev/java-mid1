package two.lang.nested.nested.anonymous;

import two.lang.nested.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
}
