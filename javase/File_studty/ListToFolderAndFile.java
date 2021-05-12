package File_studty;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListToFolderAndFile {

    public static void printPath(List list) {
        for (int i = 0; i < list.size(); i++) {
            File file = (File) list.get(i);
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        String filePath = "F:" + File.separator + "Git";
        File folder = new File(filePath);
        if (!folder.exists()) {
            System.out.println("文件夹不存在");
            return;
        }
        if (!folder.isDirectory()) {
            System.out.println("不是有效的文件夹");
            return;
        }

        File[] allFiles = folder.listFiles();
        List folders = new ArrayList();
        List files = new ArrayList();
        for (int i = 0; i < allFiles.length; i++) {
            if (allFiles[i].isFile()) {
                files.add(allFiles[i]);
            } else {
                folders.add(allFiles[i]);
            }
        }
        System.out.println(filePath + " 路径下，存在文件夹 " + folders.size() + " 个， 如下所示:");
        printPath(folders);
        System.out.println("");
        System.out.println(filePath + " 路径下，存在文件 " + files.size() + " 个， 如下所示:");
        printPath(files);
    }

}
