package Medium;

//Referred LC approach 1
public class Leetcode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix[0].length*matrix.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==matrix[mid/matrix[0].length][mid%matrix[0].length]){
                return true;
            }
            if(target>matrix[mid/matrix[0].length][mid%matrix[0].length]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
