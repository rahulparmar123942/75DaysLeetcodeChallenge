class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        

        int[] freq = new int[26];

        for(char ch:magazine.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch:ransomNote.toCharArray()){

            int index = ch-'a';

            if(freq[index] == 0){
                return false;
            }
            freq[index]--;
        }
        return true;
    }
}