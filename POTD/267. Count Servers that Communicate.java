//Date : 23.01.2025
//Porblem Statement no : 267.                        
//Porblem Statement Topic : Count Servers that Communicate

class Solution {
    public int countServers(int[][] grid) {
       //Declarations
       int m = grid.length;
       int n = grid[0].length;
       int [] rc = new int[m];
       int [] cc = new int[n];

       //count the server in row and column
       for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    rc[i]++;
                    cc[j]++;
                }
            }
        }

        //count the communicating server
        int cnt=0;
       for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    if(rc[i]>1 || cc[j]>1){
                        cnt++;
                    }
                }
            }
        }
        return cnt;  
    }
}