class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        
        
        int n=1<<nums.length;
        for(int num=0;num<n;num++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((num & (1<<i))!=0){
                    list.add(nums[i]);
                }

            }
              result.add(list);
        }
        return result;
    }
}