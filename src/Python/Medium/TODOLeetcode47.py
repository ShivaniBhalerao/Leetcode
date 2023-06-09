class Solution:
    def counter(self,nums):
        count=dict()
        for num in nums:
            if num not in count:
                count[num]=0

            count[num]+=1
        return count

    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        ans=set()
        def backTrack(comb,counter):
            if len(comb)==len(nums):
                ans.add(tuple(list(comb)))
                return

            for num in nums:
                if counter[num]>0:
                    comb.append(num)
                    counter[num]-=1
                    backTrack(comb,counter)
                    counter[num]+=1
                    comb.pop()

        backTrack([],self.counter(nums))
        return list(ans)
