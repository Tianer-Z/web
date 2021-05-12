package javase.socket.url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLDown {
    public static void main(String[] args) throws Exception {

        String urlstr = "https://youku.cdn7-okzy.com/20200215/17178_cc92fd48/1000k/hls/6f1a8331627000011.ts";
        URL url = new URL(urlstr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        InputStream is = connection.getInputStream();
        FileOutputStream fosm = new FileOutputStream("tianer.ts");
        byte[] buffer = new byte[1024 * 1024];
        int len;
        int count = 0;


        while ((len = is.read(buffer)) != -1) {
            fosm.write(buffer, 0, len);
            System.out.println(count++ + " KB");
        }

        fosm.close();
        is.close();
        connection.disconnect();
    }
}
