package Medium;

import java.util.*;


class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;
    TreeNodes() {}
    TreeNodes(int val) { this.val = val; }
    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Leetcode1110 {
    public List<TreeNodes> delNodes(TreeNodes root, int[] to_delete) {
        Set<Integer> set=new HashSet<>();
        for(int num:to_delete){
            set.add(num);
        }

        List<TreeNodes> ans=new ArrayList<>();
        Queue<TreeNodes> queue=new LinkedList<>();
        queue.add(root);
        if(!set.contains(root.val)){
            ans.add(root);
        }
        while(!queue.isEmpty()){
            TreeNodes front=queue.poll();
            if(set.contains(front.val)){
                if(front.left!=null && !set.contains(front.left.val)){
                    ans.add(front.left);
                }
                if(front.right!=null && !set.contains(front.right.val)){
                    ans.add(front.right);
                }
            }
            if(front.left!=null){
                queue.add(front.left);
                if(set.contains(front.left.val)){
                    front.left=null;
                }
            }
            if(front.right!=null){
                queue.add(front.right);
                if(set.contains(front.right.val)){
                    front.right=null;
                }
            }
        }
        return ans;
    }
}