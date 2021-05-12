package january;

import java.util.concurrent.*;

public class ForkJoin {

    static class ForkJoinExample extends RecursiveTask<Integer> {

        private final int THRESHOD = 5;
        private int first;
        private int last;

        public ForkJoinExample(int first, int last) {
            this.first = first;
            this.last = last;
        }


        @Override
        protected Integer compute() {
            if (last - first <= 5) {
                int res = 0;
                for (int i = first; i <= last; i++) {
                    res += i;
                }
                return res;
            } else {
                int mid = (first + last) / 2;
                ForkJoinExample left = new ForkJoinExample(first, mid);
                ForkJoinExample right = new ForkJoinExample(mid + 1, last);
                left.fork();
                right.fork();

                return left.join() + right.join();
            }

        }

    }

    public static void main(String[] args) {
        ForkJoinExample example = new ForkJoinExample(1, 100);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future result = forkJoinPool.submit(example);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        String abc = "123";
        Integer x = Integer.valueOf(abc);
        int xx = 1;
    }
}
