class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        map=dict()
        map['2']=['a','b','c']
        map['3']=['d','e','f']
        map['4']=['g','h','i']
        map['5']=['j','k','l']
        map['6']=['m','n','o']
        map['7']=['p','q','r','s']
        map['8']=['t','u','v']
        map['9']=['w','x','y','z']

        main_ans=[]
        def backtracking(digits,curr,ans):
            nonlocal main_ans
            if curr==len(digits):
                main_ans=ans[:]
                return

            temp_ans=[]
            if curr>0:
                for char in map[digits[curr]]:
                    temp_ans+=[ans_char+char for ans_char in ans]
            else:
                temp_ans=map[digits[curr]]

            ans=temp_ans
            backtracking(digits,curr+1,ans)


        backtracking(digits,0, [])
        return main_ans