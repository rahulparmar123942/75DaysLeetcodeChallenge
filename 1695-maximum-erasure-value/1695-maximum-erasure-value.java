class Solution {
    public int maximumUniqueSubarray(int[] arr) {
       
       HashSet<Integer> st = new HashSet<>();
       int i =0;
       int j =0;
       int maxSum =0;
       int sum =0;
       while(j<arr.length){
         
         if(!st.contains(arr[j])){
            st.add(arr[j]);
            sum +=arr[j];
            maxSum = Math.max(maxSum,sum);
            j++;
         }
         else{
            st.remove(arr[i]);
            sum -=arr[i];
            i++;
         }
         
       }
       return maxSum;
    }
}