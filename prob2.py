class Solution(object):
    def findDiagonalOrder(self,matrix):
        if len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        direction = 1
        row = 0
        col = 0
        result = []
        while(len(result) < m*n):
            if direction == 1:
                if col == n-1:
                    result.append(matrix[row][col])
                    row = row + 1
                    direction = -1
                elif row == 0:
                    result.append(matrix[row][col])
                    col = col + 1
                    direction = -1
                else:
                    result.append(matrix[row][col])
                    row = row - 1
                    col = col + 1
            elif direction == -1:
                if row == m-1:
                    result.append(matrix[row][col])
                    col = col + 1
                    direction = 1
                elif col == 0:
                    result.append(matrix[row][col])
                    row = row + 1
                    direction = 1
                else:
                    result.append(matrix[row][col])
                    row = row + 1
                    col = col - 1
        print(result)
        return result
                       
    """
    :type matrix: List[List[int]]
    :rtype: List[int]
    """

        