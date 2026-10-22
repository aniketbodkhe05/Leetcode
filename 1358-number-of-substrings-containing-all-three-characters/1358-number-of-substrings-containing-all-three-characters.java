class Solution {
    public int numberOfSubstrings(String s) {

        int l = 0;
        int r = 0;
        int count = 0;
        //   Map<Character,Integer> mp = new HashMap<>(3);
        // int[] freq = new int[3];
        // while (r < s.length()) {
        //     //  int ch = s.charAt(r) - 'a';

        //     // mp.put(ch, mp.getOrDefault(ch, 0) + 1)=1;
        //     // if(mp.get(0)+mp.get(1)+mp.get(2)==3){
        //     //     count++;

        //     // }
        //     // else{
        //     //     l++;
        //     // }

        //     char ch = s.charAt(r);

        //     freq[ch - 'a']++;
        //     while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
        //         count = count + s.length() - r;
        //         freq[s.charAt(l) - 'a']--;

        //         l++;
        //     }

        //     r++;
        // }
        // return count;
        int[] lastseen = { -1, -1, -1 };

        for (int i = 0; i < s.length(); i++) {
            lastseen[s.charAt(i) - 'a'] = i;
            if (lastseen[0] >= 0 && lastseen[1] >= 0 && lastseen[2] >= 0) {
                count = count + (1 + Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2])));
            }

        }
        return count;
    }
}