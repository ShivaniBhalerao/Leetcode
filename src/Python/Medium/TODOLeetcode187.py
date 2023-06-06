#Check TC and SC
class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:

        ans=[]
        foundSet=set()
        ans=set()
        for i in range(0,len(s)-9):
            currStr=tuple(s[i:i+10])
            if currStr in foundSet:
                ans.add("".join(currStr))
            else:
                foundSet.add(currStr)
        return list(ans)