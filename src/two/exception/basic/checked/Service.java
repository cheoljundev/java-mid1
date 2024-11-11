package two.exception.basic.checked;

public class Service {
    Client client = new Client();
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리, messgae = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    public void callThrow() throws MyCheckedException{
        client.call();
        System.out.println("정상 흐름");
    }
}
