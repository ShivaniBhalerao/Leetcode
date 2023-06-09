#analyze the return statement in longestPalindrome method
class Solution:
    def pali(self,s,left,right):
        while(left>=0 and right<len(s) and s[left]==s[right]):
            left-=1
            right+=1
        return right-left-1

    def longestPalindrome(self, s: str) -> str:
        ansLen=0
        ansMid=0
        for i in range(len(s)):
            odd=self.pali(s,i,i)
            if odd>ansLen:
                ansLen=odd
                ansMid=i

            even=self.pali(s,i,i+1)
            if even>ansLen:
                ansLen=even
                ansMid=i

        return s[ansMid-(ansLen-1)//2:ansMid+(ansLen+2)//2]