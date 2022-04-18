import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Time Complexity : O(mn) m is col n is rows
// Space Complexity : O(x) where x is elements in max diagonal
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : we traverse the diagonals, and reverse when the diagonal is odd

public class DiagonalTraverse {
    public int[] diagonalTraverse(int[][] matrix){
        if( matrix == null || matrix.length ==0){
            return new int[0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int retObject[] = new int[rows * cols];
        int index =0;
        List<Integer> list = new ArrayList<>();

        // iterate through diagnol
        for( int diag =0; diag < (rows + cols -1) ; diag++){
            int row = diag< cols ? 0 : diag-cols +1;
            int col = diag< cols ? diag : cols -1;
            list.clear();
            while( row < rows && col >=0 ){
                list.add(matrix[row][col]);
                row++;
                col--;

            }
            if((diag +1)%2 !=0){
                Collections.reverse(list);
            }

            for( Integer data : list){
                if( index < retObject.length){
                    retObject[index++]=data;
                }
            }

        }
        return retObject;
    }
}
