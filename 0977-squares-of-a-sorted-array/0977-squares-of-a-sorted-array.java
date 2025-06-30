class Solution {
    public int[] sortedSquares(int[] nums) {
         int n = nums.length;
        int[] result = new int[n];

        int left = 0;            // start pointer
        int right = n - 1;       // end pointer
        int pos = n - 1;         // position to fill in result from end

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return result;
    }
}