// Time Complexity : O(m*n) ; since we are iterating the no of elements
// Space Complexity : O(1); return the arr
// Did this code successfully run on Leetcode : Yes (https://leetcode.com/submissions/detail/642162417/)
// Any problem you faced while coding this : No
// My Notes : Check inital direction and then understand the pattern when it reaches the row bound and the col bounds
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {

        int row_len = matrix.length;
        int col_len = matrix[0].length;
        // System.out.println(" Hey : matrix_dims : "+row_len+","+col_len);
        int x = 0, y = 0;
        int mat_len = row_len * col_len;
        // Creating arr size to return with given arr dims
        int[] result = new int[row_len * col_len];
        for (int i = 0; i < mat_len; i++) {
            // Check the direction as it is even, odd, even, odd, even. When even moves up
            // and odd moves down.
            boolean isDirUp = (x + y) % 2 == 0;
            // if x reaches the row_len
            boolean isLastRow = (x == row_len - 1);
            // if y reaches the col_len
            boolean isLastCol = (y == col_len - 1);
            // Storing current result as it starts with origin and then performing
            // operations
            result[i] = matrix[x][y];
            // Check direction then perform operations
            if (isDirUp) {
                if (isLastCol) {
                    // Move Down
                    // System.out.println(" POS_1.1 x,y : "+x+","+y+", value : "+matrix[x][y]);

                    x++;
                } else if (x == 0) {
                    // Move Right from the intial
                    // System.out.println(" POS_1.1 x,y : "+x+","+y+", value : "+matrix[x][y]);

                    y++;
                } else {
                    // System.out.println(" Middle elem going up");
                    // System.out.println(" POS_1.4 x,y : "+x+","+y+", value : "+matrix[x][y]);

                    x--;
                    y++;
                }
            } else {
                if (isLastRow) {
                    // System.out.println(" POS_2.4 x,y : "+x+","+y+", value : "+matrix[x][y]);
                    y++;
                } else if (y == 0) {
                    // System.out.println(" POS_2.1 x,y : "+x+","+y+", value : "+matrix[x][y]);
                    x++;
                } else {
                    // System.out.println(" Middle elem going down");
                    // System.out.println(" POS_2.2 x,y : "+x+","+y+", value : "+matrix[x][y]);
                    x++;
                    y--;
                }
            }
        }
        // System.out.println(" -- ");
        // for(int i : result){
        // System.out.print(i+" , ");
        // }
        // System.out.println(" -- ");
        return result;
    }

    public static void main(String[] args) {

    }
}
