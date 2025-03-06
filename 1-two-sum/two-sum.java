
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] numWithIndex = new int[n][2];

        // Store numbers with their original indices
        for (int i = 0; i < n; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        // Sort the array based on values
        Arrays.sort(numWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;

        // Two-pointer approach
        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];

            if (sum == target) {
                return new int[]{numWithIndex[left][1], numWithIndex[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null; // No solution found
    }
}
  