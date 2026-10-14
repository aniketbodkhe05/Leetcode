import java.util.Set;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxlength = 0;
        // int length = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     Set<Character> hash = new HashSet<>();
        //     for (int j = i; j < s.length(); j++) {
        //         char ch = s.charAt(j);
        //         if (hash.contains(ch)) {
        //             break;
        //         }
        //         hash.add(ch);
        //         length =  j-i + 1;
        //         maxlength = Math.max(length, maxlength);
        //     }
        // }

        // return maxlength;
        Map<Character, Integer> hash = new HashMap<>();
        int l = 0;
        int r = 0;
        int len = 0;
        int maxlength = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);
            if (hash.containsKey(ch)) {
                if (hash.get(ch) >= l) {
                    l = hash.get(ch) + 1;
                }
            }
            len = r - l + 1;
            maxlength = Math.max(len, maxlength);
            hash.put(ch, r);
            r++;
        }

        return maxlength;
    }

}