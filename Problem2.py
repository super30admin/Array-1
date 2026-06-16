## Problem 2
# https://leetcode.com/problems/diagonal-traverse/
# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

# Example:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]

# Output: [1,2,4,7,5,3,6,8,9]

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        """
        Logic:
        We simulate the diagonal traversal by keeping track of our current row (r),
        column (c), and the direction we are moving (isGoingUp). 
        
        For each step, we first add the current element to our result array.
        Then, we determine the next coordinates based on our current direction:
        
        1. Moving UP-RIGHT (isGoingUp = True):
           - If we hit the right boundary (c == numCols - 1), we move down to the next row (r += 1) and change direction.
           - If we hit the top boundary (r == 0), we move right to the next column (c += 1) and change direction.
           - Otherwise, we just keep going up-right (r -= 1, c += 1).
           
        2. Moving DOWN-LEFT (isGoingUp = False):
           - If we hit the bottom boundary (r == numRows - 1), we move right (c += 1) and change direction.
           - If we hit the left boundary (c == 0), we move down (r += 1) and change direction.
           - Otherwise, we just keep going down-left (r += 1, c -= 1).

        Time Complexity: O(M * N)
        Where M is the number of rows and N is the number of columns in the matrix. 
        We visit every single element in the matrix exactly once to build the result array.

        Space Complexity: O(1) auxiliary space
        We are only using a few variable pointers (`r`, `c`, `isGoingUp`, `numRows`, `numCols`). 
        The space required for the output array `result` is typically not counted towards 
        the auxiliary space complexity in these types of problems.
        """
        if not mat or not mat[0]:
            return []
        
        numRows, numCols = len(mat), len(mat[0])
        result = [0] * (numRows * numCols)
        
        r, c = 0, 0
        isGoingUp = True
        
        for i in range(numRows * numCols):
            result[i] = mat[r][c]
            
            # Determine the next cell based on the current direction
            if isGoingUp:
                if c == numCols - 1:     # Hit right edge: move down, go left
                    isGoingUp = False
                    r += 1
                elif r == 0:             # Hit top edge: move right, go left
                    isGoingUp = False
                    c += 1
                else:                    # Normal up-right move
                    r -= 1
                    c += 1
            else:
                if r == numRows - 1:     # Hit bottom edge: move right, go up
                    isGoingUp = True
                    c += 1
                elif c == 0:             # Hit left edge: move down, go up
                    isGoingUp = True
                    r += 1
                else:                    # Normal down-left move
                    r += 1
                    c -= 1
                    
        return result
