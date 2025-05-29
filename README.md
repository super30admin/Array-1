# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # create 2 running sum lists starting from both ends and store the results in these. we get the product at index x by getting product of left & right at x
        # we can optimize for psace by just using one left product array, and updating that with right product array code
        n = len(nums)
        answer = [1] * n

        # Step 1: left product pass
        left = 1
        for i in range(n):
            answer[i] = left
            left *= nums[i]

        # Step 2: right product pass (update in place)
        right = 1
        for i in range(n - 1, -1, -1):
            answer[i] *= right
            right *= nums[i]

        return answer

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


# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []

        m, n = len(mat), len(mat[0])
        result = []
        i, j = 0, 0
        direction = True  # True = up-right, False = down-left

        for _ in range(m * n):
            result.append(mat[i][j])
            
            if direction == True:  # moving up-right
                if j == n - 1:
                    i += 1
                    direction = False
                elif i == 0:
                    j += 1
                    direction = False
                else:
                    i -= 1
                    j += 1
            else:  # moving down-left
                if i == m - 1:
                    j += 1
                    direction = True
                elif j == 0:
                    i += 1
                    direction = True
                else:
                    i += 1
                    j -= 1

        return result

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


# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # When do we change direction? 
        # 1. when we reach a position we've already been to
        # 2. we are at an edge
        # go right (check right_edge), go down (check bottom_edge), go left (check left_edge), go up (check top_edge)

        if not matrix or not matrix[0]:
            return []
        
        result = []
        top, bottom = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1

        while top <= bottom and left <= right:
            # traverse from Left to Right
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1

            # traverse from Top to Bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # traverse from Right to Left (if still within bounds)
            if top <= bottom:
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1

            # traverse from Bottom to Top (if still within bounds)
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
            
