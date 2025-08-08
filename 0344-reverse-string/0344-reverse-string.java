class Solution {
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    
    private void helper(char[] s, int start, int end) {
        // Base case
        if (start >= end) {
            return;
        }
        
        // Swap characters
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        
        // Recursive call
        helper(s, start + 1, end - 1);
    }
}