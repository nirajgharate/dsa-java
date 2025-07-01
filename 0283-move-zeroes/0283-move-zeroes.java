class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // tracks the position to insert the next non-zero

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num; // place non-zero at insertPos
                insertPos++;
            }
        }

        // fill the rest of the array with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}