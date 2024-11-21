//Date : 21.11.2024
//Porblem Statement no : 2257.      
//Porblem Statement Topic : Count Unguarded Cells in the Grid


class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Mark walls as -1 and guards as 2
        for (int[] w : walls) {
            grid[w[0]][w[1]] = -1;
        }
        for (int[] g : guards) {
            grid[g[0]][g[1]] = 2;
        }

        for (int[] g : guards) {
            for (int[] d : directions) {
                int x = g[0], y = g[1];
                while (true) {
                    x += d[0];
                    y += d[1];

                    // Stop if out of bounds or hits a wall/guard
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == -1 || grid[x][y] == 2) {
                        break;
                    }

                    // If unoccupied then mark
                    if (grid[x][y] == 0) {
                        grid[x][y] = 1;
                    }
                }
            }
        }

        // Count unguarded cells
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}