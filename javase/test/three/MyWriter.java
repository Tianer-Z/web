package javase.test.three;

public class MyWriter extends Thread{
    private ConsoleWriter consoleWriter;

    public MyWriter(ConsoleWriter consoleWriter, String name) {
        this.consoleWriter = consoleWriter;
        super.setName(name);
    }

    public  void run() {
        consoleWriter.writeToConsole("嘻嘻");
    }
}
