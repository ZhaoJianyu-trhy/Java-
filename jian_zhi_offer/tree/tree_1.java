package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class tree_1 {

    static LinkedList<Integer> list = new LinkedList<>();
    static boolean find = false;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n0 = new TreeNode(0);
        TreeNode n8 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7);
        TreeNode n4 = new TreeNode(4);

        root.setLeft(n5);
        root.setRight(n1);
        n5.setLeft(n6);
        n5.setRight(n2);
        n2.setLeft(n7);
        n2.setRight(n4);
        n1.setLeft(n0);
        n1.setRight(n8);
//        prefix(root);
        System.out.println();
        LinkedList<TreeNode> routeP = new LinkedList<>();
        LinkedList<TreeNode> routeQ = new LinkedList<>();
//        getPathInNode(root, 2, list, find);
//        System.out.println(lowestCommonAncestor(root, n7, n4).getVal());
        dfs(root, n5, routeP);
        dfs(root, n1, routeQ);
        for (TreeNode tree : routeP) {
            System.out.print(tree.val + " ");
        }
        for (TreeNode tree : routeQ) {
            System.out.print(tree.val + " ");
        }
    }

    public static void dfs(TreeNode root, TreeNode target, LinkedList<TreeNode> list) {
        //定义返回条件
        if (root.left == null && root.right == null) {
            if (root.val == target.val) list.add(root);
            return;
        };
        list.add(root);
        dfs(root.left, target, list);
        if (list.getLast().val == target.val) return;
        dfs(root.right, target, list);
        if (list.getLast().val == target.val) return;
    }

    /**
     * 找到根节点到指定节点的路径
     *
     * @param treeNode
     * @param value
     * @param list
     * @param found
     */
    public static void getPathInNode(TreeNode treeNode, int value, LinkedList<Integer> list, boolean found) {
        if (find) return;
        if (treeNode == null) return;
        if (treeNode.right == null && treeNode.left == null) {
            if (treeNode.getVal() == value) {
                list.add(treeNode.getVal());
                find = true;
                return;
            }
            return;
        }
        list.add(treeNode.getVal());
        if (list.getLast() == value) {
            find = true;
            return;
        }
        getPathInNode(treeNode.left, value, list, find);
        getPathInNode(treeNode.right, value, list, find);
    }

    /**
     * 前序遍历
     *
     * @param treeNode
     */
    public static void prefix(TreeNode treeNode) {

        if (treeNode == null) return;
        System.out.print(treeNode.getVal() + " ");
        prefix(treeNode.left);
        prefix(treeNode.right);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}



