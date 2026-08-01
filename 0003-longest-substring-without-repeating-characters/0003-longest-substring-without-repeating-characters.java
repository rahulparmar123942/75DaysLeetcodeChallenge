class Solution {
    public int lengthOfLongestSubstring(String s) {
    
     HashSet<Character> ans = new HashSet<>();
     int j = 0;
     int maxLen =0;

     for(int i=0;i<s.length();i++){

        char ch = s.charAt(i);
        while(ans.contains(ch)){
            ans.remove(s.charAt(j));
            j++;
        }
        ans.add(ch);
        maxLen = Math.max(maxLen,i-j+1);
     }
     return maxLen;
    }
}