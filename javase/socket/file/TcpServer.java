package javase.socket.file;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("22.jpg");
        byte[] buffer = new byte[1024];
        int len;

        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        OutputStream os = socket.getOutputStream();
        os.write("我接受完毕了，你可以关闭了".getBytes());

        os.close();
        fos.close();
        is.close();
        socket.close();
    }
}
