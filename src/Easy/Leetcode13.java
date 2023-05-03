package Easy;

//My solution: https://leetcode.com/problems/roman-to-integer/submissions/943559690/
//For this solution, referred approach 3

import java.util.HashMap;
import java.util.Map;

public class Leetcode13 {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int prev=map.get(s.charAt(s.length()-1));
        int ans=prev;
        for(int i=s.length()-2;i>=0;i--){
            int curr=map.get(s.charAt(i));
            if(prev>curr){
                ans-=curr;
            }
            else{
                ans+=curr;
            }
            prev=curr;
        }
        return ans;
    }
}
