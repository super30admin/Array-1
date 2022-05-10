import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
//Time Complexity: O(m *n)
//space Complexity: O(space needed for one diagonal) but ill be constant so O(1)
//Leetcode; yes.
public class DiagonalTraverseLeetcode498 {

        public int[] findDiagonalOrder(int[][] matrix) {
            if(matrix == null || matrix.length == 0){
                return new int[0];
            }

            int n = matrix.length;
            int m = matrix[0].length;

            int[]result = new int[n*m];

            int k = 0;

            List<Integer> intermediate = new ArrayList<>();

            for(int i = 0; i<n+m-1; i++){
                intermediate.clear();

                int r = i<m ? 0: i-m+1;
                int c = i<m ? i: m-1;

                while(r<n && c>-1){
                    intermediate.add(matrix[r][c]);
                    r++;
                    c--;
                }
                if( i%2 == 0){
                    Collections.reverse(intermediate);
                }

                for(int j =0; j<intermediate.size(); j++){
                    result[k++] = intermediate.get(j);
                }
            }
            return result;

        }
}
