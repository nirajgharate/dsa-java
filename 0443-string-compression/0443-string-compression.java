class Solution {
    public int compress(char[] chars) {
        int index = 0; // position to insert compressed result
        int i = 0; // pointer to iterate

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // count how many times currentChar repeats
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // place the character
            chars[index++] = currentChar;

            // if count > 1, place the count as characters
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}