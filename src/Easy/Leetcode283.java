package Easy;

public class Leetcode283 {
    public void moveZeroes(int[] nums) {
        int numZeroes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                numZeroes++;
            }
            else{
                nums[i-numZeroes]=nums[i];
            }
        }
        int index=nums.length-1;
        while(numZeroes>0){
            nums[index]=0;
            numZeroes--;
            index--;
        }
    }
}
