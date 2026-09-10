class Solution {
    public String frequencySort(String s) {

        int n = s.length();
        char[] arr = s.toCharArray();
 
        HashMap<Character,Integer> map = new HashMap<>();
        // if a.getValue()-b.getValue() increasing order banayega
        // if b.getValue()-a.getValue() decreasing order banayega
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
       

       for(char ch:s.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(Map.Entry<Character,Integer> entry:map.entrySet()){
        pq.offer(entry);
       }

       StringBuilder sb = new StringBuilder();

       while(!pq.isEmpty()){
          
          Map.Entry<Character,Integer> entry = pq.poll();
          char ch = entry.getKey();
          int freq = entry.getValue();

          for(int i=0;i<freq;i++){
            sb.append(ch);
          }
       }

       return sb.toString();
    }
}