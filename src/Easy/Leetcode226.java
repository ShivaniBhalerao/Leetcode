package Easy;

import java.util.LinkedList;
import java.util.Queue;

//BFS
//Maybe referred approach 2
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return null;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode front=queue.poll();
            TreeNode temp=front.left;
            front.left=front.right;
            front.right=temp;
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
        return root;
    }
}
