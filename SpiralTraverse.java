// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//   1. We traverse the array from all the sides top, right, bottom, left in the respective manner.
//   2. When we traverse a specific side we squeeze that side by one level into the array.
//   3. Traverse all the elements until result array element count is same as the input elements count.

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> nums = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0){
            return nums;
        }
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int size = matrix.length * matrix[0].length;
        while(nums.size() < size){
            // Traverse the top row of the current spiral from left to right.
            for(int i = left; i <= right && nums.size() < size; i++){
                nums.add(matrix[top][i]);
            }
            // Squeeze top row one level down.
            top++;
            // Traverse the right col of the current spiral from top to bottom.
            for(int i = top; i <= bottom && nums.size() < size; i++){
                nums.add(matrix[i][right]);
            }
            // Squeeze right col one level left.
            right--;
            // Traverse the bottom row of the current spiral form right to left.
            for(int i = right; i >= left && nums.size() < size; i--){
                nums.add(matrix[bottom][i]);
            }
            // Squeeze bottom row one level up.
            bottom--;
            // Traverse the left col of the current spiral from bottom to top.
            for(int i = bottom; i >= top && nums.size() < size; i--){
                nums.add(matrix[i][left]);
            }
            // Squeeze left col one level right.
            left++;
        }
        return nums;
    }

    public static void printArr(List<Integer> nums){
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        printArr(spiralOrder(input));
        input = new int[][]{{1,2,3},{4,5,6}};
        printArr(spiralOrder(input));
        input = new int[][]{{1,2},{3,4}};
        printArr(spiralOrder(input));
    }
}
