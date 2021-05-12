package javase.socket.chat;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);

        while (true) {
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet);

            byte[] data = packet.getData();
            String receiverData = new String(data, 0, data.length).trim();
            System.out.println(receiverData);
            if (receiverData.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}
