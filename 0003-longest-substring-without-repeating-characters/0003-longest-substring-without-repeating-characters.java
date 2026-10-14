import java.util.Set;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> hash = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (hash.contains(ch)) {
                    break;
                }
                hash.add(ch);
                length =  j-i + 1;
                maxlength = Math.max(length, maxlength);
            }
        }

        return maxlength;
    }
}