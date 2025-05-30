// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //Build left product array in result
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Multiply with right product
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }
}



/*Brute force- O(n^2)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            result[i] = prod;
        }

        return result;
    }
}*/


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];

        int i = 0, j = 0;
        boolean flag = true;  // true = up-right, false = down-left

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = mat[i][j];

            // Moving up-right
            if (flag) {
                if (j == n - 1) {
                    i++;       // right boundary, go down
                    flag = false;
                } else if (i == 0) {
                    j++;       // top boundary, go right
                    flag = false;
                } else {
                    i--; j++;  // regular up-right move
                }
            }

            // Moving down-left
            else {
                if (i == m - 1) {
                    j++;       // bottom boundary, go right
                    flag = true;
                } else if (j == 0) {
                    i++;       // left boundary, go down
                    flag = true;
                } else {
                    i++; j--;  // regular down-left move
                }
            }
        }

        return arr;
    }
}


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        if (matrix == null || m == 0 || n == 0){
            return result;
        }
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while ( top <= bottom && left <= right){
            //top row- traversing left to right
            for (int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }top++;
            //right col- traversing top to bottom
            for (int i = top; i<= bottom; i++){
                result.add(matrix[i][right]);
            }right--;
            //bottom row- traversing right to left
            if (top <= bottom){
                for (int i = right; i>= left; i-- ){
                    result.add(matrix[bottom][i]);
                }bottom--;
            }
            //left col- traversing bottom to top
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }left++;
            }
        }

        return result;

    }
}