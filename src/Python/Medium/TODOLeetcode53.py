class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        left=0
        right=1
        tempSum=nums[0]
        maxSum=tempSum

        for i in range(1,len(nums)):
            tempSum=max(nums[i],nums[i]+tempSum)
            maxSum=max(tempSum,maxSum)

        return maxSum