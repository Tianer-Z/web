package javase.socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        InetAddress inetAddress = null;
        OutputStream os = null;
        Socket socket = null;
        try {
            inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            socket = new Socket(inetAddress, port);

            os = socket.getOutputStream();
            os.write("Hello World".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if (socket != null) {
               try {
                   socket.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }
    }
}
