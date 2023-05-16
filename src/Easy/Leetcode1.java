package Easy;

import java.util.HashMap;
import java.util.Map;

class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> compMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(compMap.containsKey(comp)){
                return new int[]{compMap.get(comp),i};
            }
            compMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
