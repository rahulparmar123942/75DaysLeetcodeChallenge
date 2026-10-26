class Solution {
    public String reverseStr(String s, int k) {
                                        //0    1    2   3   4   5  6
        char[] arr = s.toCharArray();// "a" "b" "c" "d" "e" "f" "g"

        for(int i=0;i<arr.length;i+=2*k){
            
            int left = i;
            int right = Math.min(i+k-1,arr.length-1);
        
         while(left<right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
         }
        }
       return new String(arr);
    }
}

// 0 th position se 1 tak reverse
// 