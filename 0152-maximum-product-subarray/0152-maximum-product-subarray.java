class Solution {
    public int maxProduct(int[] nums) {
        int min = 1;
        int max = 1;
        int maxproduct = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num < 0) {
                int temp = min;
                min = max;
                max = temp;
            }

            max = Math.max(num, max * num);
            min = Math.min(num, min * num);

            maxproduct = Math.max(max, maxproduct);
        }
        return maxproduct;
        // int prefix = 1;
        // int suffix = 1;
        // int maxi = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        //     if(prefix==0) prefix=1;
        //      if(suffix==0) suffix=1;
        //     prefix *= nums[i];
        //     suffix *= nums[(nums.length-i-1)];
        //     maxi=Math.max(maxi,Math.max(prefix,suffix));
        // }
        // return maxi;
    }
}