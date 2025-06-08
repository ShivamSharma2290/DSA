class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int maxIndex = 0;
        int currEnd = 0;
        for(int i =0;i<nums.length-1;i++){
            maxIndex = Math.max(maxIndex, i + nums[i]);
        
        if(i==currEnd){
            jumps++;
            currEnd = maxIndex;
        }
    }
        
    return jumps;


        
    }
}