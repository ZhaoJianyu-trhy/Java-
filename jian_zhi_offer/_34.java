import tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _34 {
    static List<List<Integer>> ans = new ArrayList<>();
    static LinkedList<Integer> tmp = new LinkedList<>();
    static int sum;
    static int target;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);
        TreeNode t8 = new TreeNode(8);
        TreeNode t11 = new TreeNode(11);
        TreeNode t13 = new TreeNode(13);
        TreeNode td4 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t2 = new TreeNode(2);
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);

        root.setLeft(t4);
        root.setRight(t8);
        t4.setLeft(t11);
        t8.setLeft(t13);
        t8.setRight(td4);
        t11.setLeft(t7);
        t11.setRight(t2);
        td4.setLeft(t5);
        td4.setRight(t1);

//        List<List<Integer>> lists = pathSum(root, 22);
        List<List<Integer>> lists = pathSum(root, 22);
        System.out.println(Arrays.toString(lists.toArray()));
    }

    /*public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return null;
        _34.sum = sum;
        getAns(root);
        return ans;
    }*/

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return ans;
        ans = new ArrayList<>();
        target = sum;
        List<Integer> list = new ArrayList<>();
        recur(root, list, 0);
        return ans;
    }

    private static void recur(TreeNode root, List<Integer> list, int sum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (sum + root.val == target) {
                list.add(root.val);
                ans.add(list);
                list.remove(list.size() - 1);
            }
            return;
        }
        list.add(root.val);
        recur(root.left, list, sum + root.val);
        recur(root.right, list, sum + root.val);
        list.remove(list.size() - 1);
    }

    private static void getAns(TreeNode root) {
        //这个判断还是有必要的，针对节点有一个空子节点，另一个不为空时
        if (root == null) return;
        if (root.left == null && root.right == null && (sum - root.val) == 0) {
            tmp.add(root.val);
            ans.add(new ArrayList<>(tmp));
            tmp.removeLast();
            return;
        }
        tmp.add(root.val);
        sum -= root.val;
        // if (check == 0) {
        //     List<Integer> tmpAns = new ArrayList<>(tmp);
        //     ans.add(tmpAns);
        //     check += tmp.removeLast();
        //     return;
        // }
        getAns(root.left);
        getAns(root.right);
        sum += tmp.removeLast();
    }
}
