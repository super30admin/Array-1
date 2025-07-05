# Array-1

## Problem 1
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

1. We can make an observation that each number's product is the product of the numbers that come before it and the product of numbers that comes after it
2. So we declare an ans array and then we will first fill the ans array with the product of the numbers that comes before it 
3. now in the second for loop we will multiply the prefix product of each number present in the array with the postfix and then we will update the postfix as postfix*nums[i](nums[i] is the current element whose product we found)

// Your code here along with comments explaining your approach

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for(int i=1; i<n;i++){
            ans[i] = ans[i-1]*nums[i-1];//prefix product
        }
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) { //postfix product
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }
}

## Problem 2
/ Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

1. We are going to have a variable called dir which is either true(going in upward direction) or false(going in downloard direction)
2. Run a loop for length m*n and add the element in the ans array
3. if the direction is positive we will check if we are at the last col or the 0th row that means we are suppose to change the direction
4. If the direction is negative so we will check if are in the last row or 0th col that means we are suppose to change the direction 

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length, n = mat[0].length;
        int[] ans = new int[m * n];
        int row = 0, col = 0;
        boolean dir = true; // true = up-right, false = down-left

        for (int i = 0; i < m * n; i++) {
            ans[i] = mat[row][col];

            if (dir) {
                if (col == n - 1) {
                    row++;
                    dir = false;
                } 
                else if (row == 0) {
                    col++;
                    dir = false;
                } 
                else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) { 
                    col++;
                    dir = true;
                }
                else if (col == 0) {
                    row++;
                    dir = true;
                } 
                else {
                    row++;
                    col--;
                }
            }
        }

        return ans;
    }
}

## Problem 3
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

1. First we will go from Top left to Top right and mark the visited cells with Integer.MIN_VALUE so that we do not visit them again
2. Then we will go from Top right to Bottom right and mark the visited cells with Integer.MIN_VALUE so that we do not visit them again
3. First we will go from bottom Right to Bottom Left and mark the visited cells with Integer.MIN_VALUE so that we do not visit them again
4. First we will go from Bottom left to Top left and mark the visited cells with Integer.MIN_VALUE so that we do not visit them again

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        int r = 0, c = 0;

        for (int i = 0; i < m * n; i++) {
            //Top left to Top right 
            while (c < n && matrix[r][c] != Integer.MIN_VALUE) {
                result.add(matrix[r][c]);
                matrix[r][c] = Integer.MIN_VALUE;
                c++;
            }
            c--; r++;

            //TopRight to BottomRight
            while (r < m && matrix[r][c] != Integer.MIN_VALUE) {
                result.add(matrix[r][c]);
                matrix[r][c] = Integer.MIN_VALUE;
                r++;
            }
            r--; c--;

            //BottomRight to BottomLeft
            while (c >= 0 && matrix[r][c] != Integer.MIN_VALUE) {
                result.add(matrix[r][c]);
                matrix[r][c] = Integer.MIN_VALUE;
                c--;
            }
            c++; r--;

            //bottom Left to Top Left
            while (r >= 0 && matrix[r][c] != Integer.MIN_VALUE) {
                result.add(matrix[r][c]);
                matrix[r][c] = Integer.MIN_VALUE;
                r--;
            }
            r++; c++;
        }

        return result;
    }
}
