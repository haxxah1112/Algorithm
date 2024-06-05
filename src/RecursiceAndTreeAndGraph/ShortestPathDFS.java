package RecursiceAndTreeAndGraph;

public class ShortestPathDFS {
    TreeNode root;
    public int dfs(int level, TreeNode root) {
        if (root.left == null && root.right == null) return level;
        return Math.min(dfs(level+1, root.left), dfs(level+1, root.right));
    }

    public static void main(String[] args) {
        ShortestPathDFS tree = new ShortestPathDFS();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.println(tree.dfs(0, tree.root));
    }
}
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}