class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<String> ll = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        int res = nQueen(board, n, 0, result, ll);
        return result;
    }


    static int nQueen(boolean[][] board, int tq, int row, List<List<String>> ans, List<String> ll) {
        if (tq == 0) {
            ans.add(new ArrayList<>(ll));

            return 1;
        }

        int res = 0;
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < board[0].length; i++) {
                    if (i == col) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                ll.add(sb.toString());
                res += nQueen(board, tq - 1, row + 1, ans, ll);
                ll.remove(ll.size() - 1);
                board[row][col] = false;
            }
        }
        return res;
    }

        static boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        } // vertical check

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        } // left diagonal check

        for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        } // right diagonal check

        return true;
    }

}