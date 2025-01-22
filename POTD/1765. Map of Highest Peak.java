//Date : 22.01.2025
//Porblem Statement no : 1765.                        
//Porblem Statement Topic :  Map of Highest Peak

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        //Declare the driection for finding the other values
        int dir[][] ={{-1,0},{0,1},{1,0},{0,-1}};
        //Fill the queue and mark as negative
        int n = isWater.length; //ROW
        int m = isWater[0].length; //Column
        int res [][] = new int[n][m]; //Result 
        Queue<int[]> queue = new LinkedList<>(); //Making new queue to store value

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(isWater[i][j]==1){
                    res[i][j] = 0;
                    queue.offer(new int[]{i,j});
                }
                else{
                    res[i][j] = -1;
                }
            }
        }

        while(!queue.isEmpty()){
            int cell[] = queue.poll();
            int r = cell[0];
            int c = cell[1];
            int h = res[r][c];
            for(int i=0; i<4; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                //To check the absolute value is 1 and it should not bound
                if(nr>=0 && nr<n && nc>=0 && nc<m && res[nr][nc]==-1){
                    res[nr][nc] = h+1;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }
        return res;
    }
}