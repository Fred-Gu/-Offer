class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (matrix[row][col] != target) {
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
            if (row >= matrix.length || col < 0) {
                return false;
            }
        }
        return true;
    }
}
