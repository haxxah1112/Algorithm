package RecursiceAndTreeAndGraph;


import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBFS {
    TreeNode root;
    public int bfs(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i=0; i<queueSize; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.right == null && currentNode.left == null) return level;
                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) {
        ShortestPathBFS tree = new ShortestPathBFS();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.println(tree.bfs(tree.root));
    }

}
