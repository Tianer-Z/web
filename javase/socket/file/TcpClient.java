package javase.socket.file;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream("C:\\Users\\天儿\\Pictures\\Saved Pictures\\1.jpg");
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        socket.shutdownOutput();

        //什么叫输出完毕?
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((len = is.read(buffer)) != -1) {
            baos.write(buffer, 0, len);
        }
        System.out.println(baos.toString());

        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();

    }
}
