class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }
 //TC : O(32N) : O(N);

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();

        // Step 1: Build Trie
        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }

        int maxXOR = 0;
        for (int num : nums) {
            TrieNode node = root;
            int currXOR = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int toggledBit = 1 - bit; // we prefer the opposite bit

                if (node.children[toggledBit] != null) {
                    currXOR |= (1 << i);
                    node = node.children[toggledBit];
                } else {
                    node = node.children[bit];
                }
            }
            maxXOR = Math.max(maxXOR, currXOR);
        }

        return maxXOR;
    }
}