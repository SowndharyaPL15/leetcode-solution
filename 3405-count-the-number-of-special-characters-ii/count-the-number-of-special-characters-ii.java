class Solution {
    public int numberOfSpecialChars(String word) {
        boolean [][] b=new boolean[2][27];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int d=ch&31;
            int c=(ch>>5)&1;
            b[c][d]=c == 0 || !b[0][d];
        }
        int res=0;
        for(int i=1;i<27;i++){
            if(b[0][i] && b[1][i]){
                res++;
            }
        }
        return res;
    }
}