class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int customerwealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                customerwealth += accounts[i][j];
            }
            if(customerwealth>maxwealth){
                maxwealth = customerwealth;
            }
        }
        return maxwealth;
    }
}