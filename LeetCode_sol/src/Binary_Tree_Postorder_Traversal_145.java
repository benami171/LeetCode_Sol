import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Binary_Tree_Postorder_Traversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        return helper(root,new ArrayList());
    }

    public List<Integer> helper(TreeNode root , List<Integer> ans) {
        if ( root == null) return ans;
        Stack<TreeNode> node_stack = new Stack<>();
        ans = helper(root.left,ans);
        ans = helper(root.right,ans);
        ans.add(root.val);
        return ans;
    }

}
