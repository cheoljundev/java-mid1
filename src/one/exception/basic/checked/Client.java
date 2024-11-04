package one.exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{
        // 문제 상황
        MyCheckedException ex = new MyCheckedException("ex");
        throw ex;
    }
}
