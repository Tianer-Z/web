package javase.IO_study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFileUsingStream {
    public static void main(String[] args) {
        File dataFile = new File("F:\\javaeasy\\test.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("开始读取数据");
        } else {
            System.out.println("文件不存在");
            return;
        }

        System.out.println("文件中的内容为");
        try {
            FileInputStream fis = new FileInputStream(dataFile);
            byte[] data = new byte[5];
            int len ;
            while ((len = fis.read(data)) != -1) {
                String content = new String(data, 0, len);
                System.out.println(content);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("未找到文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取文件错误");
            e.printStackTrace();
        }
        boolean x = dataFile.delete();
        System.out.println(x);
    }
}
