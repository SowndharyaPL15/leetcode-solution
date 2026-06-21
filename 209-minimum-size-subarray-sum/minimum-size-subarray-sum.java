class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int l=0,len=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>=target){
                len=Math.min(len,r-l+1);
                sum-=arr[l];
                l++;
            }
        }
        return (len==Integer.MAX_VALUE)?  0 :len;
    }
}