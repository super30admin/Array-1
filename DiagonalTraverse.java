// Time Complexity : O(row * column)
// Space Complexity : O(1), no extra space
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // number of rows
        int n = mat[0].length;
        int i =  0;
        int j = 0;
        boolean direction = true; // start from up direction
        int[] result = new int[m * n]; // result matrix

        for(int idx = 0; idx < m*n; idx++){
            result[idx] = mat[i][j];
            if(direction){
                // up direction
                if(j == n-1){
                    // we are at top right index, go down now
                    i++;
                    direction = false;
                } else if(i == 0){
                    // now go down, as we are at top
                    j++;
                    direction = false;
                } else {
                    // traverse
                    j++;
                    i--;
                }
            } else {
                // direction is down
                if(i == m-1){
                    // we are at bottom left element
                    j++;
                    direction = true;
                } else if(j == 0){
                    // increment
                    i++;
                    direction = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}