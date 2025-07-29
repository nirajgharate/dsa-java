class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Subtract frequency using characters in t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // If all values are zero, then it’s a valid anagram
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}