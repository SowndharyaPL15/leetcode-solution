class Solution {
    Map<String, int[]> memo = new HashMap<>();
    int n;
    int[] demand;

    int[] dfs(int i, int f0, int f1, int w0, int w1) {
        String key = i + "," + f0 + "," + f1 + "," + w0 + "," + w1;
        if (memo.containsKey(key)) return memo.get(key);

        int[] res = new int[]{-i, 0};
        if (i == n) return res;

        int d = demand[i];
        if (f0 >= d) {
            int[] nxt = dfs(i + 1, f0 - d, f1, d, Math.max(0, w1 - w0));
            int[] cand = new int[]{nxt[0], Math.max(nxt[1], w0)};
            if (cand[0] < res[0] || (cand[0] == res[0] && cand[1] < res[1])) {
                res = cand;
            }
        }
        if (f1 >= d) {
            int[] nxt = dfs(i + 1, f0, f1 - d, Math.max(0, w0 - w1), d);
            int[] cand = new int[]{nxt[0], Math.max(nxt[1], w1)};
            if (cand[0] < res[0] || (cand[0] == res[0] && cand[1] < res[1])) {
                res = cand;
            }
        }

        memo.put(key, res);
        return res;
    }

    public int minMaxWaitingTime(int[] demand, int[] fuel) {
        this.n = demand.length;
        this.demand = demand;
        int[] result = dfs(0, fuel[0], fuel[1], 0, 0);
        return result[0] != 0 ? result[1] : -1;
    }
}