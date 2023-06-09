class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]
        next=nums[len(nums)-1]
        nextToNext=0
        current=0
        for i in range(len(nums)-2,-1,-1):
            current=max(next,nextToNext+nums[i])
            nextToNext=next
            next=current
        return next