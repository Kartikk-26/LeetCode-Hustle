//Date : 22.12.2024
//Porblem Statement no : 2940.                      
//Porblem Statement Topic :  Find Building Where Alice and Bob Can Meet


class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n = heights.length, q = queries.length;
        int[] result = new int[q];
        Arrays.fill(result, -1);
        //deferred: A list of lists where deferred.get(b) stores queries that depend on building b.
        List<List<int[]>> deferred = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            deferred.add(new ArrayList<>());
        }
        
        //A priority queue (min-heap) that stores queries based on their height in ascending order.
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        //Loop through all queries.
        for (int i = 0; i < q; ++i) {
            int a = queries[i][0], b = queries[i][1];
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (a == b || heights[a] < heights[b]) result[i] = b;
            else deferred.get(b).add(new int[]{heights[a], i});
        }

        //Process each building i and Add all deferred queries related to building i to the priority queue.
        for (int i = 0; i < n; ++i) {
            for (int[] query : deferred.get(i)) pq.add(query);
            while (!pq.isEmpty() && pq.peek()[0] < heights[i]) {
                result[pq.poll()[1]] = i;
            }
        }

        //Return the result array containing answers for all queries
        return result;
    }
}