//Date : 19.01.2025
//Porblem Statement no : 407.                        
//Porblem Statement Topic : Trapping Rain Water II

import java.util.PriorityQueue;

class Solution {
    public int trapRainWater(int[][] height) {
        int n = height.length;
        int m = height[0].length;

        //A min-heap (PriorityQueue) is initialized to store grid cells as 3-element arrays
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] vis = new boolean[n][m];

        // Add first and last column
        for (int i = 0; i < n; i++) {
            vis[i][0] = true;
            vis[i][m - 1] = true;
            pq.offer(new int[]{height[i][0], i, 0});
            pq.offer(new int[]{height[i][m - 1], i, m - 1});
        }

        // Add first and last row
        for (int i = 0; i < m; i++) {
            vis[0][i] = true;
            vis[n - 1][i] = true;
            pq.offer(new int[]{height[0][i], 0, i});
            pq.offer(new int[]{height[n - 1][i], n - 1, i});
        }

        int ans = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        //Process Cells in PriorityQueue:
        //Remove the cell with the smallest height from the priority queue (curr).
        //h is the height of the current cell, r is its row index, and c is its column index.

        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int h = curr[0], r = curr[1], c = curr[2];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                //Ensure the neighbor cell (nr, nc) is within grid bounds and has not been visited yet.
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc]) {
                    ans += Math.max(0, h - height[nr][nc]); //Calculate Trapped Water
                    pq.offer(new int[]{Math.max(h, height[nr][nc]), nr, nc}); //Add Neighbor to PriorityQueue
                    vis[nr][nc] = true; //Mark Neighbor as Visited
                }
            }
        }

        //Return the total amount of water trapped (ans)
        return ans;
    }
}