// class Solution {

//      int[][] directions = {
//         {-1,0},
//         {1,0},
//         {0,1},
//         {0,-1}
//      };
//     int DFS(int[][] grid,int i,int j){
 
//         int n = grid.length;
//         int m = grid[0].length;

//         if(i<0 || i>=n || j<0 || j>=m){
//             return 0;
//         }

//         int originalGoldValue = grid[i][j];
//         grid[i][j]=0;

//         int maxGold =0;

//          for(int[] direction:directions){
//              int new_i = i+direction[0];
//              int new_j = j+direction[1];

//              maxGold = Math.max(maxGold,DFS(grid,new_i,new_j));
//          }

//          grid[i][j] = originalGoldValue;
//          return originalGoldValue + maxGold;
//         // DFS(grid,i-1,j);
//         // DFS(grid,i+1,j);
//         // DFS(grid,i,j-1);
//         // DFS(grid,i,j+1); inki jagah hum jo uper hai 
//     }
//     public int getMaximumGold(int[][] grid) {
        
//         int n = grid.length;
//         int m = grid[0].length;
    
//         int maxGold =0;

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){

//                 if(grid[i][j]!=0){

//                     maxGold = Math.max(maxGold,DFS(grid,i,j));
//                 }
//             }
//         }
//         return maxGold;
//     }
// }
class Solution {

    int[][] directions = {
        {-1, 0},
        {1, 0},
        {0, 1},
        {0, -1}
    };

    int DFS(int[][] grid, int i, int j) {

        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m
                || grid[i][j] == 0) {
            return 0;
        }

        int originalGoldValue = grid[i][j];
        grid[i][j] = 0;

        int maxGold = 0;

        for (int[] direction : directions) {
            int new_i = i + direction[0];
            int new_j = j + direction[1];

            maxGold = Math.max(
                maxGold,
                DFS(grid, new_i, new_j)
            );
        }

        grid[i][j] = originalGoldValue;

        return originalGoldValue + maxGold;
    }

    public int getMaximumGold(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int maxGold = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] != 0) {
                    maxGold = Math.max(
                        maxGold,
                        DFS(grid, i, j)
                    );
                }
            }
        }

        return maxGold;
    }
}