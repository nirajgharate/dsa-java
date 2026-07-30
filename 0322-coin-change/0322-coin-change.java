class Solution {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, -2);   // -2 = not calculated

        return solve(coins, amount, dp);
    }

    private int solve(int[] coins, int amount, int[] dp) {

        if (amount == 0)
            return 0;

        if (amount < 0)
            return -1;

        if (dp[amount] != -2)
            return dp[amount];

        int ans = Integer.MAX_VALUE;

        for (int coin : coins) {

            int res = solve(coins, amount - coin, dp);

            if (res != -1) {
                ans = Math.min(ans, res + 1);
            }
        }

        dp[amount] = (ans == Integer.MAX_VALUE) ? -1 : ans;

        return dp[amount];
    }
}