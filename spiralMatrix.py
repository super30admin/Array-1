class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        # Time Complexity: O(m*n) m = number of rows; n = number of columns
        # Space Complexity: O(1)
        newArr = []
        if len(matrix) == 0:
            return newArr
        left, right = 0, len(matrix[0]) - 1
        top, bottom = 0, len(matrix) - 1
        # while (row_begin <= row_end and col_begin <= col_end):
        while (left <= right and top <= bottom):
            for i in range(left, right + 1):
                newArr.append(matrix[top][i])
            top += 1
            end = bottom + 1
            for j in range(top, bottom + 1):
                newArr.append(matrix[j][right])
            right -= 1
            if (top <= bottom):
                for k in range(right, left - 1, -1):
                    newArr.append(matrix[bottom][k])
                bottom -= 1
            if (left <= right):
                for l in range(bottom, top - 1, -1):
                    newArr.append(matrix[l][left])
                left += 1
        return newArr




