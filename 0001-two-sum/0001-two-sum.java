class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            int start = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int end = nums[j];
            if(start+end==target){
                return new int[]{i,j};
            }
            }
        }
        return new int[]{};
    }
}