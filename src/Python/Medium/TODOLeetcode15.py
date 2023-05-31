class Solution:

    def twoSum(self, nums: List[int],target_pos: int):
        temp_ans_set=set()
        left=target_pos+1
        right=len(nums)-1
        while left<right:
            if(nums[target_pos]+nums[left]+nums[right])==0:
                temp_ans_set.add((nums[target_pos],nums[left],nums[right]))
                left+=1
                right-=1
                while left<right and nums[left]==nums[left-1]:
                    left+=1

                while left<right and nums[right]==nums[right+1]:
                    right-=1

            elif (nums[target_pos]+nums[left]+nums[right])>0:
                right-=1

            else:
                left+=1

        return temp_ans_set

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ansSet=set()
        for i in range(0,len(nums)-2):
            if(i==0 or nums[i]!=nums[i-1]):
                ansSet|=self.twoSum(nums,i)

        return list(ansSet)