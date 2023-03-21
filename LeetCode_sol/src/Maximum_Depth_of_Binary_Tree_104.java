import javax.swing.tree.TreeNode;

public class Maximum_Depth_of_Binary_Tree_104 {
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

        public int maxDepth(TreeNode root) {
            if ( root == null) return 0;
            return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));

        }
    }

