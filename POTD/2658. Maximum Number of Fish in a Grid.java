//Date : 2.01.2025
//Porblem Statement no : 2658.                           
//Porblem Statement Topic : Maximum Number of Fish in a Grid

class Solution {
    int rows;
    int cols;
    public int findMaxFish(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int maxfish =0;
        //find max value
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                // if grid is not equal to 0 than they are added and we have to find the max 
                if(grid[i][j]!=0){
                    maxfish = Math.max(maxfish , dfs(i,j,grid));
                }
            }
        }
        return maxfish;
        
    }

    public int dfs(int r , int c , int grid[][]){
        // base case 
        // out of bound 
        // water place
        // land place

        //to check if grid is less than 0 or out of bound 
        if(r<0 || r>=rows || c<0 || c>=cols || grid[r][c]==0){
            return 0;
        }
        // grid is at water place
        int ans = grid[r][c];
        grid[r][c] = 0 ; //if visisted
        
        //to perform different operations to get max value 
        ans+= dfs(r-1,c,grid) + dfs(r,c+1,grid) + dfs(r+1,c,grid) + dfs(r,c-1,grid);
        return ans;
    }
}