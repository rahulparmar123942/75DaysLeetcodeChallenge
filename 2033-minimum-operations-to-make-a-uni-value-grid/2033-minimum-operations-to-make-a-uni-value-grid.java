class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();

    int rem = grid[0][0] % x;

   
    for(int[] row : grid){
        for(int val : row){
            if(val % x != rem) return -1;
            list.add(val);
        }
    }

    
    Collections.sort(list); 
    int median = list.get(list.size()/2);
    int ops = 0;
    for(int val : list){
        ops += Math.abs(val - median) / x;
    }

    return ops;
}
}
