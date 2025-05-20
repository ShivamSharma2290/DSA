class Solution {
    public int coinChange(int[] coins, int amount) {
        /*greedy
        Arrays.sort(coins);

        
        int c=0;
        int n=coins.length;
        int i=n-1;
        while(i>-1 && amount>0)
        {
            if(amount==0)
            {
                return c;
            }
            if(coins[i]>amount)
            {
                i--;
                continue;
            }
            c+=amount/coins[i];
            amount=amount%coins[i];
            i--;

        }
        if(amount>0)return -1;
        return c;
        /*
        /*int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];*/
        int [][]dp=new int[coins.length][amount+1];
        for(int d[]:dp)Arrays.fill(d,-1);
        int ans=rec(0,coins,amount,dp);
        return ans>amount?-1:ans;
    }

    public int rec(int i,int[] coins,int amount,int dp[][])
    {
        if(amount==0)return 0;
        if(i==coins.length) return Integer.MAX_VALUE-amount-1;
        if(dp[i][amount]!=-1)return dp[i][amount];
        if(coins[i]>amount)
        {
            return rec(i+1,coins,amount,dp);
        }

        return dp[i][amount]=Math.min(1+rec(i,coins,amount-coins[i],dp),rec(i+1,coins,amount,dp));
    }
}
