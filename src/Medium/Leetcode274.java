package Medium;

import java.util.Arrays;

public class Leetcode274 {
    public int hIndex(int[] citations) {
        // sorting the citations in ascending order
        Arrays.sort(citations);
        // finding h-index by linear search
        int h = 0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=citations.length-i){
                return citations.length-i;
            }
        }
        return 0; // after the while loop, i = i' + 1
    }
}
