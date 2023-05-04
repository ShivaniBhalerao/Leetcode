package Medium;

public class TODOLeetcode5 {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int pali=Math.max(getPali(s,i,i),getPali(s,i,i+1));
            if(pali>end-start){
                start=i-(pali-1)/2;
                end=i+pali/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int getPali(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
