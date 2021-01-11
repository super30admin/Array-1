// time complexity : O(m*n)
// space complexity : O(m*n)
package ThirdWeek;

public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] matrix) {

        if(matrix == null || matrix.length ==0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;

        int result[] = new int[m*n];
        int i = 0;int j=0;int idx = 0;
        int dir = 1;

        while(idx <result.length) {
            result[idx] = matrix[i][j];
            if (dir == 1) {
                if (j == n - 1) { // last column
                    i++;
                    dir = -1; // change direction
                } else if (i == 0) { // first row
                    j++;
                    dir = -1; // change direction
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) { // last row
                    j++;
                    dir = 1; // change direction
                } else if (j == 0) { // first column
                    i++;
                    dir = 1; // change direction
                } else {
                    i++;
                    j--;
                }
            }
            idx++;
        }
        return result;
    }

    public static void print(int result[])
    {
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6 }, { 7, 8, 9 }  };
        print(findDiagonalOrder(matrix));
    }
}
