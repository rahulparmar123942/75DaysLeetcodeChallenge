class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        int n = nums.length;
        if(n<=1) return n;
        ArrayList<Integer> ans = new ArrayList<>();
      
        for(int i=1;i<n;i++){
            int diff = nums[i]-nums[i-1];
           if(diff!=0) ans.add(diff);
        }
        
        if(ans.size()==0){
            return 1;
        }
       int count =1;
       int prev = ans.get(0);
       for(int j=1;j<ans.size();j++){
          int curr = ans.get(j);
          if((prev>0 && curr<0) || 
           (prev<0 && curr>0)){
            count++;
            prev = curr;
          }
          
       }
       return count+1;
    }
}