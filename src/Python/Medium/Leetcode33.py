class Solution:

    def search(self, nums: List[int], target: int) -> int:
        left=0
        right=len(nums)-1
        if len(nums)==1:
            return 0 if nums[0]==target else -1

        while left<=right:
            mid=left+(right-left)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]>=nums[left]:
                if nums[mid]>target and target>=nums[left]:
                    right=mid-1
                else:
                    left=mid+1

            elif nums[mid]<nums[left]:
                if nums[mid]<target and target<=nums[right]:
                    left=mid+1
                else:
                    right=mid-1

        return -1