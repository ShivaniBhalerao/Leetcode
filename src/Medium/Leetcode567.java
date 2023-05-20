package Medium;

import java.util.HashMap;
import java.util.Map;

public class Leetcode567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        Map<Character,Integer> countMap=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            countMap.put(s1.charAt(i),countMap.getOrDefault(s1.charAt(i),0)+1);
        }

        Map<Character,Integer> tempCountMap;
        for(int i=0;i<=s2.length()-s1.length();i++){
            tempCountMap=new HashMap<>(countMap);

            for(int j=i;j<i+s1.length();j++){
                if(!tempCountMap.containsKey(s2.charAt(j))){
                    continue;
                }
                tempCountMap.put(s2.charAt(j),tempCountMap.get(s2.charAt(j))-1);
                if(tempCountMap.get(s2.charAt(j))==0){
                    tempCountMap.remove(s2.charAt(j));
                }
            }
            if(tempCountMap.size()==0){
                return true;
            }
        }
        return false;
    }
}
