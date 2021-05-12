package javase.IO_study;

import java.io.File;

public class FileClass {

    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }

        for (File file : dir.listFiles()) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        File file = new File("C:");
        listAllFiles(file);
    }
}
