package javase.IO_study;

import java.io.*;

public class ConsoleToFIle {

    public static File prepareFile(String filePath) {
        File dataFile = new File(filePath);
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("文件已存在");
        } else {
            try {
                dataFile.createNewFile();
                System.out.println("创建文件");
            } catch (IOException e) {
                System.out.println("创建失败");
                System.out.println(e.getMessage());
                return null;
            }
        }
        return dataFile;
    }

    public static void printFileContent(File file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String content = null;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
            fr.close();
            br.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        File dataFile = prepareFile("F:\\javaeasy\\test.txt");
        if (dataFile == null) {
            System.out.println("创建文件出错");
            return;
        }

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(dataFile);
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
            return;
        }

        String content = null;
        String endMark = "end";
        System.out.println("请输入要写入的数据,\"end\"结束");

        try {
            while ((content = br.readLine()) != null) {
                if (content.equalsIgnoreCase(endMark)) {
                    break;
                }
                pw.write(content +"\r\n");
            }
            pw.close();
            br.close();
            System.out.println("输入结束");
        } catch (IOException e) {
            e.printStackTrace();
        }

        printFileContent(dataFile);
    }

}
