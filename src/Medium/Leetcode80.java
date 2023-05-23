package Medium;

class Leetcode80 {
    public int removeDuplicates(int[] nums) {
        int prev=0;
        int dups=0;
        int currCount=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=prev){
                currCount=1;
            }
            else{
                currCount++;
            }
            if(currCount>=3){
                dups++;
            }
            prev=nums[i];
            nums[i-dups]=nums[i];
        }
        return nums.length-dups;
    }
}
