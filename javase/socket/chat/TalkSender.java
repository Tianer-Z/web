package javase.socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class TalkSender implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;

    int fromPort;
    String toIp;
    int toPort;

    public TalkSender(int fromPort, String toIp, int toPort) {
        this.fromPort = fromPort;
        this.toIp = toIp;
        this.toPort = toPort;

        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                String msg = reader.readLine();
                byte[] data = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(data, 0, data.length, new InetSocketAddress(this.toIp, this.toPort));
                socket.send(packet);

                if (msg.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }

}
