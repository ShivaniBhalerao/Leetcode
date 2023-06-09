class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=set()
        countMap=dict()
        candidates.sort()
        print(candidates)
        for candidate in candidates:
            if candidate not in countMap:
                countMap[candidate]=0
            countMap[candidate]+=1

        def combination(comb,countMap,index):
            if sum(comb)>target:
                return

            if sum(comb)==target:
                ans.add(tuple(list(comb)))
                return
            print()
            for i in range(index,len(candidates)):
                print(index,i)
                if countMap[candidates[i]]==0:
                    continue

                comb.append(candidates[i])
                countMap[candidates[i]]-=1
                combination(comb,countMap,index+1)
                comb.pop()
                countMap[candidates[i]]+=1

        combination([],countMap,0)
        return list(ans)