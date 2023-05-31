class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rows=len(matrix)
        for i in range(0,rows//2+rows%2):
            for j in range(0,rows//2):
                temp=matrix[i][j]
                matrix[i][j]=matrix[rows-j-1][i]
                matrix[rows-j-1][i]=matrix[rows-i-1][rows-j-1]
                matrix[rows-i-1][rows-j-1]=matrix[j][rows-i-1]
                matrix[j][rows-i-1]=temp
"""
temp=0,0
0,0=2,0
2,0=2,2
2,2=0,2
0,2=temp

temp=0,1
0,1=1,0
1,0=2,1
2,1=1,2
1,2=temp

temp=i,j
i,j=rows-j,i
rows-j,i=rows-i,rows-j
rows-i,rows-j=j,rows-i
j,rows-i=temp

temp=0,2
0,2=1,0
1,0=3,1
3,1=2,3
2,3=temp
"""