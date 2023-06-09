class Solution:
    def rob(self, nums: List[int]) -> int:
        def selectiveRob(nums):
            if len(nums)==0:
                return 0
            if len(nums)==1:
                return nums[0]
            next=nums[len(nums)-1]
            nextToNext=0
            for i in range(len(nums)-2,-1,-1):
                current=max(next,nums[i]+nextToNext)
                nextToNext=next
                next=current
            return next

        if len(nums)==1:
            return nums[0]
        return max(selectiveRob(nums[0:len(nums)-1]),selectiveRob(nums[1:]))

