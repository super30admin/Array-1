public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        int[] res = new int[row * col];
        int r = 0, c = 0;
        boolean flag = true;

        for (int i = 0; i < row * col; i++) {

            res[i] = mat[r][c];

            if (flag) {
                if (c == col-1) {
                    flag = false;
                    r++;
                } else if (r == 0) {
                    flag = false;
                    c++;
                } else {
                    r--;
                    c++;
                }
            }else{
                if(r == row-1){
                    flag = true;
                    c++;
                }else if(c == 0){
                    flag = true;
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
        }

        return res;
    }
} 
