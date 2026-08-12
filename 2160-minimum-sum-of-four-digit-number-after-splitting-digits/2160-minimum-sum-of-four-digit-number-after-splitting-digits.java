class Solution {
    public int minimumSum(int num) {
        int digit[] = new int[4];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            digit[i] = num%10;
            num/=10;
        }
        Arrays.sort(digit);

        int ans = digit[0]*10+digit[2] + digit[1]*10+digit[3];
        min = Math.min(min, ans);
        return min;
    }
}