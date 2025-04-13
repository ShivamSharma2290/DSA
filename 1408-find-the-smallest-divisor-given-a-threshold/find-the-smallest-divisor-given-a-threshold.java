class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // Time complexity: O(n.log(maxValue));
        int low =1;
        int high = getMax(nums);
        int res = high;

        while(low<=high){
            int mid = low+(high-low)/2;
            int sum = totalSum(nums,mid);

            if(sum<=threshold){
                high = mid-1;
                res = mid;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
    private int totalSum(int[] nums,int divisor){
        int sum=0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;

    }
    return sum;
    }
}
