class Solution {
    public int digitFrequencyScore(int n) {
        int digit = 0;
        int reserve = 0;

        while(n>0){
            digit= n%10;
            reserve+=digit;
            n/=10;
        }
        return reserve;
    }
}