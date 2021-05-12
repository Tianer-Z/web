package javase.socket.udpdemo;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) {
        System.out.println("构建DatahramPacket");
        String content = "使用UDP传输数据";
        byte[] data = content.getBytes();
        DatagramPacket dp = new DatagramPacket(data, data.length);

        try {
            byte[] addr = new byte[]{127, 0, 0, 1};
            InetAddress local = InetAddress.getByAddress(addr);
            dp.setAddress(local);
            dp.setPort(7777);

            System.out.println("发送DatagramSocket对象");
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
            System.out.println("发送结束");

            ds.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
