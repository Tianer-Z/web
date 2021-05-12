package javase.socket.chat;

public class Test {

    /**
     * description:字符串去除空格的方法
     */
    public static void main(String[] args) {
        byte[] byte2 = new byte[1024];
        byte2[0] = 98;
        byte2[1] = 121;
        byte2[2] = 101;
        String str = new String(byte2, 0, byte2.length);
        //方法1：str.trim()
        System.out.println("1--->"+str.trim());
        //方法2：str.repalce(" ","")
        System.out.println("2--->"+str.replace(" ", ""));
        //方法3：str.repalceAll(" ","")
        System.out.println("3--->"+str.replaceAll(" ", ""));
        //方法4：str.repalceAll(" +","")
        System.out.println("4--->"+str.replaceAll(" +", ""));
        //方法5：str.repalceAll("\\s*","")
        System.out.println("4--->"+str.replaceAll("\\s*", ""));
    }
}