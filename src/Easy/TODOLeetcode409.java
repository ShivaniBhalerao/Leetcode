package Easy;

//Referred LC approach 1
class TODOLeetcode409 {
    public int longestPalindrome(String s) {
        int[] countArr=new int[128];
        for(int i=0;i<s.length();i++){
            countArr[s.charAt(i)]++;
        }

        int ans=0;
        for(int i=65;i<123;i++){
            ans+=countArr[i]/2*2;
            if(ans%2==0 && countArr[i]%2==1){
                ans++;
            }
        }
        return ans;
    }
}
