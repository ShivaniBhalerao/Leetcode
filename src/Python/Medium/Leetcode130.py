class Solution:
    def dfs(self,board,currX,currY,switch_from,switch_to,m,n):
        if currX>=m or currY>=n or currX<0 or currY<0 or board[currX][currY]!="O":
            return board

        board[currX][currY]="0"
        board=self.dfs(board,currX-1,currY,switch_from,switch_to,m,n)
        board=self.dfs(board,currX,currY-1,switch_from,switch_to,m,n)
        board=self.dfs(board,currX+1,currY,switch_from,switch_to,m,n)
        board=self.dfs(board,currX,currY+1,switch_from,switch_to,m,n)
        return board

    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m=len(board)
        n=len(board[0])

        for i in range(m):
            if board[i][0]=="O":
                board=self.dfs(board,i,0,"O","0",m,n)
            if board[i][n-1]=="O":
                board=self.dfs(board,i,n-1,"O","0",m,n)

        for i in range(n):
            if board[0][i]=="O":
                board=self.dfs(board,0,i,"O","0",m,n)
            if board[m-1][i]=="O":
                board=self.dfs(board,m-1,i,"O","0",m,n)

        for i in range(m):
            for j in range(n):
                if board[i][j]=="O":
                    board[i][j]="X"
                if board[i][j]=="0":
                    board[i][j]="O"

