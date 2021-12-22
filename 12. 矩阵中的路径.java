class Solution {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chars, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length 
            || board[i][j] != word[k]) return false; // out of bound or not equal
        if (k == word.length - 1) return true;
        board[i][j] = '\0'; // has been searched
        boolean res = dfs(board, word, i - 1, j, k + 1) 
                      || dfs(board, word, i + 1, j, k + 1) 
                      || dfs(board, word, i, j - 1, k + 1) 
                      || dfs(board, word, i, j + 1, k + 1);
        board[i][j] = word[k]; // reset the board
        return res;
    }
}
