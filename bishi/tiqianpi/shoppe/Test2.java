package bishi.tiqianpi.shoppe;

/**
 * @Author: Zhangsl
 * @Date: 2021/08/02
 */
public class Test2 {

    public int findBalancedIndex(int[] inputArray) {
        int left = 0;
        int right = 0;
        for (int num : inputArray) {
            right += num;
        }

        for (int i = 0; i < inputArray.length - 1; i++) {
            right -= inputArray[i];
            //System.out.println(i + " " + left + " " + right);
            if (left == right) {
                return i;
            }
            left += inputArray[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        new Test2().findBalancedIndex(new int[]{1,2,3,4,6});
    }
}
