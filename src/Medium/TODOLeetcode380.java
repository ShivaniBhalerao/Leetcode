package Medium;

import java.util.*;

public class TODOLeetcode380 {
    Map<Integer,Integer> map;
    List<Integer> list;
    Random random;

    public TODOLeetcode380() {
        map=new HashMap<>();
        list=new ArrayList<>();
        random=new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,map.size());
        list.add(list.size(),val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index=map.get(val);
        int last=list.get(list.size()-1);
        map.put(last,index);
        list.remove(index);
        map.remove(val);
        list.add(index,last);
        list.remove(list.size()-1);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
