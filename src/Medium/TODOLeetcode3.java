package Medium;

import java.util.HashMap;
import java.util.Map;

//Similar to LC approach 3. My logic
class TODOLeetcode3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> lastSeenPosMap=new HashMap<>();
        int longestSubstringLen=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            if(lastSeenPosMap.containsKey(s.charAt(right))){
                if(lastSeenPosMap.get(s.charAt(right))>=left){
                    left=lastSeenPosMap.get(s.charAt(right))+1;
                }
            }
            lastSeenPosMap.put(s.charAt(right),right);
            right++;
            longestSubstringLen=Math.max(longestSubstringLen,right-left);
        }
        return longestSubstringLen;
    }
}
