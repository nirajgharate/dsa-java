class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       int unplacedFruits = 0;
        // Using a map to track basket capacities, but also a way to mark them as unavailable.
        // We'll store a special value (e.g., -1) in the map to indicate an unavailable basket.
        Map<Integer, Integer> basketStatus = new HashMap<>();
        for (int i = 0; i < baskets.length; i++) {
            basketStatus.put(i, baskets[i]);
        }

        for (int fruitQuantity : fruits) {
            boolean placed = false;
            for (int i = 0; i < baskets.length; i++) {
                // Check if the basket is available AND has sufficient capacity
                if (basketStatus.containsKey(i) && basketStatus.get(i) != -1 && basketStatus.get(i) >= fruitQuantity) {
                    // Mark the basket as unavailable for other fruit types by setting its value to -1
                    basketStatus.put(i, -1);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplacedFruits++;
            }
        }
        return unplacedFruits;
    }
}