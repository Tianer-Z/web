package bishi.tiqianpi.shoppe;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Zhangsl
 * @Date: 2021/08/02
 */
public class Test {

    public String GetXMLValue(String inxml, String path) {
        Queue<String> queue = new LinkedList<>();
        String res = "";
        int x = 0;
        for (int i = 0; i < inxml.length() - 1; i++) {
            if (inxml.charAt(i) == '<') {
                if (inxml.charAt(i + 1) == '/') {
                    break;
                }
                x = i + 1;
                StringBuilder temp = new StringBuilder();
                while (inxml.charAt(x) != '>') {
                    temp.append(inxml.charAt(x++));
                }
                queue.offer(temp.toString());
                i = x;
            }
            if (inxml.charAt(i) == '>' && inxml.charAt(i + 1) != '<') {
                x = i + 1;
                StringBuilder temp = new StringBuilder();
                while (inxml.charAt(x) != '<') {
                    temp.append(inxml.charAt(x++));
                }
                res = temp.toString();
            }
        }

        String[] strs = path.split("\\.");
        Queue<String> queue1 = new LinkedList<>();
        for (String str : strs) {
            queue1.offer(str);
        }

        boolean flag = true;

        while (!queue.isEmpty() && !queue1.isEmpty()) {
            if (!queue.poll().equals(queue1.poll())) {
               flag = false;
               break;
            }
        }
        if (queue.size() + queue1.size() != 0) {
            flag = false;
        }

        return flag ? res : "";
    }

    public static void main(String[] args) {
        String res = new Test().GetXMLValue("<people><name>shopee</name></people>","people.name");
        System.out.println(res);
    }
}
