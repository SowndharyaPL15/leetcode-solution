class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int d=nums[n-1]*nums[n-2]*nums[n-3];
        int b=nums[0]*nums[1]*nums[n-1];
        return Math.max(d,b);
    }
}