//Date : 15.12.2024
//Porblem Statement no : 1792.                  
//Porblem Statement Topic :  Maximum Average Pass Ratio


class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        //A priority queue (pq) is initialized to store classes based on one extra student is added.
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> {
            double diffA = (a[0] + 1) / (a[1] + 1) - a[0] / a[1];
            double diffB = (b[0] + 1) / (b[1] + 1) - b[0] / b[1];
            return Double.compare(diffB, diffA);
        });
        
        //Iterate through all classes in the classes array.
        for (int[] cls : classes) {
            pq.offer(new double[]{cls[0], cls[1]});
        }
        
        //Loop runs extraStudents times, allocating one extra student in each iteration.
        for (int i = 0; i < extraStudents; i++) {
            double[] top = pq.poll();
            top[0]++;
            top[1]++;
            pq.offer(top);
        }
        
        //Initialize a variable avgPassRatio to store the cumulative sum of the pass ratios of all classes   
        //after distributing the extra students.
        double avgPassRatio = 0;
        
        //Iterate through all remaining classes in the priority queue.
        while (!pq.isEmpty()) {
            double[] cls = pq.poll();
            avgPassRatio += cls[0] / cls[1];
        }
        
        //Calculate the average pass ratio by dividing the cumulative pass ratio (avgPassRatio) by the number 
        // of classes (classes.length).
        return avgPassRatio / classes.length;
    }
}