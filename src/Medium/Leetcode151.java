package Medium;

public class Leetcode151 {
    public String reverseWords(String s) {
        String[] strArr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=strArr.length-1;i>=0;i--){
            if(strArr[i].length()>0){
                ans.append(strArr[i]);
                ans.append(" ");
            }
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
