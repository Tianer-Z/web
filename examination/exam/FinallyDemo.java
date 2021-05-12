package examination.exam;

public class FinallyDemo {

    public static int fun() {
        int x = 0;
        try {
            System.out.println(111);
            x = 1;
            return x;
        }  finally {
            System.out.println(3333);
            x = 2;
//            return x;
        }
    }


    public static void main(String[] args) {
        System.out.println(FinallyDemo.fun());
    }

}
