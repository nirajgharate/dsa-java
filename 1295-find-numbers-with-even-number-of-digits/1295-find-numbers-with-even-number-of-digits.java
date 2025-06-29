class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int digits = String.valueOf(num).length(); // count digits efficiently
            if (digits % 2 == 0) {
                count++; // increment count if even digits
            }
        }

        return count;
        }
    }
