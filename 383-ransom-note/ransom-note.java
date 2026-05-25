class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int ch[]=new int[26];
        for(char a:magazine.toCharArray()){
            ch[a-'a']++;
        }
        for(char a:ransomNote.toCharArray()){
            if(ch[a-'a']==0){
                return false;
            }
            ch[a-'a']--;
        }
        return true;
    }
}