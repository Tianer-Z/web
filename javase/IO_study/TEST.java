package javase.IO_study;

import java.io.*;


public class TEST {
    public void printFileContent(String filename) {
        File dataFile = new File(filename);
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("打开文件");
        } else {
            System.out.println("输入文件名错误");
            return;
        }

    }

    public static void main(String[] args) {
        File dataFile = new File("F:\\javaeasy\\DataFileForOutputStream.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("打开文件");
        } else {
            try {
                dataFile.createNewFile();
                System.out.println("创建文件成功");
            } catch (IOException e) {
                System.out.println("创建文件失败");
                return;
            }
        }

        String context = "天儿";
        byte[] contentBytes = context.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream(dataFile);
            fos.write(contentBytes);
            fos.close();
            System.out.println("数据写出成功");
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("输出内容错误");
            e.printStackTrace();
        }
    }
}