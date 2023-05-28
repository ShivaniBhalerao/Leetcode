class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count=0
        current_number=None

        for num in nums:
            if count==0:
                current_number=num

            if num==current_number:
                count+=1
            else:
                count-=1

        return current_number