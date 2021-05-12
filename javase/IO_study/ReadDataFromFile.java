package IO_study;

import java.io.*;

public class ReadDataFromFile {
    public static void main(String[] args) {
        File dataFile = new File("F:\\javaeasy\\datafile.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("开始读取数据");
        } else {
            System.out.println("文件不存在");
            return;
        }

        System.out.println("文件内容为:");
        try {
            FileReader fr = new FileReader(dataFile);
            BufferedReader br = new BufferedReader(fr);
            String content = null;

            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
