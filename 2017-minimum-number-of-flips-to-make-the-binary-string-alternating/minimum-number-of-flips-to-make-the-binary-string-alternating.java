class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String t=s+s;
        int a=n,mis=0;
        for(int i=0;i<2*n;i++){
            char e=(i%2==0)?'0':'1';
            if(t.charAt(i)!=e){
                mis++;
            }
            if(i>=n){
                int l=i-n;
                char exp=(l%2==0)?'0':'1';
                if(t.charAt(l)!=exp){
                    mis--;
                }
            }
            if(i>=n-1){
                int m=n-mis;
                a=Math.min(a,Math.min(mis,m));
            }
        }
        return a;
    }
}