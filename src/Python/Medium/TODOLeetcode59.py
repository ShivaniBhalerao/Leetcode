class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        curr_way=0 #0-right 1-down 2-left 3-up
        ans=[]
        for row in range(n):
            curr_row=[]
            for col in range(n):
                curr_row.append(0)
            ans.append(curr_row)

        row=0
        col=0

        for i in range(1,n*n+1):
            ans[row][col]=i
            if curr_way==0:
                if col==n-1 or ans[row][col+1]!=0:
                    curr_way=(curr_way+1)%4

            elif curr_way==1:
                if row==n-1 or ans[row+1][col]!=0:
                    curr_way=(curr_way+1)%4

            elif curr_way==2:
                if col==0 or ans[row][col-1]!=0:
                    curr_way=(curr_way+1)%4

            elif curr_way==3:
                if row==0 or ans[row-1][col]!=0:
                    curr_way=(curr_way+1)%4

            if curr_way==0:
                col+=1
            elif curr_way==1:
                row+=1
            elif curr_way==2:
                col-=1
            elif curr_way==3:
                row-=1

        return ans

