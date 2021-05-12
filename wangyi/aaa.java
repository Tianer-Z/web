//
//
//class Solution {
//
//    public ListNode minusList(ListNode minuendList, ListNode subtrahendList) {
//
//        boolean flag = true;
//        if (minuendList.val < 0) {
//            minuendList.val = - minuendList.val;
//            flag = false;
//        }
//        long x = 0;
//        while (minuendList != null) {
//            x = x * 10 + minuendList.val;
//            minuendList = minuendList.next;
//        }
//        if (!flag) {
//            x = - x;
//        }
//
//        flag = true;
//        if (subtrahendList.val < 0) {
//            subtrahendList.val = - subtrahendList.val;
//            flag = false;
//        }
//        long y = 0;
//        while (subtrahendList != null) {
//            y = y * 10 + subtrahendList.val;
//            subtrahendList = subtrahendList.next;
//        }
//        if (!flag) {
//            y = - y;
//        }
//
//        long res =  x - y;
//        if (res == 0) {
//            return new ListNode(0);
//        }
//        flag = true;
//        if (res < 0) {
//            res = -res;
//            flag = false;
//        }
//
//        ListNode pre = null;
//        while (res != 0) {
//            ListNode cur = new ListNode((int) (res % 10));
//            res /= 10;
//            cur.next = pre;
//            pre = cur;
//        }
//        if (!flag) {
//            pre.val = -pre.val;
//        }
//
//        return pre;
//    }
//
//}