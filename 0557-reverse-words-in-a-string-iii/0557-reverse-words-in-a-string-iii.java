class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            rev.reverse();
            result.append(rev).append(" ");
        }

        // Remove the last extra space
        return result.toString().trim();
    }
}