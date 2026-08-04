class Solution {
    Integer dp[];
    public int solve(int[] stoneValue, int i){
        if(i >= stoneValue.length){
            return 0;
        }
        if(dp[i] != null){
            return dp[i];
        }

        int option1 = stoneValue[i] - solve(stoneValue, i+1);

        int option2 = Integer.MIN_VALUE;
        if(i+1 < stoneValue.length){
            option2 = stoneValue[i] + stoneValue[i+1] - solve(stoneValue, i+2);
        }

        int option3 = Integer.MIN_VALUE;
        if(i+2 < stoneValue.length){
            option3 = stoneValue[i] + stoneValue[i+1] + stoneValue[i+2] - solve(stoneValue, i+3);
        }
        dp[i] = Math.max(option1, Math.max(option2, option3));
        return dp[i];
    }
    public String stoneGameIII(int[] stoneValue) {
        dp = new Integer[stoneValue.length];

        int diff = solve(stoneValue, 0);

        if(diff > 0){
            return "Alice";
        }
        else if(diff < 0){
            return "Bob";
        }else{
            return "Tie";
        }
    }
}