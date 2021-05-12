package javase.socket.net;

import java.net.InetSocketAddress;

public class TestInetSocketAdress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8081);
        System.out.println(inetSocketAddress);

        InetSocketAddress inetSocketAddress2 = new InetSocketAddress("localhost", 8081);
        System.out.println(inetSocketAddress2);

        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getPort());
        System.out.println(inetSocketAddress.getHostName());
    }
}
