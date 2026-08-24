class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        int sub = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                sum+=nums[i];
            }else if(i%2!=0){
                sub-=nums[i];
            }
        }
        return sum+sub;
    }
}