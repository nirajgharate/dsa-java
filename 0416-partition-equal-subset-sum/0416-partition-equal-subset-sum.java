class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int num : nums){
            total+=num;
        }
        
        int target = total/2;

        if(total%2 != 0){
            return false;
        }

        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        for(int num : nums){
            for(int j=target; j>=num; j--){
                dp[j] = dp[j] || dp[j-num];
            }
        }
        return dp[target];
    }
}