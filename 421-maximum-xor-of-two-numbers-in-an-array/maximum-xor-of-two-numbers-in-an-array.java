class Solution {
    public int findMaximumXOR(int[] nums) {
        int n=0,m=0;
        for(int i=31;i>=0;i--){
            m=m | (1 <<i);
            Set<Integer>set=new HashSet<>();  
            for(int num:nums){
                set.add(num & m);
            } 
            int tmp=n | (1<< i);
            for(int p:set){
                if(set.contains(tmp^p)){
                    n=tmp;
                    break;
                }
            }
        }
        return n;
    }
}