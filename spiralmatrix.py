#time complexity: 0(n)



class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []
        direction = 1
        result = []
        nrows = len(matrix) - 1
        ncols = len(matrix[0]) - 1
        row = 0
        cols = 0
        while (len(result) < (nrows + 1) * (ncols + 1)):
            result.append(matrix[row][cols])
            if direction == 1:
                if cols == ncols:
                    row = row + 1
                    direction = 0
                elif row == 0:
                    cols = cols + 1
                    direction = 0
                else:
                    row = row - 1       #
                    cols = cols + 1

            else:
                if row == nrows:
                    cols = cols + 1
                    direction = 1

                elif cols == 0:
                    row = row + 1
                    direction = 1

                else:
                    row = row + 1
                    cols = cols - 1
                    # row=row+1
        return result