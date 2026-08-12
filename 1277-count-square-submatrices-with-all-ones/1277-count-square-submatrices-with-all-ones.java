class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int count =0;
        int maxSubSqaure =0;
        int[][] dp = new int[n][m];
       
       
       for(int i=1;i<n;i++){
         for(int j=1;j<m;j++){
           if(matrix[i][j] == 1){
           
           matrix[i][j] = 1+Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i][j-1]));
        }
           
         }
       }
       int sum  =0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            sum +=matrix[i][j];
        }
       }
       return sum;
    }
}