package Medium;

import java.util.HashSet;
import java.util.Set;

public class TODOLeetcode36 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet;
        for(int i=0;i<9;i++){
            rowSet=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && rowSet.contains(board[i][j])){
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }

        Set<Character> colSet;
        for(int i=0;i<board[0].length;i++){
            colSet=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]!='.' && colSet.contains(board[j][i])){
                    return false;
                }
                colSet.add(board[j][i]);
            }
        }

        Set<Character> gridSet;
        int row=0;
        int col=0;
        while(col<9){
            row=0;
            gridSet=new HashSet<>();
            while(row<9){
                if(board[row][col]!='.' && gridSet.contains(board[row][col])){
                    return false;
                }
                gridSet.add(board[row][col]);
                col++;
                if(col%3==0){
                    row++;
                    if(row%3==0){
                        gridSet=new HashSet<>();
                    }
                    if(row%9!=0){
                        col-=3;
                    }
                }
            }
        }
        return true;
    }
}
