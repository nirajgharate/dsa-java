class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int total = 0;
        for(int num : nums){
            total+=num;
        }

        int left = 0;
        int right = 0;

        for(int i=0; i<nums.length-1; i++){
            left+=nums[i];

            right = total - left;

            int difference = left - right;
            if(difference % 2 == 0){
                count++;
            }
        }
        return count;
    }
}