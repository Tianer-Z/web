package javase.IO_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\Redis\\redis-benchmark.pdb");
        FileChannel fcin = fis.getChannel();

        FileOutputStream fos = new FileOutputStream("F:\\redis-benchmark.pdb");
        FileChannel fout = fos.getChannel();

//        byte[] buffer = new byte[1024];
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        int len;

        Long startTime = System.currentTimeMillis();

        while ((len = fcin.read(buffer)) != -1) {
            buffer.flip();
            fout.write(buffer);
            buffer.clear();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        fcin.close();
        fout.close();
    }
}
