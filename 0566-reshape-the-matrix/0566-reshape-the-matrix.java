class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;           // original rows
        int n = mat[0].length;        // original columns

        if (m * n != r * c) {
            // Reshape not possible, return original matrix
            return mat;
        }

        int[][] result = new int[r][c];  // new reshaped matrix
        for (int i = 0; i < m * n; i++) {
            // i / c gives the row index in the new matrix
            // i % c gives the column index in the new matrix
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }
}