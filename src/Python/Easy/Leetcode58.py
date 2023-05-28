class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        lastWordLen=0
        for i in range(len(s)-1,-1,-1):
            if s[i]==' ':
                if lastWordLen>0:
                    break
                else:
                    continue
            else:
                lastWordLen+=1

        return lastWordLen

#Alternate solution
#class Solution:
#    def lengthOfLastWord(self, s: str) -> int:
#        return 0 if len(s)==0 or s.isspace() else len(s.split()[-1])