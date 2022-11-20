import java.util.ArrayList;
import java.util.List;
//Time Complexity O(m*n)
//Space Complexity - O(1)
/*Initialize the matrix with 4 pointers top,left,right,bottom. Iterate over the matrix and create a newList, while maintaining
* the sequence*/
public class SpiralMatrix {
    //https://leetcode.com/problems/spiral-matrix/
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    //    System.out.println(Arrays.deepToString(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> newList = new ArrayList<Integer>();
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        while(top<=bottom&&left<=right) {
            for (int i = left; i <= right; i++) {
                newList.add(matrix[top][i]);
            }
            top++;

                for (int i = top; i <= bottom; i++) {
                    newList.add(matrix[i][right]);
                }
                right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    newList.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    newList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return newList;
    }
}
