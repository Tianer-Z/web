package javase.socket.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAdress {

    public static int getAns(int x) {
        int count = 0;
        while(x > 1) {
            count ++;
            x /= 2;
        }
        return count;
    }

    public static int getBinary(int x) {
        int res = 1;
        for (int i = 0; i < x; i++) {
            res *= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        try {
            // 0.0100.0.0 -1 公共端口
            // 1000.0.0.0 -1 程序注册端口
            // 动态、私有端口
            System.out.println(getAns(65535 + 1));
            System.out.println(getAns(40152));

            System.out.println(getBinary(16));
            //查询本机地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress2 = InetAddress.getByName("localhost");
            System.out.println(inetAddress2);

            InetAddress inetAddress3 = InetAddress.getLocalHost();
            System.out.println(inetAddress3);

            //查询网络地址
            InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress4);

            //常用方法
            inetAddress1 = inetAddress1;
            System.out.println(inetAddress1.getAddress());
            System.out.println(inetAddress1.getCanonicalHostName());
            System.out.println(inetAddress1.getHostAddress());
            System.out.println(inetAddress1.getHostName());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
