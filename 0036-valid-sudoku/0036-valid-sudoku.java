class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> boxSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.') {
                    if (!rowSet.add(board[i][j])) {
                        return false;
                    }
                }

                // Check column
                if (board[j][i] != '.') {
                    if (!colSet.add(board[j][i])) {
                        return false;
                    }
                }

                // Check 3x3 box
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                int r = rowIndex + j / 3;
                int c = colIndex + j % 3;
                if (board[r][c] != '.') {
                    if (!boxSet.add(board[r][c])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}