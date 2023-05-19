package Easy;

public class Leetcode557 {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String sSplits[]=s.split(" ");
        for(String sSplit:sSplits){
            for(int i=sSplit.length()-1;i>=0;i--){
                sb.append(sSplit.charAt(i));
            }
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}
