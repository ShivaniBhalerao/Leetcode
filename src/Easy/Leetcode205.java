package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        Set<Character> mapped=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(mapped.contains(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
                mapped.add(t.charAt(i));
            }
            else if(map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
