# Time Complexity: O(n^2)
# Space Complexity: O(n^2)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        rows = len(matrix)
        cols = len(matrix[0])
        output = []
        row_min, row_max = 0, rows-1
        col_min, col_max = 0, cols-1
        while row_min < row_max and col_min < col_max:
            for i in range(col_min, col_max):
                output.append(matrix[row_min][i])
            for i in range(row_min, row_max):
                output.append(matrix[i][col_max])
            for i in range(col_max, col_min, -1):
                output.append(matrix[row_max][i])
            for i in range(row_max, row_min, -1):
                output.append(matrix[i][col_min])
            row_min, row_max = row_min + 1, row_max - 1
            col_min, col_max = col_min + 1, col_max - 1
        
        if row_min == row_max:
            return output + [matrix[row_min][j] for j in range(col_min, col_max + 1)]
        if col_min == col_max:
            return output + [matrix[i][col_min] for i in range(row_min, row_max + 1)]
        return(output)