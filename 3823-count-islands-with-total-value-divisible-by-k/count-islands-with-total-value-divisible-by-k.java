class Solution {
    int m, n;
    int[][] grid;

    public int countIslands(int[][] grid, int k) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = dfs(i, j);

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private long dfs(int r, int c) {
        if (r < 0 || c < 0 || r >= m || c >= n
                || grid[r][c] == 0) {
            return 0;
        }

        long value = grid[r][c];
        grid[r][c] = 0; // Mark as visited

        value += dfs(r - 1, c);
        value += dfs(r + 1, c);
        value += dfs(r, c - 1);
        value += dfs(r, c + 1);

        return value;
    }
}