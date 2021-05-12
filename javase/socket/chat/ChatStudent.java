package javase.socket.chat;

public class ChatStudent {
    public static void main(String[] args) {
        new Thread(new TalkSender(6666, "127.0.0.1", 8888)).start();
        new Thread(new TalkReceiver(9999, "老师")).start();
    }
}
