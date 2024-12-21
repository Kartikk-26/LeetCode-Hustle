//Date : 21.12.2024
//Porblem Statement no : 2872.                     
//Porblem Statement Topic :  Maximum Number of K-Divisible Components

import java.util.*;

class Solution {
    private int comp = 0;

    private long DFS(int u, int k, List<Integer>[] adj, boolean[] visited, int[] values) {
        visited[u] = true;
        long sum = 0;

        for (int v : adj[u]) {
            if (!visited[v]) {
                long vSum = DFS(v, k, adj, visited, values);
                if (vSum % k == 0) {
                    comp += 1;
                } else {
                    sum += vSum;
                }
            }
        }

        sum += values[u];
        return sum;
    }

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[n];
        long sum = DFS(0, k, adj, visited, values);

        if (sum % k == 0) {
            comp += 1;
        }

        return comp;
    }
}