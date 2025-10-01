class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles; // start with all full bottles
        int empty = numBottles;      // after drinking, all are empty

        while (empty >= numExchange) {
            int newBottles = empty / numExchange; // exchange
            totalDrank += newBottles;
            empty = empty % numExchange + newBottles; // leftovers + new empties
        }

        return totalDrank;
    }
}