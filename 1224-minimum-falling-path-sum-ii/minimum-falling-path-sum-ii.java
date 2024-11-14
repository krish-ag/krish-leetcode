class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                int minimum = Integer.MAX_VALUE;
                for (int l = 0; l < matrix.length; l++) {
                    if (l == j) continue;
                    minimum = Math.min(minimum, matrix[i-1][l]);
                }
                matrix[i][j] += minimum;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int x = 0; x < matrix.length; x++) {
            min = Math.min(matrix[matrix.length - 1][x], min);
        }
        return min;
    }
}