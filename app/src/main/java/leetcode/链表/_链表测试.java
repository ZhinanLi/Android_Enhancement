package leetcode.链表;

public class _链表测试 {

    public static void main(String[] args) {

    }

    /**
     * 打印链表
     *
     * @param head
     */
    public static void printList(ListNode head) {
        while (head != null) {
            if (head.next == null)
                System.out.println(head.val);
            else
                System.out.print(head.val + " --> ");

            head = head.next;
        }
    }


}
