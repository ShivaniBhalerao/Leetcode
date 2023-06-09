class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ans=False
        def backtrack(board,i,j,curr):
            nonlocal ans
            if i<0 or j<0 or i>=len(board) or j>=len(board[0]) or curr>=len(word) or board[i][j]!=word[curr] or board[i][j]=="#":
                return

            if curr==len(word)-1:
                ans=True
                return

            curr_char=board[i][j]
            board[i][j]="#"
            backtrack(board,i+1,j,curr+1)
            backtrack(board,i,j+1,curr+1)
            backtrack(board,i-1,j,curr+1)
            backtrack(board,i,j-1,curr+1)

            board[i][j]=curr_char
            return


        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j]==word[0]:
                    backtrack(board,i,j,0)
                    if ans:
                        return True

        return False