class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(low,num);
            high += num;
        }
        while(low<high){
        int mid = low + (high - low) / 2;
        if(Splitinto(nums,k,mid)){
            high=mid;
        }else{
            low = mid+1;
        }
        }
        return low;
    }
    private boolean Splitinto(int[] nums,int k ,int maxSum){
        int count = 1, currSum = 0;
        for (int num : nums) {
            if (currSum + num > maxSum) {
                count++;
                currSum = num;
                if (count > k) return false;
            } else {
                currSum += num;
            }
        }

        return true;
    }
}
