# Problem: LC 54. Spiral Matrix (Array-1)
# Approach: Finding the edge cases in the matrix with the help of 4 pointers left, right, top and bottom. Everytime a row/col is traversed,
# 	I reduce the lookup of matrix for further manipulation by omitting a row/column.
# Time Complexity: O(m*n) where m & n are number of rows and columns of matrix resp.
# Space complexity: O(1)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        a = []
        # a= [0]*(len(matrix[0])*(len(matrix))) #a is the resutant matrix and len(matrix[0] is number of columns
        print(a)
        if matrix == [] or len(matrix) == 0:
            return a
        left, top, bottom, right = 0, 0, len(matrix) - 1, len(matrix[0]) - 1
        while (left <= right and top <= bottom):
            # move left to right
            for i in range(left, right + 1, 1):  # left to right
                a.append(matrix[top][i])
            top += 1
            # if (left <= right and top <= bottom): no need of this here as the only case is top changes but the for loop wont work that way soo-....
            for i in range(top, bottom + 1, 1):  # top to bottom
                a.append(matrix[i][right])
            right -= 1
            if (left <= right and top <= bottom):
                for i in range(right, left - 1, -1):  # right to left
                    a.append(matrix[bottom][i])
                bottom -= 1
            if (left <= right and top <= bottom):  # bottom to top
                for i in range(bottom, top - 1, -1):
                    a.append(matrix[i][left])
                left += 1
        return a









