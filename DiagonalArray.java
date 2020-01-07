// Time Complexity :O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english:
// 1. Create pointers for row and column
// 2. Iterate matrix with these pointers handling directions of flow
// 3. Handle Iteration as per direction of flow
class DiagonalArray {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = 0, dir = 1;
        int[] result = new int[m*n];
        
        int i = 0;
        while(i < (m*n)){
            result[i] = matrix[r][c];
            if(dir == 1){
                if(c == n - 1){
                    r++;
                    dir = -1;
                } else if(r == 0){
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m - 1){
                    c++;
                    dir = 1;
                } else if(c == 0){
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}