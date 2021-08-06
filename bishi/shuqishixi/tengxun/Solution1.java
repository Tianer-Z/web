package bishi.shuqishixi.tengxun;

import java.util.HashMap;

class ListNode {
  int val;
  ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}


public class Solution1 {

    public ListNode solve (ListNode head) {
        int[] nums = new int[100010];
        HashMap<Integer, ListNode> map = new HashMap<>();
        int len = 0;

        while (head != null) {
            map.put(len, head);
            nums[len] = head.val;
            len++;
            head = head.next;
        }
        ListNode result = map.get(0);
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = nums[i];
        }

        for (int i = 0; i < len; i++) {
//            for (int kk = 0; kk < len; kk++) {
//                System.out.print(res[kk] + " ");
//            }
//            System.out.println();

            int index = i;
            boolean flag = false;

            for (int j = 0; j < len; j++) {
                if (flag) {
                    res[j] = nums[index];
                } else {
                    if (nums[index] < res[j]) {
                        flag = true;
                        res[j] = nums[index];
                        result = map.get(i);
                    } else if (nums[index] > res[j]) {
                        break;
                    }
                }
                index = (index + 1) % len;
            }
        }

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        for (int i = 0; i < len; i++) {
            cur.next = new ListNode(res[i]);
            cur = cur.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        Solution1 solution1 = new Solution1();
        ListNode res = solution1.solve(l1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
