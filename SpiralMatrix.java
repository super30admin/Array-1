import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // TC - O(m*n)
        // SC - O(m*n)
        /* 
            To visit matrix in a spiral we take 4 pointers top, bottom, left, and right. We iterate from left to right (print top row and incr top pointer)
            , then top to bottom (print right column and decrement right pointer), right to left (print bottom row and decr bottom pointer) and 
            bottom to top (print left row and incr left pointer) in each loop.
        */
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        // termination condition if top and bottom cross or right and left pointers cross
        while (top <= bottom && left <= right) {
            //print top row and incr top pointer
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;
        
            //print right column and decrement right pointer
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            //check if top and bottom not invalid and print bottom row and decr bottom pointer
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            //check if left and right not invalid and print left row and incr left pointer
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}