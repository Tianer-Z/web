import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int id;
    int val;

    public Node(int id, int val) {
        this.id = id;
        this.val = val;
    }
}

public class Main {
    public int[] fun(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        Deque<Node> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            while (!queue.isEmpty() && nums[i] > queue.peekLast().val) {
                Node node = queue.pollLast();
                res[node.id] = i - node.id;
            }
            queue.offerLast(new Node(i, nums[i]));

        }
        return res;
    }


    public static void main(String[] args) {
        Main test = new Main();
        int[] nums = new int[]{3, 2, 1, 4};
        int[] res = test.fun(nums);
        for(int num : res) {
            System.out.println(num);
        }
    }
}