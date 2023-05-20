package Medium;

public class TODOLeetcode695 {
    int maxArea=0;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    maxArea=Math.max(maxArea,dfs(grid,i,j,visited,0));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid, int row, int col, boolean[][] visited, int area){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length){
            return 0;
        }

        if(visited[row][col] || grid[row][col]==0){
            return 0;
        }

        visited[row][col]=true;

        return dfs(grid,row-1,col,visited, area) + dfs(grid,row+1,col,visited, area) + dfs(grid,row,col-1,visited, area) + dfs(grid,row,col+1,visited, area) + 1;
    }
}
