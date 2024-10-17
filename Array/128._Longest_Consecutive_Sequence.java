//Porblem Statement no : 128. 
//Porblem Statement Topic : Longest Consecutive Sequence 
//Problem Statement Solution : 
// 1 : I made a new hashmap and made all element false 
// 2 : Than i checked the previous element of that key if it exist than ignore and if it doesnt than make it true
// 3 : Than i checked that element is avilabke make it key than make a varvble k = 1 and than add that max =  (k + key)
// 4 : return max 



class Solution {
    public int longestConsecutive(int[] nums) {
       //Create a HashMap
       HashMap<Integer,Boolean> hm = new HashMap<>();

       //Now iteratte in hashmap and make all element false 
       for(int i=0; i<nums.length; i++){
        hm.put(nums[i],false);
       }

       //now to check the before element of the key
       for(int key : hm.keySet()){
        if(hm.containsKey(key-1)==false){
            hm.put(key,true);
        }
       }

       //If the sequence is starting from that element 
       int max = 0;
       for(int key : hm.keySet()){
        int k = 1;
        if(hm.get(key)==true){
            while(hm.containsKey(key+k)==true){
                k++;
            }
        }
        max = Math.max(max,k);
       }
       return max;
    }
}