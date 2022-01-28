package 剑指Offer22链表中倒数第k个节点;

public class SolutionTemp {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //双指针  前指针先走k步  两个指针间隔k步伐    当前指针指向null时，后续指针指向极为结果
        ListNode pre = head;
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            pre = pre.next;
        }
        while (pre != null){
            pre = pre.next;
            cur = cur.next;
        }
        return cur;
    }
}
