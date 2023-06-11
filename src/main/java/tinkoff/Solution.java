package tinkoff;

import static java.lang.Math.max;

import java.util.HashSet;

class Solution {

    public static void main(String[] args) {
        String s = "abcabcdbb";
        Solution solution = new Solution();
        int length = solution.lengthOfLongestSubstring(s);
        System.out.printf("Longest [%d] %n", length);
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        var chars = new HashSet<Character>();
        for (var c : s.toCharArray()) {
            if (!chars.add(c)) {
                chars.clear();
                chars.add(c);
                maxLength = 1;
            } else {
                maxLength++;
            }
        }
        return maxLength;
    }
}
