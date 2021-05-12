package IO_study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataUsingStream {
    public static void main(String[] args) {
        File dataFile = new File("F:\\javaeasy\\DataFileForOutputStream.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("存在文件");
        } else {
            try {
                dataFile.createNewFile();
                System.out.println("创建文件成功");
            } catch (IOException e) {
                System.out.println("创建文件失败");
                e.printStackTrace();
            }
        }

        try {
            String context = "天儿";
            byte[] contentBytes = context.getBytes();
            FileOutputStream fos = new FileOutputStream(dataFile);
            fos.write(contentBytes);
            fos.close();
            System.out.println("数据写入成功");
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("输出内容错误");
            e.printStackTrace();
        }
    }

}
