class Solution {
    public int rob(int[] nums) {
    //     return rob(nums,nums.length-1);
    // }
    //     private int rob(int[] nums,int i){
    //     if(i<0){
    //         return 0; 
    //     }
    //     return Math.max(rob(nums,i-2)+nums[i],rob(nums,i-1));
     if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];


    int n = nums.length;
    int[] dp = new int[n];

    dp[0]=nums[0];
    dp[1]=Math.max(nums[0],nums[1]);

    for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n-1];
    }
}






        


        
