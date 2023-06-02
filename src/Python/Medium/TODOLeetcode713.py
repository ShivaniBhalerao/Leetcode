#copied approach 2
class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k<=1:
            return 0

        ans=0
        left=0
        prod=1

        for right in range(len(nums)):
            prod*=nums[right]
            while left<=right and prod>=k:
                prod/=nums[left]
                left+=1
            ans+=right-left+1

        return ans


