//Date : 12.12.2024
//Porblem Statement no : 2558.               
//Porblem Statement Topic :  Take Gifts From the Richest Pile


class Solution {
    public long pickGifts(int[] g, int k) {
       //A PriorityQueue is created with integers in descending order
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int val : g){
        maxHeap.add(val);
       } 

       for(int i=0; i<k && maxHeap.peek()>1; i++){
           int x = maxHeap.poll();
           maxHeap.add((int) Math.sqrt(x));
       }

       long sum =0;
       for(int val : maxHeap){
            sum+= val;
       }
       return sum;
    }
}