'''
In this problem, to print the matrix elements in spiral order, I considered 4 pointers(top, left, right, bottom). Each representing 4 sides of the matrix.
We start with printing top most row and then move to right most col, then the bottom row and left col. For every iteration top and left pointers are incremented and
right and bottom pointers are decremented, since we need to move towards inside in spiral order.
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        
        # taking 4 pointers
        top, left = 0, 0
        bottom, right = m-1, n-1

        result = []
        while(top <= bottom and left <= right):
            # top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            # right col
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            # bottom row
            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            # left col
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result

'''
Time Complexity: O(m*n)
Since we are iterating on a matrix of size m*n
Space Complexity: O(1)
We did not take any extra apart from variables.
'''