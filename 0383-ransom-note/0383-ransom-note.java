class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26]; // to count letters in magazine

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (freq[c - 'a'] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }

        return true;

    }
}