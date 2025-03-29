# Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

# Example 1:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]
# Output: [1,2,3,6,9,8,7,4,5]
# Example 2:

# Input:

# [

# [1, 2, 3, 4],

# [5, 6, 7, 8],

# [9,10,11,12]

# ]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]


# TC : O(m×n)
    # where m is the number of rows and n is the number of columns. 
    # We visit each element in the matrix exactly once.

# SC : O(1) excluding the result array.
    # We only use a constant amount of extra space for the boundary variables.

# Approach:
# This solution uses a "layer-by-layer" approach where we traverse the matrix 
# in a spiral pattern by defining and shrinking the boundaries of each layer. 
# We process the outer layer first (top row, rightmost column, bottom row, leftmost column), then move inward by shrinking the boundaries.

# Did this code successfully run on Leetcode : YES

def spiralMatrix(matrix):
    # Handle empty matrix case
    if not matrix:
        return []
    
    result = []  # Store the elements in spiral order
    
    # Define boundaries for the current layer
    top, bottom = 0, len(matrix) - 1      # Top and bottom row indices
    left, right = 0, len(matrix[0]) - 1   # Left and right column indices
    
    # Continue until all layers are processed
    while top <= bottom and left <= right:
        # 1. Traverse right along top row
        for i in range(left, right + 1):
            result.append(matrix[top][i])
        top += 1  # Shrink the top boundary downward
        
        # 2. Traverse down along rightmost column
        for i in range(top, bottom + 1):
            result.append(matrix[i][right])
        right -= 1  # Shrink the right boundary leftward
        
        # 3. Traverse left along bottom row (if there are rows left)
        if top <= bottom:  # This check prevents duplicate processing
            for i in range(right, left - 1, -1):
                result.append(matrix[bottom][i])
            bottom -= 1  # Shrink the bottom boundary upward
        
        # 4. Traverse up along leftmost column (if there are columns left)
        if left <= right:  # This check prevents duplicate processing
            for i in range(bottom, top - 1, -1):
                result.append(matrix[i][left])
            left += 1  # Shrink the left boundary rightward
    
    return result  # Return the final spiral order array