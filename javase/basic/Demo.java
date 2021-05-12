package javase.basic;

public class Demo {

    public static void main(String[] args) {

        //demo1
        String str=new String("hello");
        char []chs={'w','o','r','l','d'};
        change(str, chs);
        System.out.println(str+" "+new String(chs));

        //-------------------------------------------------
        //demo2

        StringBuffer sb=new StringBuffer("hello");
        change(sb);
        System.out.println(sb);

    }
    public static void change(StringBuffer sb)
    {
        sb.append(" world");
//      sb.deleteCharAt(0);
    }
    public static void change(String str,char[]chs)
    {
        str.replace('h', 'H');
        chs[0]='W';
    }
}