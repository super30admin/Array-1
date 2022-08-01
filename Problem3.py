# Time complexity : O(n*m) --> n*m is the size of the matrix
# Space complexity : O(1) --> as there is no auxilary data
# Leetcode : Solved and submitted

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        
        # defining the boundaries of the matrix for our traversal
        top = left = 0
        right = n - 1
        bottom = m - 1
        
        res = []*(n*m)
        
        # checking the boundary condition for all iterations
        while top <= bottom and left <= right:
            # top row - getting all the elements of the matrix from the top row, then increment the top variable
            #if top <= bottom and left <= right:
            for i in range(left,right+1):
                    res.append(matrix[top][i])
            top += 1
            # right column - get all the element from the rightmost column, then decrement it's value, or boundary value
            #if top <= bottom and left <= right:
            for j in range(top, bottom+1):
                    res.append(matrix[j][right])
            right -= 1
            # bottom row - get all the values from the bottom row and decrement it's boundary value
            if top <= bottom:
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
            bottom -= 1
            # left column - get all the values from the leftmost column and increment it's value such that we are moving on in the matrix
            if left <= right:
                for j in range(bottom, top-1, -1):
                    res.append(matrix[j][left])
            left += 1
        return res
