class FindDiagonalOrder(object):
    '''
    Solution:
    1. There are 2 directions, one upward and one downward. row value decrements by 1 and column value increments by 1
        if upward and vice versa if downward.
    2. Change the direction if column is max or row is 0 while upward and vice versa if downward.
    3. Add elements whenever there is a change in row and(or) column and return the result.

    --- Passed all testcases on leetcode successfully
    '''
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        # O(rows * columns) Time Complexity | O(1) Space Complexity
        if (matrix == None or len(matrix) == 0):
            return []

        maxRows = len(matrix)
        maxCols = len(matrix[0])
        result = [0 for i in range(maxRows * maxCols)]

        direction = 1
        count = 0
        row = 0
        col = 0

        while (count <= (maxRows * maxCols) - 1):
            result[count] = matrix[row][col]

            if (direction == 1):
                if (col == maxCols - 1):
                    row += 1
                    direction = 0
                elif (row == 0):
                    col += 1
                    direction = 0
                else:
                    row -= 1
                    col += 1

            else:
                if (row == maxRows - 1):
                    col += 1
                    direction = 1
                elif (col == 0):
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1

            count += 1

        return result
