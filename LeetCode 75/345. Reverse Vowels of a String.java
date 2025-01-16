class Solution {
    public String reverseVowels(String s) {
        //Converting the given string to Array
        char [] arr = s.toCharArray(); 

        //Declaration of variables
        int i=0 , j=arr.length-1;
        String vowel = "aeiouAEIOU";

        //using Two pointer approach 
        while(i<j){
            while(i<j){
                //IF the first letter of string using I pointer is not vowel than i++ otherwise break
                char ch = arr[i];
                if(vowel.indexOf(ch)!=-1)
                    break;
                i++;    
            }

            while(i<j){
                ////IF the last letter of string using J pointer is not vowel than i++ otherwise break
                char ch = arr[j];
                if(vowel.indexOf(ch)!=-1)
                    break;
                j--;    
            }

            //If we have the charcter which are vowel and being matched which are stroed in temp are swapped using bubble sort
            if(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //Return the swapped array which is being converted to string
        return new String(arr);
    }
}