package tree._36二叉搜索树与双向链表;

import org.junit.Test;
import tree.TreeNode;

public class Solution {
    TreeNode pre, tail, tmp;
    int count;

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        n4.setLeft(n2);
        n4.setRight(n5);
        n2.setLeft(n1);
        n2.setRight(n3);
        TreeNode treeNode = solution.treeToDoublyList(n4);
    }

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;
        recur(root);
        pre.left = tail;
        tail.right = pre;
        return pre;
    }
    private void recur(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (count++ == 0) pre = root;
            tmp = root;
            return;
        }
        recur(root.left);
        root.left = tmp;
        tmp.right = root;
        if (root.right != null) {
            root.right.left = root;
            tail = root.right;
        }
        recur(root.right);
    }
}
