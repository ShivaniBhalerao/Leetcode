class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        longestPrefixStr=""
        index=0
        while True:
            currChar=''
            for str in strs:
                if len(str)==index:
                    return longestPrefixStr
                elif currChar=='':
                    currChar=str[index]
                elif currChar!=str[index]:
                    return longestPrefixStr
            longestPrefixStr+=currChar
            index+=1

        return longestPrefixStr