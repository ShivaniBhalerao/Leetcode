class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        outputArr=[]
        prod=1
        for num in nums:
            outputArr.append(prod)
            prod*=num

        prod=1
        for i in range(len(nums)-1,-1,-1):
            outputArr[i]*=prod
            prod*=nums[i]

        return outputArr

