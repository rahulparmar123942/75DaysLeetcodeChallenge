class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int n = A.length;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int x = 0; x <= i; x++) {
                for (int y = 0; y <= i; y++) {
                    if (A[x] == B[y]) {
                        count++;
                    }
                }
            }

            c[i] = count;
        }

        return c;
    }
}
    
