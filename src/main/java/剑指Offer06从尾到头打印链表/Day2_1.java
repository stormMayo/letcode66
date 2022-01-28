package 剑指Offer06从尾到头打印链表;

import java.util.LinkedList;


public class Day2_1 {
    public static void main(String[] argus) {
    }

    class Solution {
        LinkedList<Integer> result = new LinkedList<>();
        public int[] reversePrint(ListNode head) {
            recur(head);
            int[] res = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                res[i] = result.get(i);
            }
            return res;
        }


        private void recur(ListNode node){
            if(node == null){
                return;
            }
            recur(node.next);
            result.add(node.val);
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
