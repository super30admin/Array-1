// Did this code successfully run on Leetcode : Yes

// Problems faced - Can you please explain about the space complexity if I am wrong and if it is 0(1) please can you explain my how?

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space 

// Time Complexity - 0(n) Because the solution performs two passes through the array
// Space Complexity - 0(1) Because we are expected to return an array

class Solution {
    public int[] productExceptSelf (int[] nums) {
        if (nums == null || nums.length == 0){
            return new int[] {};
        }
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result [i] = rp;
        }
        rp = 1;

        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = rp * result[i];
        }
        return result;
    }
}

// 2nd way

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        int[] right = new int[n];
        right[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
}


## Problem 2

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

// Time Complexity - 0(m * n) because we visit each element in the matrix exactly once in a linearly, traversing along diagonals
// Space Complexity -  From my point of view its should be O(m * n) because we create an output array of size mn to store the elements in the diagonal order.
//                     Since we need to return the entire diagonal order in the output array, we need to allocate space for all mn elements. 


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[]{};
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;
        int index = 0;
        int dir = 1;                       // 1 for upward direction and -1 for downward direction

        while (index < m * n) {
            result[index] = mat[r][c];
            index++;

            if (dir == 1) {
                if (c == n - 1) {
                    dir = -1;
                    r++;
                }
                else if (r == 0) {
                    dir = -1;
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if (r == m - 1) {
                    dir = 1;
                    c++;
                }
                else if (c == 0) {
                    dir = 1;
                    r++;
                }
                else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}


## Problem 3
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


// Time Complexity - 0(m * n) because it visits each element of the matrix exactly once.
// Space Complexity - According to my understanding it is 0(m * n) because it uses a list to store the elements of the matrix. 
//                    The size of the list is at most mn as each element of the matrix is added to the list exactly once. 


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {      
            for (int i = left; i <= right; i++) {          // top row
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {          // right column
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {                           // bottom row
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {                             // left column
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}



