package Easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leetcode144 {
    List<Integer> preOrder=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return preOrder;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode front=stack.pop();
            preOrder.add(front.val);
            if(front.right!=null) stack.push(front.right);
            if(front.left!=null) stack.push(front.left);
        }
        return preOrder;
    }
}
