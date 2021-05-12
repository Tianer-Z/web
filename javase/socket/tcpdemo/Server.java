package javase.socket.tcpdemo;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("服务端在7777端口监听......");

            Socket socket = serverSocket.accept();
            System.out.println("已有客户端连接过来，开始进行通讯......");

            OutputStream out = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(out);
            System.out.println("正在向客户端发送消息......");
            pw.write("客户端你好，这里是服务端\r\n");
            pw.flush();
            System.out.println("向客户端发送信息完成");

            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String response = br.readLine();

            System.out.println("下面是客户端发来的消息");
            System.out.println(response);
            System.out.println("===================");

            br.close();
            pw.close();
            serverSocket.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
