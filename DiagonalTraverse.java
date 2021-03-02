// TC - O(m X n)
// SC - O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // sanity check, return empty array if matrix is null
        if(matrix == null || matrix.length == 0){
            return new int[]{};
        }
        // Calculate num of rows and num of cols
        int m = matrix.length;
        int n = matrix[0].length;
        // create a result array with size m*n as we need to return all the elements
        int[] result = new int[m*n];
        // Initizing few variables , r and c are row and column respectively
        int i=0;
        int r=0, c=0;
        // dir = 1 --> going up in array and dir = -1, goind down in array
        int dir = 1;
        // Loop till i < m*n
        while(i < m*n){
            // add current r and c matrix value to result array
            result[i] = matrix[r][c];
            // If dir == 1 which means going up, we need to check certain edge cases, like if c is last column or r is starting row else just increment c and decrement r, If c is last column, it means need to increment r and change the dir to -1
            if(dir == 1){
                if(c == n-1){
                    r++;
                    dir = -1;
                } else if(r == 0){
                    c++;
                    dir = -1;
                }else{
                    r--;
                    c++;
                }
                // If dir == -11 which means going down, we need to check certain edge cases, like if r is last row or c is starting column else just increment c and decrement r
            }else if(dir == -1){
                 if(r == m-1){
                     c++;
                     dir = 1;
                 }else if(c == 0){
                     r++;
                     dir = 1;
                 }else{
                     r++;
                     c--;
                 }
            }
            i++;
        }
        // return result
        return result;
    }
}