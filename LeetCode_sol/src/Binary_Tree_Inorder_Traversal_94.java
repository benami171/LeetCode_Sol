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
class Binary_Tree_Inorder_Traversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList());
    }

    private List<Integer> dfs(TreeNode node,List<Integer> list){
        if(node == null) return list;
        list = dfs(node.left,list);
        list.add(node.val);
        list = dfs(node.right,list);
        return list;
    }
}

