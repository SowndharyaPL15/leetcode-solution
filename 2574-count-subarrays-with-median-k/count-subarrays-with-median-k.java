class Solution {
    public int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> p= new HashMap<>();
        p.put(0, 1); 
        int ans = 0, r = 0;
        boolean found = false;
        for (int num : nums) {
            if (num < k) {
                --r;
            }else if (num > k) {
                ++r;
            }else {
                found = true;
            }
            if (found) {
                ans += p.getOrDefault(r, 0) + p.getOrDefault(r - 1, 0);
            }else {
                p.put(r, p.getOrDefault(r, 0) + 1);
            }
        }
        return ans;
    }
}