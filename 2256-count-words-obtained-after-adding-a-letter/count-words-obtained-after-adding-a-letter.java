import java.util.*;

class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        HashSet<Integer> set = new HashSet<>();
        for (String word : startWords) {
            int mask = 0;
            for (char ch : word.toCharArray()) {
                mask |= 1 << (ch - 'a');
            }
            set.add(mask);
        }
        int count = 0;
        for (String word : targetWords) {
            int mask = 0;
            for (char ch : word.toCharArray()) {
                mask |= 1 << (ch - 'a');
            }
            for (char ch : word.toCharArray()) {
                if (set.contains(mask ^ (1 << (ch - 'a')))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}