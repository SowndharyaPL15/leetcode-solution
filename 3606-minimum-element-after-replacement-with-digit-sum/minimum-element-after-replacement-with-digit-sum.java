class Solution {
    public int minElement(int[] nums) {
        int a=37;
        for(int num:nums){
            int d=0;
            while(num>0){
                d+=num%10;
                num/=10;
            }
            a=Math.min(a,d);
        }
        return a;
    }
}