// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//   1. We traverse based on the direction which is either up or down.
//   2. In each direction we have three cases to handle.
//   3. When we hit the top row/last col, bottom row/first col and in the middle of the array.

// Your code here along with comments explaining your approach

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, direction = 1, row = 0, col = 0;
        int[] result = new int[m*n];
        
        while(i < m*n){
            result[i] = mat[row][col];
            
            // If direction is 1, we are traversing up.
            if(direction == 1){
                // If we hit the last column, then we move to next row and change direction.
                if(col == n-1){
                    row++;
                    direction = -1;
                // If we hit the top row then we move to the next column and change direction.
                }else if(row == 0){
                    col++;
                    direction = -1;
                // We are in the middle of the array. so we move to next element which is up diagonally.
                }else{
                    row--;
                    col++;
                }
            // If direction is not 1, then we are traversing down.
            }else{
                // If we hit the last row, then we move to next column and change direction.
                if(row == m-1){
                    col++;
                    direction = 1;
                // If we hit the first column then we move to the next row and change direction.
                }else if(col == 0){
                    row++;
                    direction = 1;
                // We are in the middle of the array. so we move to next element which is down diagonally.
                }else{
                    row++;
                    col--;
                }
            } 
            i++;
        }
        return result;
    }

    public static void printArr(int[] nums){
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        printArr(findDiagonalOrder(input));
        input = new int[][]{{1,2,3},{4,5,6}};
        printArr(findDiagonalOrder(input));
        input = new int[][]{{1,2},{3,4}};
        printArr(findDiagonalOrder(input));
    }
}
