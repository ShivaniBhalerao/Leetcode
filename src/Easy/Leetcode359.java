package Easy;

import java.util.HashMap;
import java.util.Map;

class Logger {
    Map<String,Integer> map;

    public Logger() {
        map=new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message) || timestamp-map.get(message)>=10){
            map.put(message,timestamp);
            return true;
        }
        return false;
    }
}

public class Leetcode359 {
    int timestamp=0;
    String message="Hello";
    Logger obj = new Logger();
    boolean param_1 = obj.shouldPrintMessage(timestamp,message);
}
