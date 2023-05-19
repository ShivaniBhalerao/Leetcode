package Easy;

public class Leetcode566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        int[][] ans=new int[r][c];
        int itemNum=0;
        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                ans[itemNum/c][itemNum%c]=mat[row][col];
                itemNum++;
            }
        }
        return ans;
    }
}
