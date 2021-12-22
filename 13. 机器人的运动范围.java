class Solution {
    int cnt = 0;

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        dfs(m, n, visited, 0, 0, k);
        return cnt;
    }

    private void dfs(int m, int n, boolean[][] visited, int i, int j, int k) {
        if (i >= 0 && i < m && j >= 0 && j < n 
            && !visited[i][j] 
            && sum(i) + sum(j) <= k) {
                cnt++;
                visited[i][j] = true;
                dfs(m, n, visited, i + 1, j, k);
                dfs(m, n, visited, i, j + 1, k);
            }
    }

    private int sum(int num) {
        int s = 0;
        while (num != 0) {
            s += num % 10;
            num /= 10;
        }
        return s;
    }
}
