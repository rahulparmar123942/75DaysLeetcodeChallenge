class Solution {
    public int maxChunksToSorted(int[] arr) {
        

        int n = arr.length;
         
         int sum =0;
         int maxSum =0;
         int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
             sum += arr[i];
             arr1[i] = sum;
        }

        int[] arr2 = new int[n];
        int count =0;
        for(int j=0;j<n;j++){
           arr2[j] = j*(j+1)/2;
           
        }
  
         for(int k =0;k<n;k++){
            if(arr1[k] == arr2[k])count++;
         }
        return count;
    }
}

