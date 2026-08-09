class Solution {

    int[][] dp;

    public int solve(int[] nums, int i, int j) {

        if (i > j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int ans = 0;

        for (int k = i; k <= j; k++) {

            int left = solve(nums, i, k - 1);

            int right = solve(nums, k + 1, j);

            int coins =
                    left
                  + right
                  + nums[i - 1] * nums[k] * nums[j + 1];

            ans = Math.max(ans, coins);
        }

        return dp[i][j] = ans;
    }

    public int maxCoins(int[] arr) {

        int n = arr.length;

        int[] nums = new int[n + 2];

        nums[0] = 1;
        nums[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            nums[i + 1] = arr[i];
        }

        dp = new int[n + 2][n + 2];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, 1, n);
    }
}