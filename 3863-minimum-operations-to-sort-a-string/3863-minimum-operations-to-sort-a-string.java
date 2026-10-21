class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);

        char minChar = sorted.charAt(0);
        char maxChar = sorted.charAt(sorted.length() - 1);

        int left = 0;
        int right = s.length() - 1;
        if (s.equals(sorted)) {
            return 0;
        }
        if (s.length() == 2) {
            return -1;
        }
       if (s.charAt(left) == minChar ||
    s.charAt(right) == maxChar) {
    return 1;
}

for (int i = 1; i < right; i++) {
    if (s.charAt(i) == minChar ||
        s.charAt(i) == maxChar) {
        return 2;
    }
}

return 3;

    }
}