//Date : 01.12.2024
//Porblem Statement no : 1346.      
//Porblem Statement Topic :  Check If N and Its Double Exist


class Solution {
    public boolean checkIfExist(int[] arr) {
        // A hashset to store the element of array
        Set<Integer> set = new HashSet<>();

        //Traverse in array 
        for(int i : arr){
            //To check if the double or half of number is available
            if(set.contains(2*i)||(i%2==0 && set.contains(i/2))){
                return true;
            }
            //Add current number to set
            set.add(i);
        }
        return false;
    }
}