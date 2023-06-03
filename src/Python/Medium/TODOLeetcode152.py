class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0

        minTillNow=nums[0]
        maxTillNow=nums[0]
        maxProduct=nums[0]

        for i in range(1,len(nums)):
            tempMin=min(nums[i],minTillNow*nums[i],maxTillNow*nums[i])
            maxTillNow=max(nums[i],maxTillNow*nums[i],minTillNow*nums[i])
            minTillNow=tempMin

            maxProduct=max(maxProduct,maxTillNow)

        return maxProduct


