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
class Sum_of_Left_Leaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int ans = 0;
        if ( root == null) return 0;
        if (isLeaf(root.left)){
            ans += root.left.val;
        }
        return ans + sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }



    public boolean isLeaf (TreeNode root){
        if ( root == null) return false;
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }

}