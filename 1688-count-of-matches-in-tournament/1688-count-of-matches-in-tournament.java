class Solution {
    public int numberOfMatches(int n) {
        
        int sum = 0;
        while(n>1){
            if(n%2==0){
                int even = n/2;
                sum+=even;
                n = n/2;
            }else if(n%2!=0){
                int odd = (n-1)/2;
                sum+=odd;
                n = (n+1)/2;
            }
        }
        return sum;
    }
}