/*
Intuition : Just traverse the matrix upwarsda nd downwards and write dynamic code
time : O(mxn)
Space : O(1)
 */

public class DiagonalTraverse {
        public static int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;

            int[] arr = new int[m * n];

            int i = 0, j = 0;
            boolean flag = true;

            for (int idx = 0; idx < arr.length; idx++) {
                arr[idx] = mat[i][j];

                //new position of i, j

                if (flag) {
                    if (j == n - 1) {
                        flag = false;
                        i++;
                    } else if (i == 0) {
                        flag = false;
                        j++;
                    } else {
                        i--;
                        j++;
                    }
                } else {
                    if (i == m - 1) {
                        flag = true;
                        j++;
                    } else if (j == 0) {
                        flag = true;
                        i++;
                    } else {
                        j--;
                        i++;
                    }
                }
            }

            return arr;
        }

    public static void main(String[] args) {
       int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] result = findDiagonalOrder(mat);

        for(int i=0; i < result.length; i++){
            System.out.print(" " + result[i]);
        }
    }
}
