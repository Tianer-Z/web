package javase.continer;


import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashSet = new HashMap<>();

        hashSet.put(1, 1);
        System.out.println(hashSet.size());
        hashSet.put(2, 2);
        System.out.println(hashSet.size());
        hashSet.put(1, 1);
        System.out.println(hashSet.size());

        HashMapTest[] haha = new HashMapTest[10];
        HashMapTest haha1 = new HashMapTest();

        Object obj = new Object();
        System.out.println(HashMapTest.class.isInstance(obj));


    }
}
