class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];

        Integer[] memo1 = new Integer[nums.length];
        Integer[] memo2 = new Integer[nums.length];

        int one = helper(nums,0,nums.length-2,memo1);
        int two = helper(nums,1,nums.length-1,memo2);
        return Math.max(one,two);
    }
        private int helper(int[] nums,int start,int n,Integer[] memo){
            if (n < start) return 0;
        if (n == start) return nums[start];

        if (memo[n] != null) return memo[n];

        int take = helper(nums, start, n - 2, memo) + nums[n];
        int skip = helper(nums, start, n - 1, memo);

        memo[n] = Math.max(take, skip);
        return memo[n];
    }
}