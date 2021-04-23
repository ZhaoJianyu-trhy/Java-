package 序列化二叉树;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        sb.append('[').append(root.val).append(",");
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            TreeNode left = tmp.left;
            TreeNode right = tmp.right;
            appendVal(left, sb, queue);
            appendVal(right, sb, queue);
        }
        //这里可以测试下StringBuilder的replace方法
        sb.replace(sb.length() - 1, sb.length(), "]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String trimStr = data.substring(1, data.length() - 1);//先去除首尾的"[]";
        String[] str = trimStr.split(",");//将节点value和null分离出来
        if (str.length < 1) return null;
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;
        while (index < str.length && !queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (!str[index].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(str[index]));
                tmp.left = left;
                queue.offer(left);
            }
            index++;
            if (!str[index].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(str[index]));
                tmp.right = right;
                queue.offer(right);
            }
            index++;
        }
        return root;
    }
    private void appendVal(TreeNode root, StringBuilder sb, Queue<TreeNode> queue) {
        if (root == null) {
            sb.append("null").append(",");
        } else {
            sb.append(root.val).append(",");
            queue.offer(root);
        }
    }

    @Test
    public void test() {
        TreeNode deserialize = deserialize("[1,2,3,null,null,4,5,null,null,null,null]");
        String serialize = serialize(deserialize);
        System.out.println("serialize = " + serialize);

    }
}