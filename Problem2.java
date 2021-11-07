import java.util.Arrays;

public class Problem2 {

    // TC : O(m*n)
    // SC : O(1)

    public static int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length <= 0 || mat[0].length <= 0) return new int[0];

        int m = mat.length;
        int n = mat[0].length;

        int[] output = new int[m*n];
        int idx = 0, i = 0, j = 0;
        boolean dir_up = true;

        while (idx < m*n){
            output[idx++] = mat[i][j];

            if(dir_up){

                if(j == n - 1){
                    dir_up = false;
                    i++;
                }else if(i == 0){
                    dir_up = false;
                    j++;
                }else{
                    i--;
                    j++;
                }

            }else{

                if(i == m - 1){
                    dir_up = true;
                    j++;
                }else if(j == 0){
                    dir_up = true;
                    i++;
                }else{
                    i++;
                    j--;
                }

            }

        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

}
