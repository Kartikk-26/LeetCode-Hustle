//Porblem Statement no : 215
//Porblem Statement Topic : Kth Largest Element in an Array
// I have used the PriorityQueue in which i stored all the elemnt in queue and checked the element is = to target if yess than return that or else remove and add ther new smallest element in peek 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            if(pq.size()<k){
                pq.add(nums[i]);
            }
            else if(pq.peek()<nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}