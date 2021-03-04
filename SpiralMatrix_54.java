import java.util.*;

//TC: O(m*n) where m is no of rows and n is the number of colum. we are traversing through all the elements. 
//SC: O(1) we are only creating the array list which is not used for auxilary purposes.
class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> array = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0)
            return array;
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            if (rowStart <= rowEnd && colStart <= colEnd) {
                for (int i = colStart; i <= colEnd; i++) {
                    array.add(matrix[rowStart][i]);
                }
                rowStart++;
            }

            if (rowStart <= rowEnd && colStart <= colEnd) {
                for (int i = rowStart; i <= rowEnd; i++) {
                    array.add(matrix[i][colEnd]);
                }
            }
            colEnd--;
            if (rowStart <= rowEnd && colStart <= colEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    array.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if (rowStart <= rowEnd && colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    array.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        SpiralMatrix_54 spiralMatrix_54 = new SpiralMatrix_54();
        List<Integer> result = spiralMatrix_54.spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        System.out.println(result);
    }
}