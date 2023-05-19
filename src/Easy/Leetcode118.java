package Easy;

import java.util.LinkedList;
import java.util.List;

public class Leetcode118 {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        List<List<Integer>> ans=new LinkedList<>();
        ans.add(list);
        if(numRows==1){
            return ans;
        }
        for(int i=2;i<=numRows;i++){
            list=new LinkedList<>();
            list.add(1);
            for(int j=1;j<i-1;j++){
                list.add(ans.get(ans.size()-1).get(j-1)+ans.get(ans.size()-1).get(j));
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }
}
