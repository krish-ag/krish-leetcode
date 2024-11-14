class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int lu = (j > 0) ? matrix[i-1][j-1] : Integer.MAX_VALUE;
                int u = matrix[i-1][j];
                int ru = (j + 1 < matrix.length)? matrix[i-1][j+1]: Integer.MAX_VALUE;

                matrix[i][j] += Math.min(u, Math.min(lu,ru));
            }
        }

        int min = Integer.MAX_VALUE;
        for (int x = 0; x < matrix.length; x++) {
            min = Math.min(matrix[matrix.length - 1][x], min);
        }
        return min;
    }
}