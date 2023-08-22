// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class spiralMatrix {
       public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new ArrayList<>();
        }
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top=0,bottom=m-1;
        int left=0,right=n-1;

        while(top<=bottom && left<=right){
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            //right column
            if(left<=right){
             for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            }

            //bottom row
             if(top<=bottom){
             for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }

            //left column
             if(left<=right){
             for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
             }
        }
        return result;
    }

    public static void main(String[] args) {
    spiralMatrix rs = new spiralMatrix();
    int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    int[][] matrix2 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

    System.out.println(rs.spiralOrder(matrix1));  // ans = [1,2,3,6,9,8,7,4,5]
    System.out.println(rs.spiralOrder(matrix2));  // ans = [1,2,3,4,8,12,11,10,9,5,6,7]
}

}