class Solution {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int index = 0;

        // Copy non-val elements into temp
        for (int num : nums) {
            if (num != val) {
                temp[index] = num;
                index++;
            }
        }

        // Copy back into nums
        for (int i = 0; i < index; i++) {
            nums[i] = temp[i];
        }

        return index;
    }
}