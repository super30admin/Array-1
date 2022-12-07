// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english No

// Your code here along with comments explaining your approach - 

public class DiagonalTraverse {

        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int r = 0;
            int c = 0;
            int[] arr = new int[m*n];
            boolean upDir = true;
            for (int i=0; i<m*n; i++){
                arr[i] = mat[r][c];
                if (upDir){
                    if (r == 0 && c != n-1){
                        c++; upDir = false;
                    } else if ( c == n-1){
                        r++; upDir = false;
                    } else {
                        r--; c++;
                    }
                } else {
                    if (c == 0 && r != m-1){
                        r++; upDir = true;
                    } else if (r == m-1){
                        c++; upDir = true;
                    } else {
                        r++; c--;
                    }
                }
            }
            return arr;
        }
        
}
