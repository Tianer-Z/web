package javase.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 9999;
        String msg = "Hello World!";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.length(), address, port);

        socket.send(packet);
        socket.close();
    }
}
