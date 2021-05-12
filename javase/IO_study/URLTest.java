package javase.IO_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String res = null;

        while ((res = br.readLine()) != null) {
            System.out.println(res);
        }

        br.close();
    }
}
