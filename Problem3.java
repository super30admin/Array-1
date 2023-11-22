import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Take 4 corner variables each on the 4 corners of the matrix. After each pass
//make the boundary smaller by reducing the corner varibles by one. Store
//the value in an arrayList diring each pass.
// Your code here along with comments explaining your approach
class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int right = n-1;
        int left = 0;
        int bottom = m-1;
        int counter = 0;
        List<Integer> arr = new ArrayList<Integer>();
        while(top <= bottom && left <= right){

            for(int i=left; i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<= bottom ; i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right; i>=left ; i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<= right){
                for(int i=bottom; i>=top; i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
