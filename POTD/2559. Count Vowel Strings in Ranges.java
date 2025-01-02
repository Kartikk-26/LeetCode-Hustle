//Date : 02.01.2025
//Porblem Statement no : 2559.                                
//Porblem Statement Topic : Count Vowel Strings in Ranges

class Solution {
    
    //public method named vowelStrings that Takes two inputs
    public int[] vowelStrings(String[] words, int[][] arr) {
        int ans [] = new int [arr.length];
		
        //Creates a boolean array isFound to track whether each word in words starts and ends with a vowel.
        boolean isFound []= new boolean [words.length];
		
        //Iterates through each word in the words array and calls the helper function to check for vowel
        for(int i = 0; i < words.length; i++)
		{
			isFound[i] = containsVowels(words[i]);
		}
		int values [] = new int [isFound.length];
		int count = 0;
		for(int i = 0; i < isFound.length; i++)
		{
			if(isFound[i] == true)
			{
				count++;
			}
			values[i] = count;
		}
		for(int i = 0;i < arr.length; i++)
		{
			if(arr[i][0] == arr[i][1])
			{
				if(isFound[arr[i][1]])
				{
					ans[i] = 1;
				}
				else
				{
					ans[i] = 0;
				}
                continue;
			}
			ans[i] = values[arr[i][1]] - values[arr[i][0]] + (isFound[arr[i][0]] == false ? 0 : 1); 
		}
		return ans;
	}

	//Helper Function
    private static boolean containsVowels(String s) {
		int l = s.length() - 1;
		
        //Check for Vowel Start and End
        if((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' ||s.charAt(0) == 'o' || s.charAt(0) == 'u') && (s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' ||s.charAt(l) == 'o' || s.charAt(l) == 'u'))
		{
			return true;
		}
		return false;
	}
}