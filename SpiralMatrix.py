# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english :
# The matrix is traversed element by element going from top row to last column.
# Then from last row upto first row and from first column to last column to get all the elements in matrix

# Your code here along with comments explaining your approach


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0:
            return 0
        res = []
        rowBegin = 0
        rowEnd = len(matrix) - 1
        colBegin = 0
        colEnd = len(matrix[0]) - 1

        while rowBegin <= rowEnd and colBegin <= colEnd:
            for i in range(colBegin, colEnd + 1):
                res.append(matrix[rowBegin][i])
            rowBegin += 1

            for i in range(rowBegin, rowEnd + 1):
                res.append(matrix[i][colEnd])
            colEnd -= 1

            if rowEnd >= rowBegin:
                for i in range(colEnd, colBegin - 1, -1):
                    res.append(matrix[rowEnd][i])
            rowEnd -= 1

            if colEnd >= colBegin:
                for i in range(rowEnd, rowBegin - 1, -1):
                    res.append(matrix[i][colBegin])
            colBegin += 1
        return res