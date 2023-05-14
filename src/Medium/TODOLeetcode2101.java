//Also refer to the solution from Leetcode
package Medium;

import java.util.HashSet;
import java.util.Set;

class TODOLeetcode2101 {
    int maxDetonation=1;
    public int maximumDetonation(int[][] bombs) {
        for(int i=0;i<bombs.length;i++){
            Set<Integer> isDetonated=new HashSet<>();
            isDetonated.add(i);
            detonate(bombs[i],bombs,0,isDetonated);
        }
        return maxDetonation;
    }
    public void detonate(int[] startBomb, int[][] bombs,int detonation,Set<Integer> isDetonated){
        for(int i=0;i<bombs.length;i++){
            if(!isDetonated.contains(i) && isDetonable(startBomb,bombs[i])){
                isDetonated.add(i);
                maxDetonation=Math.max(maxDetonation,isDetonated.size());
                detonate(bombs[i],bombs,detonation,isDetonated);
            }
        }
    }
    public boolean isDetonable(int[] point1, int[] point2){
        return Math.sqrt(Math.pow(point2[0]-point1[0],2)+Math.pow(point2[1]-point1[1],2))<=point1[2];
    }
}
