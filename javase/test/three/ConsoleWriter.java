package javase.test.three;

public class ConsoleWriter {
    public void writeToConsole(String str) {

        for (int i = 0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() +'\t'+ str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
