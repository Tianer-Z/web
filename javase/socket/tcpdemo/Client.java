package javase.socket.tcpdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        byte[] addr = new byte[]{127, 0, 0, 1};
        try {
            InetAddress local = InetAddress.getByAddress(addr);
            Socket socket = new Socket(local, 7777);

            InputStream in = socket.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            String response = bf.readLine();
            System.out.println("下面是服务端发来的消息");
            System.out.println(response);
            System.out.println("===================");

            System.out.println("正在向服务端发送消息");
            OutputStream out = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(out);
            pw.write("服务器你好，这里是客户端");
            pw.flush();
            System.out.println("向服务器发送消息完成");

            bf.close();
            pw.close();
            socket.close();

        } catch (UnknownHostException e) {
            System.out.println("无法找到相应的机器");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("数据传输异常");
            e.printStackTrace();
        }
    }

}
