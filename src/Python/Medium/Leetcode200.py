class Solution:

    def checkIsland(self,grid,row,col):

        if row<0 or row==len(grid) or col<0 or col==len(grid[0]):
            return grid
        if grid[row][col]!="1":
            return grid

        grid[row][col]="0"
        grid=self.checkIsland(grid,row+1,col)
        grid=self.checkIsland(grid,row-1,col)
        grid=self.checkIsland(grid,row,col+1)
        grid=self.checkIsland(grid,row,col-1)

        return grid

    def numIslands(self, grid: List[List[str]]) -> int:
        islands=0
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col]=="1":
                    islands+=1
                    grid=self.checkIsland(grid,row,col)

        return islands