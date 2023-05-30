class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count=0
        index=0
        while index<len(nums):
            if nums[index]==val:
                count+=1
                index+=1
                continue

            nums[index-count]=nums[index]
            index+=1

        return len(nums)-count