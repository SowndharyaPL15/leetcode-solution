class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        int s=(int)Math.pow(2,n);
        int [] a=new int[s];
        for(String m:nums){
            int c=Integer.parseInt(m,2);
            a[c]++;
        }
        for(int i=0;i<s;i++){
            if(a[i]==0){
                String res=Integer.toBinaryString(i);
                return "0".repeat(n-res.length())+res;
            }
        }
        return "0".repeat(n);
    }
}