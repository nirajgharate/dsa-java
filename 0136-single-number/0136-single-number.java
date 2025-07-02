class Solution {
    public int singleNumber(int[] nums) {
          int result = 0; // start with 0

        for (int num : nums) {
            result ^= num; // XOR each number with the result
        }

        return result;
    }
}