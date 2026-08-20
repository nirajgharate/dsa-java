class Solution {
    public int minElement(int[] nums) {
        
        int digit = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            while(nums[i] > 0){
                digit = nums[i]%10;
                sum = sum + digit;
                nums[i]/=10;
            }
            
            min = Math.min(min, sum);
        }

        return min;
    }
}