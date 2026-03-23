import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] num) {
          Set<List<Integer>> ans = new HashSet<>();

          for(int i =0;i<num.length;i++){
             HashSet<Integer> set = new HashSet<>();

             for(int j=i+1;j<num.length;j++){
                int third = -(num[i]+num[j]);

                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(num[i],num[j],third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                 set.add(num[j]);

             }
          }

          return new ArrayList<>(ans);
    }
}