public class Diameter_Of_Binary_Tree_543 {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int[] max = new int[1];
        dfs(root, max);
        return max[0];
    }

    private int dfs(TreeNode node, int[] max) {
        if (node == null) return 0;
        int left = dfs(node.left, max);
        int right = dfs(node.right, max);
        max[0] = Math.max(max[0], left + right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
//        Diameter_Of_Binary_Tree_543 obj = new Diameter_Of_Binary_Tree_543();
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(5);
//        root.right.right.left = new TreeNode(7);
//        root.right.left = new TreeNode(4);
//        root.right.left.right = new TreeNode(6);
//        root.right.left.right.right = new TreeNode(10);
//        System.out.println(obj.diameterOfBinaryTree(root)); // Output: 3
    }

}
