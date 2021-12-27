class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int[] result = new int[matrix.length * matrix[0].length];
        int idx = 0;
        int row1 = 0, row2 = matrix.length - 1, col1 = 0, col2 = matrix[0].length - 1;
        while (true) {
            for (int col = col1; col <= col2; col++) {
                result[idx++] = matrix[row1][col];
            }
            if (++row1 > row2) break;

            for (int row = row1; row <= row2; row++) {
                result[idx++] = matrix[row][col2];
            }
            if (--col2 < col1) break;

            for (int col = col2; col >= col1; col--) {
                result[idx++] = matrix[row2][col];
            }
            if (--row2 < row1) break;

            for (int row = row2; row >= row1; row--) {
                result[idx++] = matrix[row][col1];
            }
            if (++col1 > col2) break;
        }
        return result;
    }
}
