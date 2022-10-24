
// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {

            int m = matrix.length;
            int n = matrix[0].length;

            int rowStart = 0;
            int rowEnd = m - 1;
            int colStart = 0;
            int colEnd = n - 1;

            List <Integer> result = new ArrayList<>();

            while (result.size() != (m * n)  )
            {
                // Right: row fix, move col
                for (int  j = colStart ; j <= colEnd ; j++){
                    result.add(matrix[rowStart][j]);
                }
                ++rowStart;

                // Down
                for (int  i = rowStart ; i <= rowEnd ; i++){
                    result.add(matrix[i][colEnd]);
                }
                --colEnd;

                // Left
                if(rowStart <= rowEnd)  {
                    for (int j = colEnd; j >= colStart; j--) {
                        result.add(matrix[rowEnd][j]);
                    }
                    --rowEnd;

                }


                // Top
                if(colStart <= colEnd) {
                    for (int i = rowEnd; i >= rowStart; i--) {
                        result.add(matrix[i][colStart]);
                    }
                    ++colStart;
                }
            }

            return result;
        }

        public static void main(String[] args){
            int nums[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            SpiralMatrix obj = new SpiralMatrix();
            System.out.println(obj.spiralOrder(nums));

        }
    }
