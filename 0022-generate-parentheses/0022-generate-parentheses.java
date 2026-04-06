class Solution { 
    private void parenthesis(String curr ,int n,int left,int right,ArrayList<String>ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
       
    if(left < n){
    parenthesis(curr + "(",n,left+1,right,ans);
    }
    if(right < left){
    parenthesis(curr + ")",n,left,right+1,ans);
    }
}
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        parenthesis("",n,0,0,ans);
        return ans;
    }
}