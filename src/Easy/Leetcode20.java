package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode20 {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size()==0 || map.get(stack.pop())!=s.charAt(i)){
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}
