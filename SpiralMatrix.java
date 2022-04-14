import java.util.List;
import java.util.ArrayList;

class SpiralMatrix {

    // Time Complexity :0(m*n) where m is the no. of rows and n is the no. of column
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I declared top, bottom, left and right pointing to the outermost
    //index in the input matrix. Once the traversal for top row is over, I increment the top row so that the elements are not
    //repeated. Then I traverse from top right to bottom. Once that is done, decrement the index of right again for the same
    //reson. Similarly I traverse right to left and then bottom to top decrementing bottom and incrementing left for the above
    //purpose. Finally I have my resultant matrix.

// Your code here along with comments explaining your approach

    public List<Integer> spiralOrder(int[][] matrix) {
        int rowlength = matrix.length;
        int columnlength = matrix[0].length;
        int top = 0;
        int bottom = rowlength - 1;
        int left = 0;
        int right = columnlength-1;
        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top ++;
            for(int j = top; j <= bottom; j++){
                result.add(matrix[j][right]);
            }
            right --;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int j =bottom; j >= top; j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }
        return result;
    }
}