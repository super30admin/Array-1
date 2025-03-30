// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach -  Use 4 boundaries top, down, left, right. While top <= bottom and left <= right: traverse from left to right on the top row, then top++ and then traverse from top to bottom on the right column, then right--
//then traverse from right to left on the bottom row, then bottom--
//then traverse from bottom to top on the left column, then left++


import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;  //no. of rows
        int m = matrix[0].length;   //no. of columns
        int left = 0, right = m-1, top = 0, bottom = n-1;   //intialize variables
        List<Integer> ans = new ArrayList<>();

        //loop till top is less equal to bottom and left is less equal to right
        while(top <= bottom && left <= right) {
            //right direction
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;      //increment top
            //trick - increment or decrement constant variable in the last used loop

            //down direction
            for(int i=top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;    //decrement right

            if(top <= bottom) {     //to handle cases like single row in martix
                //left direction
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;   //decrement bottom
            }

            if(left <= right) {     //to handle cases like single column in matrix
                //up direction
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;     //increment left
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SprialMatrix solver = new SprialMatrix();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result1 = solver.spiralOrder(matrix1);
        System.out.println("Spiral traversal of 3x3:");
        System.out.println(result1);

        int[][] matrix2 = {
                {1,  2,  3,  4 },
                {5,  6,  7,  8 },
                {9, 10, 11, 12}
        };
        List<Integer> result2 = solver.spiralOrder(matrix2);
        System.out.println("Spiral traversal of 3x4:");
        System.out.println(result2);
    }
}
