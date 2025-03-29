# Time Complexity: O(m*n), where m = number of rows and n = number of columns
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Approach:
# 1. We maintain 4 pointers, left, right, top, and bottom to keep track of the rows and columns already traversed
# 2. After a left to right traversal, we increment top pointer, indicating the row above the top pointer is already traversed
# 3. After a top to bottom traversal, we decrement the right pointer, indicating the column on the right of right pointer is already traversed
# 3. After a right to left traversal, we decrement the bottom pointer
# 4. After a bottom to top traversal, we increment the left pointer
from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # get rows and columns of the matrix
        m = len(matrix)
        n = len(matrix[0])
        # Initialize the result array to store spiral traversal
        res = []

        # Initialize left, right, top and bottom pointers
        left, right = 0, n-1
        top, bottom = 0, m-1

        # We traverse the matrix until the pointers don't cross each other
        while left <= right and top <= bottom:
            # left -> right
            for i in range(left, right+1):
                res.append(matrix[top][i])
            # Increment top
            top += 1

            # Checking if the pointers have not crossed each other since we are manipulating the top pointer above
            if top <= bottom:
                # top -> bottm
                for i in range(top, bottom+1):
                    res.append(matrix[i][right])
                # Decrement right
                right -= 1
            
            # Checking if the pointers have not crossed each other since we are manipulating the top and right pointers above
            if top <= bottom and left <= right:
                # right -> left
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                # Decrement bottom
                bottom -= 1
            
            # # Checking if the pointers have not crossed each other since we are manipulating the top, right and bottom pointers above
            if top <= bottom and left <= right:
                # bottom -> top
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                # Increment left
                left += 1
        return res