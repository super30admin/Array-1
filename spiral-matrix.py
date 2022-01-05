# Time Complexity: O(m*n)
# Space Complexity: O(1)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
# Class Logic
        m, n  =len(matrix), len(matrix[0])
        top, bottom, left, right = 0, m-1, 0, n-1
        result = []
        while left <= right and top <= bottom:
            for j in range(left, right+1):
                result.append(matrix[top][j])
            top += 1
            if left <= right and top <= bottom:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
            if left <= right and top <= bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
            if left <= right and top <= bottom:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result

# My Logic
#         rows = len(matrix)
#         cols = len(matrix[0])
#         output = []
#         row_min, row_max = 0, rows-1
#         col_min, col_max = 0, cols-1
#         while row_min < row_max and col_min < col_max:
#             for i in range(col_min, col_max):
#                 output.append(matrix[row_min][i])
#             for i in range(row_min, row_max):
#                 output.append(matrix[i][col_max])
#             for i in range(col_max, col_min, -1):
#                 output.append(matrix[row_max][i])
#             for i in range(row_max, row_min, -1):
#                 output.append(matrix[i][col_min])
#             row_min, row_max = row_min + 1, row_max - 1
#             col_min, col_max = col_min + 1, col_max - 1
        
#         if row_min == row_max:
#             return output + [matrix[row_min][j] for j in range(col_min, col_max + 1)]
#         if col_min == col_max:
#             return output + [matrix[i][col_min] for i in range(row_min, row_max + 1)]
#         return(output)