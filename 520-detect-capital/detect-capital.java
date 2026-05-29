class Solution {
    public boolean detectCapitalUse(String word) {
        int u=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                u++;
            }
        }
        if(u==word.length()){
            return true;
        }
        else if(u==0){
            return true;
        }
        else if(u==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        else{
            return false;
        }
    }
}