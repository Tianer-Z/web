package test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: Zhangsl
 * @Date: 2021/07/25
 */

public class Test {
    
    private static final int a = 0;
    //Space O(1) Time O(n2) 
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 1; i >= 1; i--) {
            for (int j = 0; j < triangle.get(i).size() - 1; j++) {
                triangle.get(i -1).get(j);

            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.get(0);
        System.out.println(-4 % 3);
    }
}
