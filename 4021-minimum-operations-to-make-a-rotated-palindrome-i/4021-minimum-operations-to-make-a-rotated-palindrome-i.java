class Solution {
    public int minOperations(String s){

      int n = s.length();
      int ans = Integer.MAX_VALUE;

      for(int i =0;i<n;i++){

        int cost = 0;
        int left = 0;
        int right = n-1;

        while(left<right){

            int leftIndex = (left+i)%n;
            int rightIndex = (right+i)%n;

            char leftChar = s.charAt(leftIndex);
            char rightChar = s.charAt(rightIndex);

            int cost1 = (rightChar - leftChar + 26) % 26;
            int cost2 = (leftChar - rightChar + 26) % 26;

            cost += Math.min(cost1, cost2);
            left++;
            right--;
        }

          ans = Math.min(ans,cost+i);
      }
      return ans;
    }
}