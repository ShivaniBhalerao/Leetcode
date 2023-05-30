class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        queue=collections.deque()
        index=0
        next=-1
        while index<=(len(haystack)-len(needle)) and haystack[index]!=needle[0]:
            index+=1

        while index<=(len(haystack)-len(needle)):
            i=0
            for i in range(0,len(needle)):
                if haystack[index+i]!=needle[i]:
                    break
                elif i==(len(needle)-1):
                    return index

                if haystack[index+i]==needle[0] and next<=index:
                    next=index+i

            if next>index:
                index=next
            else:
                index+=i
                while index<=(len(haystack)-len(needle)) and haystack[index]!=needle[0]:
                    index+=1
        return -1