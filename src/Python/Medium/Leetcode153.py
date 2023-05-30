class Solution:
    def findMin(self, nums: List[int]) -> int:
        left=0
        right=len(nums)-1

        if nums[left]<=nums[right]:
            return nums[left]

        while left<=right:
            mid=(left+right)//2
            if mid>0 and nums[mid]<nums[mid-1]:
                return nums[mid]
            elif nums[mid]>nums[right]:
                left=mid+1
            elif nums[mid]<nums[right] or nums[mid]>nums[left]:
                right=mid-1

        return -1

