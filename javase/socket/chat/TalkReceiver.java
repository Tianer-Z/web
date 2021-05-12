package javase.socket.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceiver implements Runnable {
    DatagramSocket socket = null;
    int fromPort;
    String msgFrom;

    public TalkReceiver(int fromPort, String msgFrom) {
        this.fromPort = fromPort;
        this.msgFrom = msgFrom;
        try {
            socket = new DatagramSocket(this.fromPort);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                byte[] container = new byte[1024];
                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
                socket.receive(packet);

                byte[] data = packet.getData();
                String ans = new String(data, 0, data.length).trim();
                System.out.println(msgFrom + ": " + ans);
                if (ans.equals("bye")) {
                    break;
                }
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        socket.close();
    }

}
