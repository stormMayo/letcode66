package 剑指Offer24反转链表;

public class Day2_2 {
    public static void main(String[] argus) {
    }

    class Solution {

        public ListNode reverseList(ListNode head) {
            ListNode pre = null,cur = head;
            while (cur != null ){
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            return pre;
        }

    }


//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) {
//            val = x;
//        }
//    }

}
