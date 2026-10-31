class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int i = 0;
        int j = 0;

        if (strs.length == 0) {
            return "";
        }

        while (i < strs[0].length()) {
            j = 1;

            while (j < strs.length) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return str;
                }
                j++;
            }
            str += strs[0].charAt(i);
            i++;
        }
        return str;
    }
}