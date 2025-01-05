//Date : 05.01.2025
//Porblem Statement no : 2381.                                  
//Porblem Statement Topic :  Shifting Letters II

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] stringToChar = s.toCharArray();
        int[] finalShift = new int[stringToChar.length+1];
        for(int i=0;i<shifts.length;i++){
            finalShift[shifts[i][0]] = shifts[i][2]==1?finalShift[shifts[i][0]]+1:finalShift[shifts[i][0]]-1;
            finalShift[shifts[i][1]+1] = shifts[i][2]==1?finalShift[shifts[i][1]+1]-1:finalShift[shifts[i][1]+1]+1;
        }
        int prefixSum=0;
        for(int i=0;i<stringToChar.length;i++){
            prefixSum+=finalShift[i];
            int offset = ((stringToChar[i]-'a')+prefixSum)%26;
            if(offset<0) stringToChar[i] = (char) (26+offset+'a');
            else stringToChar[i] = (char) (offset+'a');
        }
        return new String(stringToChar);
    }
}