class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> fruitCount = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add current fruit to the map (expand window to the right)
            fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);

            // Shrink window from the left if we have more than 2 types
            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);
                if (fruitCount.get(fruits[left]) == 0) {
                    fruitCount.remove(fruits[left]);
                }
                left++; // shrink the window
            }

            // Update maxLen if current window is larger
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}