public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0)
        return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] output = new int[m * n];
        int i = 0;
        boolean up = true;
        int row = 0, col = 0;
        while (i < n * m) {
            output[i] = matrix[row][col];
            if (up) {

                if (col == n - 1) {
                    row++;
                    ;
                    up = !up;

                } else if (row == 0) {
                    col++;
                    up = !up;

                } else {
                    row--;
                    col++;

                }

            } else {

                if (row == m - 1) {
                    col++;
                    up = !up;

                }

                else if (col == 0) {
                    row++;
                    up = !up;

                }

                else {
                    row++;
                    col--;

                }

            }
            i++;

        }
        return output;
    }
    public static void main(String[] args)
    {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       int[] output= findDiagonalOrder(matrix);
       for(int i=0;i<output.length;i++)
       {
           System.out.println(output[i]);

       }
    }

}
