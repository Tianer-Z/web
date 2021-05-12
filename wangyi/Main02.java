package wangyi;


class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {

    public ListNode minusList(ListNode l1, ListNode l2) {
        boolean flag = true;
        if (l2.val < 0) {
            flag = false;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode pre = dummyHead;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l1.val;
            if (l1 != null) {
                l1 = l1.next;
                l2 = l2.next;
            }
            int z = 0;
            if (flag) {
                z = x - y;
            } else {
                z = x + y;
            }
            ListNode cur = new ListNode(z);
            pre.next = cur;
            pre = cur;

        }
        return dummyHead.next;
    }



    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(-1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;

        Solution solution = new Solution();
        ListNode res = solution.minusList(a1, b1);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}




