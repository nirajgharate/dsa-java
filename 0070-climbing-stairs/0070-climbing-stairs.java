class Solution {
    public int climbStairs(int n, int db[]) {
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(db[n] != 0){
            return db[n];
        }
         db[n] = climbStairs(n-1, db) + climbStairs(n-2, db);
         return db[n];
    }
    public int climbStairs(int n){
        int db[] = new int[n+1];
        return climbStairs(n, db);
    }
}