package Easy;

public class Leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] countArr=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            countArr[ransomNote.charAt(i)-'a']++;
        }

        int uniqueLetters=0;
        for(int i=0;i<26;i++){
            if(countArr[i]>0){
                uniqueLetters++;
            }
        }

        for(int i=0;i<magazine.length();i++){
            int index=magazine.charAt(i)-'a';
            if(countArr[index]>0){
                countArr[index]--;
                if(countArr[index]==0){
                    uniqueLetters--;
                }
            }
        }
        return uniqueLetters==0;
    }
}
