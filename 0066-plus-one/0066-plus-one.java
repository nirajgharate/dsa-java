class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // All were 9, so we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // rest are 0 by default
        return result;
    }
}