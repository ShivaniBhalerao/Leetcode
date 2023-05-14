package Medium;

class Leetcode528 {
    int[] cumuSum;
    public Leetcode528(int[] w) {
        cumuSum=new int[w.length];
        cumuSum[0]=w[0];
        for(int i=1;i<w.length;i++){
            cumuSum[i]=cumuSum[i-1]+w[i];
        }
    }

    public int pickIndex() {
        double randomInt=cumuSum[cumuSum.length-1]*Math.random();
        int left=0;
        int right=cumuSum.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(randomInt>cumuSum[mid]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
