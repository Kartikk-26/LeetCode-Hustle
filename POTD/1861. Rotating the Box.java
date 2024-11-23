//Date : 23.11.2024
//Porblem Statement no : 1861.        
//Porblem Statement Topic : Rotating the Box


class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int ROWS = box.length;
        int COLS = box[0].length;

        //result array with dimensions flipped (COLS x ROWS)
        char[][] res = new char[COLS][ROWS];
        for(char[]row : res ){
            Arrays.fill(row,'.');
        }

        //Iterates over each row 
        for(int r =0; r<ROWS; r++){
            int i= COLS-1;
            //Iterates backward over each column
            for(int c = COLS-1; c>=0; c--){
                if(box[r][c]=='#'){
                    //flips the row index for the 90-degree rotation.
                    res[i][ROWS-r-1]='#';
                    i--;
                }
                else if(box[r][c]=='*'){
                    res[c][ROWS-r-1] ='*';
                    i =c-1;
                }
            }
        }
        return res;
    }
}