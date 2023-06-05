#Also try approach 2
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramMap=dict()
        for str in strs:
            sortedStr=tuple(sorted(list(str)))
            if sortedStr not in anagramMap.keys():
                anagramMap[sortedStr]=[]
            anagramMap[sortedStr].append(str)

        ans=[]
        for anagramList in anagramMap.values():
            ans.append(anagramList)

        return ans