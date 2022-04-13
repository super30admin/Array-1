import java.util.Arrays;

class diagonalTraverse{
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {};

        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int index = 0;
        int r =0;
        int c =0;
        int dir = 1;

        while(index < m*n){
            res[index] = mat[r][c];
            index++;
            if(dir == 1){
                if(c == n-1){
                    dir = -1;
                    r++;
                }
                else if(r == 0){
                    dir = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == m-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        diagonalTraverse dt = new diagonalTraverse();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(dt.findDiagonalOrder(mat)));
    }
}