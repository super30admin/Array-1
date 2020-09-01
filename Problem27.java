//Time Complexity: O(m*n)
//Space Complexity: O(1)
//Did it run on leetcode: Yes
//Problems faced any: No


import java.util.ArrayList;
import java.util.List;
public class Problem27 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length == 0 || matrix[0].length==0)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top<=bottom && left<=right){

            //top row: left -> right
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            //right column: top -> bottom
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            //bottom row: right -> left
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left column: bottom -> top
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
