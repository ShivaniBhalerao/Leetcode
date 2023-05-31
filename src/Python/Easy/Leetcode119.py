class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        pascal_triangle=[]
        pascal_triangle.append(1)

        for i in range(1,rowIndex+1):
            for j in range(i-1,0,-1):
                pascal_triangle[j]=pascal_triangle[j-1]+pascal_triangle[j]
            pascal_triangle.append(1)

        return pascal_triangle