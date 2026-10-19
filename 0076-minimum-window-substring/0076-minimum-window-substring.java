class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        int r = 0;
        int count = 0;
        int minlength = Integer.MAX_VALUE;
        int startIndex = -1;
        String res = "";
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
        }
        while (r < s.length()) {

            char ch = s.charAt(r);

            if (mp.getOrDefault(ch, 0) > 0) {
                count++;
            }
            mp.put(ch, mp.getOrDefault(ch, 0) - 1);
            while (count == t.length()) {
                if (r - l + 1 < minlength) {
                    minlength = r - l + 1;
                    startIndex = l;
                }
                char leftchar = s.charAt(l);
                mp.put(leftchar, mp.get(leftchar) + 1);
               if (mp.get(leftchar) > 0) {
                    count--;
                }

                l++;
            }
            r++;
        }
        if (startIndex == -1) {
            return "";
        }
        return s.substring(startIndex, startIndex + minlength);
    }

}