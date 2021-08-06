package examination.somepoint;

import java.io.*;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/28
 */
public class FileSystemClassLoader extends ClassLoader{

    private final String rootDir;

    public FileSystemClassLoader(String rootDir) {
        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] classData = getClassData(className);
        if (classData == null) {
            throw new ClassNotFoundException();
        }
        return defineClass(className, classData, 0, classData.length);
    }

    private byte[] getClassData(String className) {
        String path = classNameToPath(className);
        try {
            InputStream ins = new FileInputStream(path);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            while (ins.read(buffer) != -1) {
                baos.write(buffer, 0, bufferSize);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String classNameToPath(String className) {
        return rootDir + File.separator + className.replace('.', File.separatorChar) + ".class";
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String rootDir = "F:" + File.separator + "Java" + File.separator + "study";
        String className = "examination.pattern.abstarctFactory.Demo";
        FileSystemClassLoader classLoader = new FileSystemClassLoader(rootDir);
        Class<?> objectClass = classLoader.loadClass(className);
        System.out.println(objectClass);
        System.out.println(objectClass.getClassLoader());
    }
}
