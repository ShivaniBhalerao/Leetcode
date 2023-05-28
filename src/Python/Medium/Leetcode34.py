class Solution:

    def searchStartOrEnd(self,nums: List[int], target:int, isStart: bool):
        left=0
        right=len(nums)-1
        while left<=right:
            mid=left+int((right-left)/2)
            if isStart and nums[mid]==target:
                if mid==left or nums[mid]!=nums[mid-1]:
                    return mid
                else:
                    right=mid-1
            elif nums[mid]==target:
                if mid==right or nums[mid]!=nums[mid+1]:
                    return mid
                else:
                    left=mid+1
            elif nums[mid]<target:
                left=mid+1
            else:
                right=mid-1

        return -1

    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if len(nums)==0:
            return [-1,-1]

        start=self.searchStartOrEnd(nums, target,True)
        end=self.searchStartOrEnd(nums,target,False)

        return [start,end]