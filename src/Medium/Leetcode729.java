package Medium;

import java.util.Map;
import java.util.TreeMap;

class Leetcode729 {
    TreeMap<Integer,Integer> sortedMap;
    public Leetcode729() {
        sortedMap=new TreeMap<>();
    }

    public boolean book(int start, int end) {
        if(sortedMap.size()==0){
            sortedMap.put(start,end);
            return true;
        }
        Map.Entry<Integer,Integer> beforeStart=sortedMap.floorEntry(start);
        Map.Entry<Integer,Integer> afterEnd=sortedMap.ceilingEntry(start);
        if((beforeStart==null || beforeStart.getValue()<=start) && (afterEnd==null || afterEnd.getKey()>=end)){
            sortedMap.put(start,end);
            return true;
        }
        return false;
    }
}
