class Solution:
    def compress(self, chars: List[str]) -> int:
        curr=0
        currIndex=0
        ans=0
        currCount=0
        ptr=0
        while(currIndex<len(chars)):
            if chars[curr]==chars[currIndex]:
                currCount+=1
                currIndex+=1
            if currIndex==len(chars) or chars[curr]!=chars[currIndex]:
                chars[ptr]=chars[curr]
                ptr+=1
                if currCount<=1:
                    curr=currIndex
                    currCount=0
                    continue

                for digit in str(currCount):
                    chars[ptr]=digit
                    ptr+=1

                curr=currIndex
                currCount=0

        return ptr
