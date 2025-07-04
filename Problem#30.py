'''

Problem Number: 54. 
Problem Title: Spiral Matrix

Problem Name: Spiral Matrix

Source Link: https://leetcode.com/problems/spiral-matrix/
'''

# Time Complexity : O(m * n) where m is the number of rows and n is the number of columns in the matrix
# Space Complexity : O(1) for the result list, as we are not using any additional data structures that grow with input size
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, understanding the boundaries and ensuring correct traversal of the matrix in spiral order.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]: # Check if the matrix is empty or has no columns
            return [] # If so, return an empty list
        m = len(matrix) # Number of rows in the matrix
        n = len(matrix[0]) # Number of columns in the matrix
        top = 0 # Initialize the top boundary
        bottom = m - 1 # Initialize the bottom boundary
        left = 0 # Initialize the left boundary
        right = n - 1 # Initialize the right boundary
        result = [] # List to store the spiral order of elements
        while top <= bottom and left <= right: # While there are still rows and columns to traverse
            # Traverse from left to right
            for i in range(left, right + 1): # Traverse from left to right along the top row
                result.append(matrix[top][i]) # Append the element to the result list
            top += 1 # Move the top boundary down
            
            # Traverse from top to bottom
            for i in range(top, bottom + 1): # Traverse from top to bottom along the right column
                result.append(matrix[i][right]) # Append the element to the result list
            right -= 1 # Move the right boundary left
            
            # Traverse from right to left
            if top <= bottom: # Check if there are still rows to traverse
                for i in range(right, left - 1, -1): # Traverse from right to left along the bottom row
                    result.append(matrix[bottom][i]) # Append the element to the result list
                bottom -= 1 # Move the bottom boundary up
            
            # Traverse from bottom to top
            if left <= right: # Check if there are still columns to traverse
                for i in range(bottom, top - 1, -1): # Traverse from bottom to top along the left column
                    result.append(matrix[i][left]) # Append the element to the result list
                left += 1 # Move the left boundary right
        return result # Return the result list containing the elements in spiral order