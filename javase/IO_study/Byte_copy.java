package javase.IO_study;

import java.io.*;

public class Byte_copy {
    public static void copyFile(String src, String dist) throws IOException {
        File testFile = new File(src);
        testFile.createNewFile();

        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);
        byte[] buffer = new byte[20 * 1024];
        int count;

        while ((count = in.read(buffer, 0, buffer.length)) != -1) {
//            System.out.println(count);
//            for (byte item : buffer) {
//                System.out.print(item + "  ");
//            }
//            System.out.println();
            out.write(buffer, 0, count);
        }

        in.close();
        out.close();
        System.out.println("复制成功");
    }

    public static void main(String[] args) {
        try {
            copyFile("F:\\javaeasy\\datafile.txt", "F:\\javaeasy\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        FileInputStream fileInputStream = new FileInputStream();
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

    }
}
