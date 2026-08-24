class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String operation : operations){
            if(operation.contains("+")){
                count++;
            }else if(operation.contains("-")){
                count--;
            }
        }
        return count;
    }
}