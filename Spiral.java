// Time Complexity : O(N) where n is the number of elements
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

public class Spiral {

    private void edgeElements(int[][] matrix, int i_low, int i_high, int j_low, int j_high, List<Integer> result){ // recursion
        if(i_low > i_high || j_low > j_high){
            return;
        }
        for(int i=j_low; i<=j_high; i++){
            result.add(matrix[i_low][i]);
        }
        for(int i=i_low+1; i<=i_high; i++){
            result.add(matrix[i][j_high]);
        }
        if(i_low == i_high || j_high == j_low){
            return;
        }
        for(int i=j_high-1; i>=j_low;i--){
            result.add(matrix[i_high][i]);
        }
        for(int i=i_high-1; i>=i_low+1;i--){
            result.add(matrix[i][j_low]);
        }
        edgeElements(matrix, i_low+1, i_high-1, j_low+1, j_high-1, result);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        edgeElements(matrix, 0, matrix.length-1, 0, matrix[0].length-1, result);
        return result;
    }
}
