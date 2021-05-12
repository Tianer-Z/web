package javase.IO_study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataToFile {
    public static void main(String[] args) {
        File dataFile = new File("F:\\javaeasy\\datafile.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("文件已存在");
        } else {
            try {
                dataFile.createNewFile();
                System.out.println("创建文件");
            } catch (IOException e) {
                System.out.println("创建文件失败" + e.getMessage());
                return;
            }
        }

        try {
            PrintWriter pw = new PrintWriter(dataFile);
            pw.write("天儿");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
            return;
        }

    }
}