class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=set()
        def combination(comb,index):
            if sum(comb)>target:
                return

            if sum(comb)==target:
                ans.add(tuple(list(comb)))
                return

            for i in range(index,len(candidates)):
                comb.append(candidates[i])
                combination(comb,i)
                comb.pop()

        combination([],0)
        return list(ans)