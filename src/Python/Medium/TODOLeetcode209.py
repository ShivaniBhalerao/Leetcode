class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left=0
        right=0
        ans=len(nums)+1
        sum=0

        while left<=right and right<len(nums):
            sum+=nums[right]
            while sum>=target:
                ans=min(ans,right-left+1)
                sum-=nums[left]
                left+=1

            right+=1

        return ans if ans<=len(nums) else 0