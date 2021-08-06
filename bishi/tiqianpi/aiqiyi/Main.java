package bishi.tiqianpi.aiqiyi;


import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Solution s = new Solution();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(10000));
        final Scanner reader = new Scanner(System.in);
        final String next = reader.next();
        List<Line> lines = Arrays.stream(next.split(",")).map(str -> new StringLine(str))
                .collect(Collectors.toList());
        List<Line> result = s.translateAll(lines, "", threadPoolExecutor);
        String resultString = result.stream().map(l -> l.toString()).collect(Collectors.joining(","));
        System.out.println(resultString);
        reader.close();
        threadPoolExecutor.shutdown();
    }

    public interface Line {
        /**
         * translate the line to the specific language
         * @param language - the language to translate
         * @return the line of translated by the {@code language} */
        Line translate(String language);
    }

    public static class Solution {
        /**
         * translate the all lines to the specific language
         * @param lines the text lines of episode
         * @param language the language to translate
         * @return the lines of translated by the {@code language} */
        public List<Line> translateAll(List<Line> lines, String language, Executor executor) throws InterruptedException, ExecutionException {
            Job<Line> job = new Job<>();
            for (Line line : lines) {
                Callable<Line> callable = () -> line.translate(language);
                job.newTask(callable);
            }
            job.execute(executor);
            return job.get();
        }
    }

    public static class Job<V> {
        private BlockingQueue<Callable<V>> blockingQueue = new LinkedBlockingQueue();
        private List<V> list = new ArrayList<>();

        public void newTask(Callable<V> runnable) throws InterruptedException {
            blockingQueue.offer(runnable);
            //待实现
        }

        public void execute(Executor executor) throws ExecutionException, InterruptedException {
            ThreadPoolExecutor executor1 = (ThreadPoolExecutor) executor;
            while (!blockingQueue.isEmpty()) {
                Future<V> submit = executor1.submit(blockingQueue.poll());
                list.add(submit.get());
            }
        }

        public List<V> get() throws InterruptedException {
            return list;
        }

    }

    /**
     * translate the string line to upper case
     */
    public static class StringLine implements Line {
        private String text;

        public StringLine(String text) {
            this.text = text;
        }

        @Override
        public Line translate(String language) {
            return new StringLine(text.toUpperCase());
        }


        @Override
        public String toString() {
            return text;
        }
    }
}
//aaa,bbb,ccc