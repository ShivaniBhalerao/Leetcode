class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum=0
        ans=0
        dictionary=dict()
        dictionary[0]=1

        for num in nums:
            sum+=num
            if (sum-k) in dictionary:
                ans+=dictionary[sum-k]

            if sum in dictionary:
                dictionary[sum]+=1
            else:
                dictionary[sum]=1

        return ans
