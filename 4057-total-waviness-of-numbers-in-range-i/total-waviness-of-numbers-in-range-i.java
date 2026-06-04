class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int num = num1; num <= num2; num++) {
            int[] d = new int[10];
            int len = 0;
            int temp = num;
            while (temp > 0) {
                d[len++] = temp % 10;
                temp /= 10;
            }
            for (int i = 1; i < len - 1; i++) {
                if ((d[i] > d[i - 1] && d[i] > d[i + 1]) ||
                    (d[i] < d[i - 1] && d[i] < d[i + 1])) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
