package Easy;

public class Leetcode977 {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int ptr=nums.length-1;;
        while(left<=right){
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                ans[ptr]=nums[right]*nums[right];
                ptr--;
                right--;
            }
            else{
                ans[ptr]=nums[left]*nums[left];
                ptr--;
                left++;
            }
        }
        return ans;
    }
}
