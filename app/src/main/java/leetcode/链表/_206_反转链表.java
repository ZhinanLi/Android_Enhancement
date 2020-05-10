package leetcode.链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class _206_反转链表 {

    //使用（迭代）非递归实现
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)return  head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur!= null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }

    //使用递归实现
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return  listNode;
    }
}
