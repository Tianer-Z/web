package javase.socket.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLFields {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8081//zhangsl140_war/index.jsp?a=1&b=2");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
    }
}
