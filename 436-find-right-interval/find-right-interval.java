class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(intervals[i][0], i);
        }
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            Integer key = map.ceilingKey(end);
            if (key == null)
                ans[i] = -1;
            else
                ans[i] = map.get(key);
        }
        return ans;
    }
}