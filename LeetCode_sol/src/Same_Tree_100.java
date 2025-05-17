
class Same_Tree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p,q);
    }

    private boolean dfs(TreeNode p, TreeNode q){
        if (q == null && p == null) return true;
        if (p == null || q == null) return false;
        if (q.val != p.val) return false;
        return (dfs(p.left,q.left) && dfs(p.right,q.right));
    }
}

