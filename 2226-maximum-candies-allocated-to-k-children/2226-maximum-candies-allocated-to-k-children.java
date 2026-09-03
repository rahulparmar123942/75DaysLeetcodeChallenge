class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        int n = candies.length;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,candies[i]);
        }

        int low=1;
        int high=max;
       
        int result =0;
        while(low<=high){

            int mid = low+(high-low)/2;

            if(isValid(candies,k,mid)==true){
                 result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
    boolean isValid(int[] candies,long k,int max){
        
        int n = candies.length;
        
        long student = 0;
       
        for(int i=0;i<n;i++){
        student+= candies[i]/max;
        
        if(student>=k) return true;
        }
        return false;
        }
    }
