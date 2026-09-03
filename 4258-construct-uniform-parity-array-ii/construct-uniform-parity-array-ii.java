class Solution {
    public boolean uniformArray(int[] nums1) {
        int a=nums1[0],o=0;
        for(int x:nums1){
            a=Math.min(a,x);
            o|=x&1;
        }
        return (a&1)==o;
    }
}