import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal_144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList<>());
    }

    private List<Integer> dfs(TreeNode node,List<Integer> list){
        if(node == null) return list;
        list.add(node.val);
        list = dfs(node.left,list);
        list = dfs(node.right,list);
        return list;
    }



}