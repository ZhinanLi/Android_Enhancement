package leetcode.链表;

/**
 * 18 给定链表头节点和需要删除的节点值
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * 237 给出需要删除的结点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class _18_删除链表中的结点 {
    /**
     * 18
     * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
     * 返回删除后的链表的头节点。
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val){return head.next;}
        ListNode newNode = head;
        while (newNode.next != null) {
            if(newNode.next.val == val){
            newNode.next = newNode.next.next;
            return head;
            }
            newNode = newNode.next;
        }
        return newNode;
    }

    /**
     * 237
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next =  node.next.next;
    }
}
