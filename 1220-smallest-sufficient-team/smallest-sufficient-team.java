class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int n = req_skills.length;
        int m = people.size();
        HashMap<String, Integer> skillIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            skillIndex.put(req_skills[i], i);
        }
        List<Integer>[] dp = new List[1 << n];
        dp[0] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int currentSkill = 0;
            for (String skill : people.get(i)) {
                currentSkill |= 1 << skillIndex.get(skill);
            }
            List<Integer>[] old = dp.clone();
            for (int prev = 0; prev < (1 << n); prev++) {
                if (old[prev] == null) {
                    continue;
                }
                int combined = prev | currentSkill;
                if (dp[combined] == null ||
                    old[prev].size() + 1 < dp[combined].size()) {
                    dp[combined] = new ArrayList<>(old[prev]);
                    dp[combined].add(i);
                }
            }
        }
        return dp[(1 << n) - 1]
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}