package leetcode.链表;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class _141_环形链表 {
    //快慢指针 一开始不能相遇 快指针在前，慢指针在后
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){return  false;}
        ListNode fast = head;
        ListNode slow = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){return  true;}
        }
        return false;
    }


}
