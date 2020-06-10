package leetcode.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS
 * on 2020/5/25
 */
public class _层次遍历二叉树 {

    public static void levelTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.removeFirst();
            System.out.println(cur.val + "");
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    public static void levelTraversal2(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        //添加元素到队列中
        queue.offer(root);

        while (!queue.isEmpty()) {
            //获取并删除队列的头元素
            TreeNode tree = queue.poll();

            if (tree.left != null) {
                queue.offer(tree.left);
            }

            if (tree.right != null) {
                queue.offer(tree.right);
            }
        }
    }

}
