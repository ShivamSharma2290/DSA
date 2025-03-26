class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int emptySquares = 0, start = 0, end = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    start = i;
                    end = j;
                } else if (grid[i][j] == 0) {
                    emptySquares++;
                }
            }
        }
        
        return dfs(grid, start, end, emptySquares + 1); 
    }

    private int dfs(int[][] grid, int i, int j, int remaining) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1)
            return 0;
        
        if (grid[i][j] == 2) 
            return (remaining == 0) ? 1 : 0; 

        grid[i][j] = -1;
        remaining--;

        int paths = dfs(grid, i + 1, j, remaining)
                  + dfs(grid, i - 1, j, remaining)
                  + dfs(grid, i, j + 1, remaining)
                  + dfs(grid, i, j - 1, remaining);

        grid[i][j] = 0;
        remaining++;

        return paths;
    }
}

