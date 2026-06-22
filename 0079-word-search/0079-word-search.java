class Solution {
    boolean search(char[][] b,String w,int r,int c,int idx){
             if(idx==w.length()){
                return true;
             }

             if(r<0 || r>=b.length || c<0 || c>=b[0].length){
                return false;
             }
            if(b[r][c]!=w.charAt(idx)){
                return false;
            }
                char temp = b[r][c];
                b[r][c] = '#';
                boolean found = 
                search(b,w,r-1,c,idx+1)||//up
                search(b,w,r+1,c,idx+1)||//down
                search(b,w,r,c-1,idx+1)||//left
                search(b,w,r,c+1,idx+1);
                
                 b[r][c] =temp;
                 return found;
        
    }
    public boolean exist(char[][] b, String w) {
        int n = b.length;
        int m = b[0].length;
          for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
              
                    if (search(b,w,i,j,0)){
                    return true;
                    
                }
            }
          }
          return false;
    }
}