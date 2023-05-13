package Medium;

import java.util.TreeMap;

public class Leetcode12 {
    public String intToRoman(int num) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        StringBuilder ans=new StringBuilder();
        while(num>0){
            int nextVal=map.floorKey(num);
            num-=nextVal;
            ans.append(map.get(nextVal));
        }
        return ans.toString();
    }
}
