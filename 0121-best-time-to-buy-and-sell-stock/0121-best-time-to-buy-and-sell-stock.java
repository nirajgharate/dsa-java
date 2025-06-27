class Solution {
    public int maxProfit(int[] prices) {
        //this is my first github DSA solution upload onn Github 
        int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
        minPrice = Math.min(minPrice, price);
        maxProfit = Math.max(maxProfit, price - minPrice);
    }

    return maxProfit;
    }
}
