class Solution {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        return check(0, s);
    }

    public boolean check(int i, String s) {

        if (i >= s.length() / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return check(i + 1, s);
    }
}