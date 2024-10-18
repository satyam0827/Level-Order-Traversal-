import java.util.*;
import java.util.LinkedList;

public class Tree {
    static class TreeNode{
        int val ;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int val){
            this.val = val;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
    public static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode top = q.remove();
            if(top == null){
                System.out.println();
                if(!q.isEmpty()){
                       q.add(null); 
                }

            }else{
                System.out.print(top.val + " ");
                if(top.leftNode != null) q.add(top.leftNode);
                if(top.rightNode != null) q.add(top.rightNode);
            }
        }

    }
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(4);
        root.leftNode = new TreeNode(2);
        root.rightNode = new TreeNode(3);
        root.leftNode.leftNode = new TreeNode(6);
        root.leftNode.rightNode = new TreeNode(7);
        root.rightNode.rightNode = new TreeNode(8);
        root.rightNode.leftNode = new TreeNode(9);
        levelOrder(root);
    }
}
