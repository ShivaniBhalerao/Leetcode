class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=0
        col=len(matrix[0])-1
        while row<len(matrix) and col>=0:
            if matrix[row][col]==target:
                return True
            elif matrix[row][col]>target:
                col-=1
            else:
                row+=1

        return False

#simple but higher TC solution: binary search.
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for rows in range(len(matrix)):
            if matrix[rows][len(matrix[0])-1]<target:
                continue
            elif matrix[rows][0]>target:
                return False

            left=0
            right=len(matrix[0])-1

            while left<=right:
                mid=(left+right)//2
                if matrix[rows][mid]==target:
                    return True
                elif matrix[rows][mid]>target:
                    right=mid-1
                else:
                    left=mid+1

        return False
"""
