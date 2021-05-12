package javase.IO_study;

import java.io.*;

public class Recursion {

    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream is = new FileInputStream(src);
        FileOutputStream os = new FileOutputStream(dist);

        byte[] buffer = new byte[1024 * 1024];
        int len = 0;
        int count = 0;
        while ((len = is.read(buffer, 0, buffer.length)) != -1) {
            os.write(buffer, 0, len);
            count++;
        }
        System.out.println(count + "MB");
        is.close();
        os.close();

    }

    public static void readFileContent(String dir) throws IOException {
        FileReader fr = new FileReader(dir);
        BufferedReader bf = new BufferedReader(fr);

        String line;
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
        bf.close();
    }


    public static void main(String[] args) throws IOException {
//        File file = new File("F:\\apache-tomcat-9.0.31");
//        listAllFiles(file);
//        copyFile("F:\\Git\\LICENSE.txt", "F:\\天儿.txt");
        String str = "你好";
//        byte[] bytes = str.getBytes("UTF-16be");
        byte[] bytes = str.getBytes("GBK");

        System.out.println(bytes.length);
        String str2 = new String(bytes, "GBK");
        System.out.println(str2);

        readFileContent("F:\\a.txt");

    }
}
