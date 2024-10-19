import java.util.*;

public class DFS_Traversal {
    static class TreeNode {
        int val;
        TreeNode leftNode,rightNode;

        TreeNode(int val) {
            this.val = val;
            this.leftNode = null;
            this.rightNode = null;
        }

    }
    public static void Dfs(TreeNode root) {
        if (root == null)
            return;
        Dfs(root.leftNode);
        System.out.print(root.val + " ");
        Dfs(root.rightNode);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftNode = new TreeNode(2);
        root.rightNode = new TreeNode(3);
        root.leftNode.leftNode = new TreeNode(4);
        root.leftNode.rightNode = new TreeNode(5);
        root.rightNode.leftNode = new TreeNode(6);
        root.rightNode.rightNode = new TreeNode(7);
        Dfs(root);
    }
}
