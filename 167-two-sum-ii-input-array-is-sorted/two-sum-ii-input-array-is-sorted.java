class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            
            if (sum == target) {
                return new int[]{i + 1, j + 1}; // Convert 0-based index to 1-based index
            } else if (sum < target) {
                i++; // Increase the left pointer to get a larger sum
            } else {
                j--; // Decrease the right pointer to get a smaller sum
            }
        }
        
        return new int[]{}; 
    }
}
