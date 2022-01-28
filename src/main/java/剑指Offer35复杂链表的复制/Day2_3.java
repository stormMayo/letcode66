package 剑指Offer35复杂链表的复制;

import java.util.HashMap;

public class Day2_3 {
    public static void main(String[] argus) {
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if(head == null ) return null;
            HashMap<Node, Node> map = new HashMap<>();
            Node cur = head;
            while (cur!=null){
                map.put(cur, new Node(cur.val));
                cur = cur.next;
            }
            cur = head;
            while (cur != null ){
                map.get(cur).next = map.get(cur.next);
                map.get(cur).random = map.get(cur.random);
            }
            return map.get(head);
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
