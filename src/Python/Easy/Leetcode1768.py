class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        num=max(len(word1),len(word2))
        word=""
        for ptr in range(num):
            if ptr<len(word1):
                word+=word1[ptr]

            if ptr<len(word2):
                word+=word2[ptr]

        return word