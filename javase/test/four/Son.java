package javase.test.four;


import javase.test.six.Father;

public class Son extends FF {
    public void xixi() {};

    public static void main(String[] args) {
        FF son = new Son();
        son.haha();
//        son.xixi();
        System.out.println(son.getClass().getName());

//        Son ff = (Son) new FF();
//        ff.haha();
//        ff.xixi();
//        System.out.println(ff.getClass().getName());

        FF son1 = new Son();
        Son son2 = (Son) son1;
        System.out.println(son2.getClass());
    }
}
