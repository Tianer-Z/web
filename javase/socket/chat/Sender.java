package javase.socket.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String datastr = reader.readLine();
            byte[] data = datastr.getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, new InetSocketAddress("127.0.0.1", 9999));
            socket.send(packet);
            if (datastr.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}
