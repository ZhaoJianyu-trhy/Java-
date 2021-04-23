package 回溯;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _34 {
    List<List<Integer>> ans;
    int target;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return ans;
        ans = new ArrayList<>();
        target = sum;
        List<Integer> list = new LinkedList<>();
        recur(root, list, 0);
        return ans;
    }
    private void recur(TreeNode root, List<Integer> list, int sum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (sum + root.val == target) {
                list.add(root.val);
                ans.add(list);
            }
            list.remove(list.size() - 1);
            return;
        }
        list.add(root.val);
        recur(root.left, list, sum + root.val);
        recur(root.right, list, sum + root.val);
    }
}
