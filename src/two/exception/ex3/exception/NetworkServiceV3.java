package two.exception.ex3.exception;

public class NetworkServiceV3 {
    public void sendMessage(String  data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] : " + e.getSendData() + ", 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }


    }
}
