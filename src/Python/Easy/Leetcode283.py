class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero_count=0
        for i,num in enumerate(nums):

            if num==0:
                zero_count+=1
            else:
                nums[i-zero_count]=nums[i]



        for i in range(zero_count):
            nums[len(nums)-1-i]=0
