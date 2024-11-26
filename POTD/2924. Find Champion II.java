//Date : 26.11.2024
//Porblem Statement no : 2924.          
//Porblem Statement Topic :  Find Champion II


class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] in_degree = new int[n]; // Track the number of incoming edges for each node.

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            in_degree[v]++; // Increment in-degree for destination node.
        }

        int champion = 0; // To count nodes with zero in-degree.
        int ans = 0; // Store the node with zero in-degree.

        for (int i = 0; i < n; i++) {
            if (in_degree[i] == 0) { // Check for zero in-degree.
                champion++;
                ans = i;
            }
        }

        // If there's more than one champion, return -1.
        if (champion > 1)
            return -1;
        return ans;
    }
}