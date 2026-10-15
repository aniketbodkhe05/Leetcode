
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int maxlength = 0;
        int zerocount = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] == 0) {
                zerocount++;
            }

            while (zerocount > k) {
                if (nums[l] == 0) {
                    zerocount--;
                }
                l++;
            }

            maxlength = Math.max(maxlength, r - l + 1);
        }

        return maxlength;
    }
}
