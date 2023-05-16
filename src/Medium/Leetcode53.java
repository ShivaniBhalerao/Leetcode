package Medium;

class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int runningSum=nums[0];
        int maxSub=nums[0];
        for(int i=1;i<nums.length;i++){
            if(runningSum+nums[i]<nums[i]){//If previous sum is reducing the current number, then start calculating from the current number as it is the highest.
                maxSub=Math.max(maxSub,Math.max(runningSum,nums[i]));
                runningSum=nums[i];
                continue;
            }
            runningSum+=nums[i];
            maxSub=Math.max(maxSub,runningSum);
        }
        return maxSub;
    }
}
