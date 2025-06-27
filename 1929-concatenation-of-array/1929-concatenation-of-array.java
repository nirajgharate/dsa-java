class Solution {
    public int[] getConcatenation(int[] nums) {
        int curr = nums.length;
        int ans[]=new int[curr*2];
        for(int i=0;i<curr;i++){
            ans[i] = nums[i];
            ans[i+curr]=nums[i];
        }
        return ans;
    }
}