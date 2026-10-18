class Solution {
    public int characterReplacement(String s, int k) {
        int r = 0;
        int l = 0;
        int maxf = 0;
        int maxlength = 0;
        Map<Integer, Integer> mp = new HashMap<>(26);
        while (r < s.length()) {
            int ch = s.charAt(r) - 'A';
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            maxf = Math.max(maxf, mp.get(ch));

            while ((r - l + 1) - maxf > k) {
                int leftChar = s.charAt(l) - 'A';
                mp.put(leftChar, mp.get(leftChar) - 1);
                l++;
                maxf = 0;
                maxf = 0;
                for (int freq : mp.values()) {
                    maxf = Math.max(maxf, freq);
                }
            }
            if ((r - l + 1) - maxf <= k) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
            r++;
        }
        return maxlength;
    }
}