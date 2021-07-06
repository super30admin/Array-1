// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No, TLE
// Three line explanation of solution in plain english

class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length * mat[0].length;
        int[] res = new int[n];
        
        int k = 0;

        int x = mat[0].length + mat.length;
        for(int i=0; i<= x; i++) {
            
            if(i >= mat[0].length) {
                i = i%mat[0].length;
            }
            for(int j = 0; j <= i; j++) {
                if(k < n) {
                    if(i % 2 == 0) 
                     res[k++] = mat[i-j][j];
                    
                    else 
                    res[k++] = mat[j][i-j];
                 
                }
                else {
                    return res;
                }
            }
        }
        return res;
    }
}