//Porblem Statement no : 1046.  
//Porblem Statement Topic : Last Stone Weight
//Solve using PriorityQueue

class Solution {
    public int lastStoneWeight(int[] stones) {
        //Made new priorirty queue ( max size )
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //Take all value of sontes array in element
        for(int ele : stones){
            pq.add(ele);
        }

        //will run till size gretaer than 1
        while(pq.size()>1){
            int max = pq.remove();
            int smax = pq.remove();

            int nStone = max - smax;
            if(nStone!=0){
                pq.add(nStone);
            }
        }

        //if we find 0 at last
        if(pq.size()==0){
            return 0;
        }
        else{
            return pq.remove();
        }
    }
}