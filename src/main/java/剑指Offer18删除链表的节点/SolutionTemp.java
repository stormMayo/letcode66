package 剑指Offer18删除链表的节点;

public class SolutionTemp {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode pre = head,cur = head.next;
        while (cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        //修改指针指向
        if(cur != null) pre.next = cur.next;
        return head;
    }
}
