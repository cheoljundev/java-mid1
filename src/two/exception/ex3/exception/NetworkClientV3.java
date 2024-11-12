package two.exception.ex3.exception;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {

        // 연결 실패
        if (connectError) {
            throw new ConnectExceptionV3(address, address + " 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        // 전송 실패
        if (sendError) {
            throw new SendExceptionV3(data, address + " 서버에 전송 실패 : " + data);
            // 중간에 다른 예외 발생으로 가정
//             throw new RuntimeException("ex");
        }

        // 전송 성공
        System.out.println(address + " 서버에 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
