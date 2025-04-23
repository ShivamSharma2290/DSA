class Solution {
    public int findMaximumXOR(int[] nums) {
        //TC : O(32N) : O(N);
       int maxXOR = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> prefixes = new HashSet<>();

            for (int num : nums) {
                prefixes.add(num & mask); // Extract prefix
            }

            int candidate = maxXOR | (1 << i);
            boolean found = false;

            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ candidate)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                maxXOR = candidate;
            }
        }

        return maxXOR;
    }
}
