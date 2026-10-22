class Solution {
    public int numberOfSubstrings(String s) {
        // for (int i = 0; i < s.length(); i++) {
        //     Map<Character, Integer> mp = new HashSet<>(3);
        //     for (int i = j; i < s.length; i++) {
        //         int ch = s.charAt(j) - 'a';

        //         mp.put(ch)=1;

        //     }
        // }

        int l = 0;
        int r = 0;
        int count = 0;
        //   Map<Character,Integer> mp = new HashMap<>(3);
        int[] freq = new int[3];
        while (r < s.length()) {
            //  int ch = s.charAt(r) - 'a';

            // mp.put(ch, mp.getOrDefault(ch, 0) + 1)=1;
            // if(mp.get(0)+mp.get(1)+mp.get(2)==3){
            //     count++;

            // }
            // else{
            //     l++;
            // }

            char ch = s.charAt(r);

            freq[ch - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count = count + s.length() - r;
                freq[s.charAt(l) - 'a']--;

                l++;
            }

            r++;
        }
        return count;
    }
}