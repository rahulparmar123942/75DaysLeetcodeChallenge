class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left =0;
        int right =matrix[0].length-1;
        int top = 0;
        int bottom =matrix.length-1;
        while(top<=bottom && left<=right){
            
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
        }

            for(int j=top+1;j<=bottom;j++){
                ans.add(matrix[j][right]);
            }

           if(top<bottom){
            for(int i =right-1;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
           }
        if(left<right){
            for(int j=bottom-1;j>top;j--){
                ans.add(matrix[j][left]);
            }
        }
           
        top++;
        right--;
        left++;
        bottom--;
    }
        return ans;
    }
}