// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: iterating over the elements considreing directions

class DiagonalTraverse{
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m*n];
        int i=0, r =0, c = 0;
        int dir = 1;
        while(i< res.length){
            res[i] = matrix[r][c];
            if(dir == 1){
                if(c == n-1){ // check the column first to handle edge case
                    r++; dir = -1;
                } else if(r == 0){
                    c++; dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m-1){
                    c++; dir = 1;
                }
                else if(c == 0){
                    r++; dir = 1;
                }else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return res;
    }
}