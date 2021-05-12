package javase.socket.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {
    public static void main(String[] args) {
        System.out.println("创建DatagramPacket对象......");
        byte[] data = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data, data.length);

        try {
            System.out.println("使用DatagramSocket对象接收数据......");
            DatagramSocket ds = new DatagramSocket(7777);
            ds.receive(dp);
            System.out.println("数据接收完毕");

            byte[] recData = dp.getData();
            int len = dp.getLength();
            String content = new String(recData, 0, len);
            System.out.println("接收到的数据为" + content);

            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
