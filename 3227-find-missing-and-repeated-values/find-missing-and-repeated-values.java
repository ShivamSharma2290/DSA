
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n; // Max number possible in the grid
        HashSet<Integer> set = new HashSet<>();
        int a = -1, b = -1;
        
        // Step 1: Find the repeating number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (set.contains(num)) {
                    a = num; // Found the repeating number
                } else {
                    set.add(num);
                }
            }
        }

        // Step 2: Find the missing number
        for (int i = 1; i <= N; i++) {
            if (!set.contains(i)) {
                b = i;
                break;
            }
        }

        return new int[]{a, b};
    }
}
