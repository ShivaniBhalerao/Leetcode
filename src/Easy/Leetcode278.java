package Easy;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//view the commented part in the leetcode
public class Leetcode278 // extends VersionControl
{
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
//        if(!isBadVersion(n)){
//            return -1;
//        }
        while(left<=right){
            int mid=left+(right-left)/2;
//            if(isBadVersion(mid)){
//                right=mid-1;
//            }
//            else{
//                left=mid+1;
//            }
        }
        return left;
    }
}
