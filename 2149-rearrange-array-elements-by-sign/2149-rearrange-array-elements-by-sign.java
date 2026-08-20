/* 
   to optimized the solution 
   int nums[0]> 0 and also if(nums[0] > 0 then we add it in ) in arraylist
   if prev = nums[i]  if(prev>0 then num[i+1]<0

   
   for(int i=0;i<n;i++){
       
   }
*/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int[] arr = new int[n];
           int pos = 0;
           int neg = 1;

           for(int i=0;i<n;i++){
            if(nums[i]>0){
              arr[pos] = nums[i];
            pos +=2;
            }
            else {
                arr[neg] = nums[i];
                neg +=2;
            }
           }
           return arr;
    //     int n = nums.length; 
    //     ArrayList<Integer> ans1 = new ArrayList<>();
    //     ArrayList<Integer> ans2 = new ArrayList<>();
    //    int[] arr = new int[n];
    //     for(int i=0;i<n;i++){
    //         if(nums[i]<0){
    //             ans1.add(nums[i]);
    //         }
    //     }
    //     for(int j=0;j<n;j++){
    //         if(nums[j]>0){
    //             ans2.add(nums[j]);
    //         }
    //     }
    //     int idx =0;
    //     for(int k=0;k<n/2;k++){

    //         arr[idx++] = ans2.get(k);
    //         arr[idx++] = ans1.get(k);
    //     }
    //     return arr;
    }
}