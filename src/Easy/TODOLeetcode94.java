package Easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TODOLeetcode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            inOrderList.add(curr.val);
            curr=curr.right;
        }

        return inOrderList;
    }
}
