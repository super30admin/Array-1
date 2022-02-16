import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Time Complexity: O(MN)
Space Complexity: O(1)
Leetcode submission worked? yes

Solved after discussed in the class
 */
public class DiagonalOrderMatrix {
    public static int[] findDiagonalOrder(int[][] matrix) {
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
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result = findDiagonalOrder(matrix);
        System.out.print("[");
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+",\t");
        }
        System.out.print("]");
    }
}
