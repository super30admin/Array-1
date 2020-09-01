// Problem1
// Time Complexity : O(n) where, n = length of array
// Space Complexity : O(1) - no extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 1 - initiliaze array size same as input array
// 2 - iterate from left to right
// 3 - every element = previous result * previous element
// 4 - initiliaze multiplier = 1
// 5 - iterate from right to left
// 6 - result is multiplier times current result element
// 7 - multiplier is multiplier times current element
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 1
        int[] result = new int[nums.length];
        result[0] = 1;
        
        // 2
        for (int i=1; i<nums.length; i++) {
            // 3
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // 4
        int mul = 1;
        // 5
        for (int i=nums.length-1; i>=0; i--) {
            // 6
            result[i] = mul * result[i];
            // 7
            mul = mul * nums[i];
        }
        
        return result;
    }
}

// Problem2
// Time Complexity : O(n) where, n = matrix length * matrix row's length
// Space Complexity : O(1) - no extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 1 - base condition
// 2 - initialize pointers
// 3 - while loop
// 4 - if direction upwards
// 5 - edge case and middle elements
// 6 - if direction downwards
// 7 - edge case and middle elements
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // 1
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new int[0];
        }
        
        // 2
        boolean dir = true;
        int x = 0;
        int i = 0; int j = 0;
        int m = matrix[0].length; int n = matrix.length;
        int[] result = new int[m * n];
        // 3
        while (x < n * m) {
            result[x] = matrix[i][j];
        
            // 4
            if (dir) {
                // 5
                if (j == m - 1) {
                    dir = false;
                    i += 1;
                } else if (i == 0) {
                    dir = false;
                    j += 1;
                } else {
                    i -= 1;
                    j += 1;
                }
            } else { // 6
                // 7
                if (i == n - 1) {
                    dir = true;
                    j += 1;
                } else if (j == 0) {
                    dir = true;
                    i += 1;
                } else {
                    i += 1;
                    j -= 1;
                }
            }
            
            x++;
        }
        
        return result;
    }
}

// Problem3
// Time Complexity : O(n) where, n = matrix length * matrix row's length
// Space Complexity : O(1) - no extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 1 - base condition
// 2 - initialize pointers
// 3 - while condition
// 4 - loop over top row, right col, bottom row and left col
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 1
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        
        // 2
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        List<Integer> result = new ArrayList<>();
        
        // 3
        while (left <= right && top <= bottom) {
            // 4
            // top row: left -> right
            for(int x=left; x<=right; x++) {
                result.add(matrix[top][x]);
            }
            top++;
            
            // right col: top -> bottom
            for (int x=top; x<=bottom; x++) {
                result.add(matrix[x][right]);
            }
            right--;
            
            if (top <= bottom) {
                // bottom row: right -> left
                for (int x=right; x>=left; x--) {
                    result.add(matrix[bottom][x]);
                }
                bottom--;
            }
            
            if (left <= right) {
                // left col: bottom -> top
                for(int x=bottom; x>=top; x--) {
                    result.add(matrix[x][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}