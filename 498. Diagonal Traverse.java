class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[0];
        int r = 0, c = 0, dir = 1;
        int m = mat.length, n = mat[0].length;
        int[] res = new int [m * n];
        int i = 0; 
        while(i < m * n){
            res[i] = mat[r][c];
            if(dir == 1){
                // if c == n - 1, that means we reach to the end of columns,
                // so we need move to next row and change the direction.
                if(c == n - 1){
                    r++; dir = -1;
                }else if(r == 0){
                    // we set the starting point as mat[0][0]
                    // if r == 0, that means we are in the first row,
                    // so we should add c and change the direction.
                    c++; dir = -1;
                }else{
                    // this aims to traverse the values on same diagonal path
                    r--; c++;
                }
            }else{
                // all of these below will behave the opposite way of above
                if(r == m - 1){
                    c++; dir = 1;
                }else if(c == 0){
                    r++; dir = 1;
                }else{
                    r++; c--;
                }
            }
            i++;
        }
        return res;
    }
}