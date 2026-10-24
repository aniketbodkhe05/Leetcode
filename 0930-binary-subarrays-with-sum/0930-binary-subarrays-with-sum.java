class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public int atmost(int[] nums,int goal){
         int r=0;
        int l=0;
        int sum=0;
        int count=0;


    while(r<nums.length){
        if(goal<0){
            return 0;
        }
        sum=sum+nums[r];
        while(sum>goal){
            sum=sum-nums[l];
            l=l+1;
        }
        count=count+(r-l+1);
        r++;
    }
    return count;

    }
}