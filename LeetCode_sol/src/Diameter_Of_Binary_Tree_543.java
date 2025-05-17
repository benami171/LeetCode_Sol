public class Diameter_Of_Binary_Tree_543 {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        dfs(root, max);
        return max[0];
    }

    private int dfs(TreeNode node, int[] max) {
        if (node == null) return 0;

        int left = dfs(node.left, max);
        int right = dfs(node.right, max);

        max[0] = Math.max(max[0], left + right);
        int currReturn = Math.max(left, right) + 1;
        return currReturn;
    }


    public static void main(String[] args) {
        Diameter_Of_Binary_Tree_543 obj = new Diameter_Of_Binary_Tree_543();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        System.out.println(obj.diameterOfBinaryTree(root)); // Output: 4
    }

}
