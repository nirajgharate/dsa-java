class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        
        // If n is odd and greater than 1, it's not a power of two.
        if (n % 2 != 0) {
            return false;
        }
        
        // Recursive step: check if n/2 is a power of two
        return isPowerOfTwo(n / 2);
    }
}