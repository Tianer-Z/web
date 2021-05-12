package javase.socket.chat;

public class ChatTeacher {
    public static void main(String[] args) {
        new Thread(new TalkSender(7777, "127.0.0.1", 9999)).start();
        new Thread(new TalkReceiver(8888, "学生")).start();
    }
}
