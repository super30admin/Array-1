class Solution {
    private static final int up=0, down=1;
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length, n=mat [0].length;
        int[] ans = new int[m*n];
        int ansi = 0;
        int direction = up;
        int row=0, col=0;
        while(ansi != m*n) {
        ans[ansi] = mat[row][col];
        ++ansi;
        if(direction==up){
            if(col == n-1) {
               direction = down;
                ++row;
            } else if(row==0){
            direction = down;
            ++col;
            } else {
                --row;
                ++col;
            }
        } else {
            if(row==m-1){
            direction = up;
            ++col;
            } else if(col==0){
                direction = up;
                ++row;
            } else {
                ++row;
                --col;
            }
        }
        }
        return ans;
    }
}
//tc =O(n)
//sc=O(1)
