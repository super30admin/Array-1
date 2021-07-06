// Time Complexity : O(M*N), where M*N is the size of the mat.
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/submissions/detail/517875869/

class Solution3 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; 
        int n = mat[0].length; 
        
        int output[] = new int[m*n]; 
        
        boolean up = true;
        // calculating the number of diagonals. 
        int diagonalLength = 2*Math.max(m, n);
        if(m==n) diagonalLength--;
        
        int d=0, i=0, j=0, k=0;
        while(d < diagonalLength) {
            if (up) {
                // traversing the diagnoal in upwards direction.
                while(i>=0 && j<n) {
                    output[k++] = mat[i--][j++];
                }
                i++;
                if(j == n) {
                    j--;
                    i++;
                }
            }
            else {
                // traversing the diagnoal in downwards direction
                while(i<m && j>=0) {
                    output[k++] = mat[i++][j--];
                }
                j++;
                if(i== m) {
                    i--;
                    j++;
                }
            }
            d++;
            // reversing the direction.
            up = !up; 
        }
        
        return output; 
    }
}