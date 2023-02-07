// TC = O(m*n) m = no of rows, n = no of columns
// SC = O(1) , since no auxiliary space was used
import java.util.Arrays;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        if(mat==null||mat.length==0) return new int[]{};
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows*cols];
        int dir = 1;
        int idx = 0;
        int r=0;
        int c=0;
        while(idx<res.length){
            res[idx] = mat[r][c];
            idx++;
            if(dir == 1){
                if(c==cols-1){
                    r++;
                    dir = -1;
                }
                else if(r==0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==rows-1){
                    c++;
                    dir = 1;
                }
                else if(c==0){
                    r++;
                    dir = 1;
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
        int[] res = DiagonalTraverse.findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println(Arrays.toString(res));
    }
}
