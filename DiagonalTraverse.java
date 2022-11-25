/**
 * TC - O(m * n)
 * SC - O(1)
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int[] result = new int[row * col];

        boolean up = true;
        int count = 0;
        int i = 0, j = 0;

        while(count < result.length) {
            result[count] = mat[i][j];
            count++;
            if(up) {

                if(j ==  col - 1) {
                    i++;
                    up = false;
                } else if (i == 0){
                    up = false;
                    j++;
                } else {
                    i--;
                    j++;
                }

            } else {
                if (i == row - 1) {
                    up = true;
                    j++;

                } else if (j == 0 ) {
                    up = true;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }

        }
        return result;
    }
}
