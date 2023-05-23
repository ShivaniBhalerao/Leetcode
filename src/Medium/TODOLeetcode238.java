package Medium;

import java.util.Arrays;

public class TODOLeetcode238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,1);
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        int prevRight=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*prevRight;
            prevRight=prevRight*nums[i];
        }
        return ans;
    }
}
