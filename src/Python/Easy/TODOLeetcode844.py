class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        stack=[]
        for char in s:
            if char=='#' and len(stack)>0:
                stack.pop()
            elif char!='#':
                stack.append(char)

        stack2=[]
        for char in t:
            if char=='#' and len(stack2)>0:
                stack2.pop()
            elif char!='#':
                stack2.append(char)

       # print(stack, stack2)
        return stack==stack2

"""
Try to complete below code: O(1) space
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        currS=len(s)-1
        currT=len(t)-1
        skipS=0
        skipT=0
        print(currS, currT)

        while currS>=0 and currT>=0:
            while currS>=0 and (skipS>0 or s[currS]=='#'):
                if s[currS]=='#':
                    skipS+=2

                skipS-=1
                currS-=1




            while currT>=0 and (skipT>0 or t[currT]=='#'):
                if t[currT]=='#':
                    skipT+=2

                skipT-=1
                currT-=1



            print(currS, currT)

            if currS>=0 and currT>=0 and s[currS]!=t[currT]:
                return False
            elif currS<0 and currT<0:
                return True
            elif currS<0 or currT<0:
                return False

            currS-=1
            currT-=1

        return currS<0 and currT<0
"""


