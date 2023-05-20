package Medium;

import java.util.LinkedList;
import java.util.List;

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

//DFS solution
public class Leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList=new LinkedList<>();
        dfs(root,0,levelOrderList);
        return levelOrderList;
    }

    public void dfs(TreeNode node, int level, List<List<Integer>> levelOrderList){
        if(node==null){
            return;
        }

        if(levelOrderList.size()==level){
            List<Integer> currLevelList=new LinkedList<>();
            currLevelList.add(node.val);
            levelOrderList.add(currLevelList);
        }
        else{
            List<Integer> currLevelList=levelOrderList.get(level);
            currLevelList.add(node.val);
            levelOrderList.remove(level);
            levelOrderList.add(level,currLevelList);
        }

        dfs(node.left,level+1,levelOrderList);
        dfs(node.right,level+1,levelOrderList);
    }
}

/**
 * BFS Solution:
 *
 * class Solution {
 *     public List<List<Integer>> levelOrder(TreeNode root) {
 *         List<List<Integer>> levelOrderList=new LinkedList<>();
 *         if(root==null){
 *             return levelOrderList;
 *         }
 *         Queue<TreeNode> queue=new LinkedList<>();
 *         queue.add(root);
 *         while(!queue.isEmpty()){
 *             List<Integer> currLevelList=new LinkedList<>();
 *             int queueSize=queue.size();
 *             for(int i=0;i<queueSize;i++){
 *                 TreeNode front=queue.poll();
 *                 currLevelList.add(front.val);
 *                 if(front.left!=null){
 *                     queue.add(front.left);
 *                 }
 *                 if(front.right!=null){
 *                     queue.add(front.right);
 *                 }
 *             }
 *             levelOrderList.add(currLevelList);
 *         }
 *         return levelOrderList;
 *     }
 * }
 */
