class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int down = n-1;
        int left = 0;
        int right = m-1;
       while(left<=right && top<=down){
         for(int j=left;j<=right;j++){
            result.add(matrix[top][j]);
        }
        top++;
        for(int i=top;i<=down;i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=down){
            for(int j=right;j>=left;j--){
                result.add(matrix[down][j]);
            }
            down--;
        }
        if(left<=right){
                for(int i=down;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
       }
       return result;
    }
}