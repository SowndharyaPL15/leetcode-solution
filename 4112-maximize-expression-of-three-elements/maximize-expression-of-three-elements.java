class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
            }
            else if(nums[i] > m2){
                 m2 = nums[i];
            }
            if(nums[i] < min){ 
                min = nums[i];
            }
        }
        return m1 + m2 - min;
    }
}