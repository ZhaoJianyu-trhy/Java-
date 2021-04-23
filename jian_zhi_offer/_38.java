import tree.TreeNode;

import java.util.LinkedList;

public class _38 {

    static StringBuilder strBuilder;
    static LinkedList<TreeNode> queue;
    static String tmpAns;

    public static String serialize(TreeNode root) {
        if (root == null) return "[]";
        strBuilder = new StringBuilder();
        strBuilder.append("[");
        queue = new LinkedList<TreeNode>() {{add(root);}};
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            boolean isEmpty = queue.isEmpty();
            //有一个关键点是要处理好节点2，4处null子节点的打印与否？
            //可以先算处二叉树的深度，当表明操作到最后一层时，当子节点是null时直接跳过，
            //不加入到queue队列中，但是这样消耗太大了！
            if (tmp != null) {
                queue.add(tmp.left);
                queue.add(tmp.right);
                strBuilder.append(tmp.val + ",");
            } else {
                if (isEmpty) strBuilder.append("null]");
                else strBuilder.append("null,");
            }
        }
//        strBuilder.insert(0, "[");
//        strBuilder.insert(strBuilder.length(), "]");
        return strBuilder.toString();
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.setLeft(n2);
        root.setRight(n3);
        n3.setLeft(n4);
        n4.setRight(n5);

        System.out.println(serialize(root));
    }
}
