class Solution {
    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        int[] newCuts = new int[c + 2];
        newCuts[0] = 0;
        newCuts[c + 1] = n;
        
        for (int i = 0; i < c; i++) {
            newCuts[i + 1] = cuts[i];
        }

        Arrays.sort(newCuts);

    //     return recursiveCost(newCuts, 0, c + 1);
    // }

    // private int recursiveCost(int[] cuts, int i, int j) {
    //     if (j - i <= 1) {
    //         return 0;
    //     }

    //     int minCost = Integer.MAX_VALUE;

    //     for (int k = i + 1; k < j; k++) {
    //         int cost = cuts[j] - cuts[i] + recursiveCost(cuts, i, k) + recursiveCost(cuts, k, j);
    //         minCost = Math.min(minCost, cost);
    //     }

    //     return minCost;
    int[][] dp = new int[c + 2][c + 2];

        for (int len = 2; len <= c + 1; len++) {
            for (int i = 0; i + len <= c + 1; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    int cost = newCuts[j] - newCuts[i] + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        return dp[0][c + 1];
    }
}
