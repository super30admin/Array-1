// Time Complexity : O(m*n) as we have to traverse the entire matrix at least once
// Space Complexity : O(1) no auxiliary space is used
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix == null || matrix.length < 1){
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int leftEnd = -1, rightEnd = n, j=0;
        int topEnd = -1, bottomEnd = m, i =0;

        while(leftEnd < rightEnd && topEnd <bottomEnd){

            //right
            while(j>= 0 && j <n && i >=0 && i<m && j < rightEnd){
                result.add(matrix[i][j++]);

            }
            rightEnd = --j; topEnd = i++;
            if(rightEnd == leftEnd || bottomEnd == topEnd){
                break;
            }

            //down
            while(j>= 0 && j <n && i >=0 && i<m && i < bottomEnd){
                result.add(matrix[i++][j]);
            }
            bottomEnd = --i; rightEnd = j--;
            if(rightEnd == leftEnd || bottomEnd == topEnd){
                break;
            }

            //left
            while(j>= 0 && j <n && i >=0 && i<m && j > leftEnd){
                result.add(matrix[i][j--]);
            }
            leftEnd = ++j; bottomEnd = i--;
            if(rightEnd == leftEnd || bottomEnd == topEnd){
                break;
            }

            //top
            while(j>= 0 && j <n && i >=0 && i<m && i > topEnd){
                result.add(matrix[i--][j]);
            }
            topEnd = ++i; leftEnd = j++;
            if(rightEnd == leftEnd || bottomEnd == topEnd){
                break;
            }
        }
        return result;

    }
}