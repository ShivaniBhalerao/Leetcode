class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        index=1
        count=0
        while index<len(nums):
            if nums[index]==nums[index-1]:
                count+=1
                index+=1
                continue

            nums[index-count]=nums[index]
            index+=1

        return len(nums)-count