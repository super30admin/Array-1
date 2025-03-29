# Problem 2

# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

# Example:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]

# Output: [1,2,4,7,5,3,6,8,9]

# ## Problem 3
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
    # We visit each of the m×n elements in the matrix exactly once
    # Each element requires constant time operations to process

# SC : O(m×n)
    # We create a result array of size m×n to store all matrix elements
    # Besides this, we only use a few variables (row, col, index, direction flag) requiring O(1) extra space

# Approach:
# Direction Tracking: Use a boolean flag going_up to track the current traversal direction:
    # True: Moving diagonally up-right (row decreases, column increases)
    # False: Moving diagonally down-left (row increases, column decreases)
# Boundary Handling: The key insight is properly handling what happens when we hit boundaries:
    # When we hit the top row while going up, move right and switch direction
    # When we hit the rightmost column while going up, move down and switch direction
    # When we hit the left column while going down, move down and switch direction
    # When we hit the bottom row while going down, move right and switch direction
# Traversal Logic: With each step, add the current element to our result array, then determine the next position based on current direction and boundary conditions.

# Did this code successfully run on Leetcode : YES

def findDiagonalOrder(mat):
        # Handle edge cases
        if not mat or not mat[0]:
            return []
        
        m, n = len(mat), len(mat[0])
        result = [0] * (m * n)
        row, col, index = 0, 0, 0
        going_up = True  # Direction flag: True for up-right, False for down-left
        
        while index < m * n:
            result[index] = mat[row][col]
            index += 1
            
            if going_up:
                # Moving up-right
                if row == 0 and col < n - 1:
                    # Hit top boundary and not at right edge
                    col += 1
                    going_up = False
                elif col == n - 1:
                    # Hit right boundary
                    row += 1
                    going_up = False
                else:
                    # Continue diagonal up-right
                    row -= 1
                    col += 1
            else:
                # Moving down-left
                if col == 0 and row < m - 1:
                    # Hit left boundary and not at bottom edge
                    row += 1
                    going_up = True
                elif row == m - 1:
                    # Hit bottom boundary
                    col += 1
                    going_up = True
                else:
                    # Continue diagonal down-left
                    row += 1
                    col -= 1
        
        return result
        