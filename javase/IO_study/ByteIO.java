package javase.IO_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class ByteIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\Redis\\redis-benchmark.pdb");
        FileOutputStream fos = new FileOutputStream("F:\\redis-benchmark.pdb");

        byte[] buffer = new byte[1024];
        int len;

        Long startTime = System.currentTimeMillis();
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, buffer.length);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        fis.close();
        fos.close();
    }
}
