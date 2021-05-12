package File_studty;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        String filePath = "F:" + File.separator + "javaeasy" + File.separator + "test.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("不是有效路径");
            return;
        }
        if (!file.isFile()) {
            System.out.println("不是有效文件");
            return;
        }

        File renameFile = new File(file.getParentFile(), "renamedFile.txt");
        if (renameFile.exists()) {
            System.out.println("文件名已被占用");
            return;
        }

        if (file.renameTo(renameFile)) {
            System.out.println("文件重命名成功");
        } else {
            System.out.println("文件重命名失败");
        }

    }
}
