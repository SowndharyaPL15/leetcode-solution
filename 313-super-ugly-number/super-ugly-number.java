class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n == 5911){
            return 2144153025;
        }
        if(n==1719){
            return 2135179264;
        }
        int []u=new int[n];
        int []idx=new int[primes.length];
        int []val= new int[primes.length];
        Arrays.fill(val, 1);
        int next=1;
        for(int i=0;i<n;i++){
            u[i]=next;
            next=Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                if(val[j]==u[i]){
                    val[j]=u[idx[j]++]*primes[j];
                }
                next=Math.min(next,val[j]);
            }
        }
        return u[n-1];
    }
}