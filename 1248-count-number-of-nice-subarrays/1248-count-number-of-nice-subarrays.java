class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return niceSubarraysCount(nums, k) - niceSubarraysCount(nums, k - 1);
    }

    public int niceSubarraysCount(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int oddcount = 0;
        int original = 0;

        while (r < nums.length) {
            if (oddcount < 0) {
                return 0;
            }
            if (nums[r] % 2 != 0) {
                oddcount++;
            }
            while (oddcount > k) {
                if (nums[l] % 2 != 0) {
                    oddcount--;

                }
                l = l + 1;

            }
            original += r - l + 1;
            r++;
        }
        return original;
    }
}