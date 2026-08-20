class Solution {
    public int mirrorDistance(int n) {
        int digit = 0;
        int reverse = 0;
        int original = n;
        while(n>0){
            digit = n%10;
            reverse = reverse*10 + digit;
            n/=10;
        }
        return Math.abs(original - reverse);
    }
}