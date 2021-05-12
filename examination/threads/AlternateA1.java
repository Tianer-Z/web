package examination.threads;

import java.util.*;

public class AlternateA1 {
    static class MyRunnable implements Runnable {
        private char[] nums;
        private Object obj;

        MyRunnable(char[] nums, Object obj) {
            this.nums = nums;
            this.obj = obj;
        }

        @Override
        public void run() {
            while (true) {
                for (char num : nums) {
                    synchronized (obj) {
                        System.out.println(num);
                        obj.notify();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                        }
                    }

                }
            }
        }
    }
    public static void main(String[] args) {
        char[] nums = "12345".toCharArray();
        char[] cha = "abcde".toCharArray();
        Object obj = new Object();

        new Thread(new MyRunnable(nums, obj)).start();
        new Thread(new MyRunnable(cha, obj)).start();

    }

}
