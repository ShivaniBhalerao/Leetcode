package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Leetcode539 {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minList=new ArrayList<>();
        for(String timePoint:timePoints){
            minList.add(hourMinToMin(timePoint));
        }

        Collections.sort(minList,Collections.reverseOrder());

        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<minList.size()-1;i++){
            minDiff=Math.min(minDiff,minList.get(i)-minList.get(i+1));
        }
        return Math.min(minDiff,1440-minList.get(0)+minList.get(minList.size()-1));
    }
    public int hourMinToMin(String time){
        String[] timeArr=time.split(":");
        return Integer.parseInt(timeArr[1])+60*Integer.parseInt(timeArr[0]);
    }
}
