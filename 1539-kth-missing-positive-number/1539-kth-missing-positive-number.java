class Solution {
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length-1;
        int missing;

        while(low<=high){

            int mid = low+(high-low)/2;

             missing = arr[mid]-(mid+1);// formula of finding how many number missing before this number
            if(missing<k){
                low = mid+1;
            }else  {
                high = mid-1;
            }
        }
        
        return low+k;
    }
}
