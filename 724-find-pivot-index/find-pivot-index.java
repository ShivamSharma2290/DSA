class Solution {
    public int pivotIndex(int[] nums) {
      for (int i = 0; i < nums.length; i++) { 
            int totalsum = 0;
            int leftsum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftsum += nums[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < nums.length; j++) {
                totalsum += nums[j];
            }

            if (leftsum == totalsum) {
                return i;
            }
        }
        return -1;  
    }
}
