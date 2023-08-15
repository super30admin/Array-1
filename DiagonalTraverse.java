// tc = 0(m*n)
//sc = 0(1)

import java.util.Arrays;

public class DiagonalTraverse {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        DiagonalTraverse obj = new DiagonalTraverse();
        int[] obj1 = obj.diagonal(arr);
        System.out.println("Diagonal Matrx are " + Arrays.toString(obj1));
    }

    public int[] diagonal(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int i = 0;
        int j = 0;
        int dir = 1;
        int index = 0;

        while (index < result.length) {
            result[index] = matrix[i][j];
            index++;

            if (dir == 1) {

                // up
                if (j == n - 1) {
                    i++;
                    dir = -1;
                } else if (i == 0) {
                    j++;
                    dir = -1;

                } else {
                    i--;
                    j++;
                }

                // down
            } else {

                if (i == m - 1) {
                    j++;
                    dir = 1;
                } else if (j == 0) {
                    i++;
                    dir = 1;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return result;

    }

}
