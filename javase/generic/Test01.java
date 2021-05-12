package javase.generic;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    static class Generic<T>{
        T var;

        public Generic(T var) {
            this.var = var;
        }

        public T getVar() {
            return var;
        }
    }


    public static void showKeyValue(Generic<? super Integer> obj) {
        System.out.println(obj.getVar());
    }
    public static <E> E get(Class<E> tClass) throws IllegalAccessException, InstantiationException {
        E instance = tClass.newInstance();
        return instance;
    }

    public static <T> void fun() {

    }


    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("aaa");
        arrayList.add(11);
        arrayList.add(true);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getClass());
        }


        List<String> list = new ArrayList<String>();
        list.add("aa");
//        list.add(11);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getClass());
        }
        List<Integer> integerList = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<String>();

        Class c1 = integerList.getClass();
        Class c2 = stringList.getClass();
        if (c1.equals(c2)) {
            System.out.println(c1);
            System.out.println(c2);
        }


        System.out.println("===================");
        Generic<String> stringGeneric = new Generic<String>("aa");
        Generic<Integer> integerGeneric = new Generic<Integer>(123);
        Generic<Number> numberGeneric = new Generic<Number>(456);

        showKeyValue(numberGeneric);
        showKeyValue(integerGeneric);

        System.out.println(stringGeneric.getClass());

//        if (stringGeneric instanceof Generic<Integer>) {
//            System.out.println(1);
//        }
        List l1 = new ArrayList();
        List<String> l2 = new ArrayList<String>();
        List<Object> l3 = new ArrayList<Object>();
        l1 = l2;
//        l3 = l2;

    }
}
