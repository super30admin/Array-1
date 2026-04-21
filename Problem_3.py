# https://leetcode.com/problems/spiral-matrix/description/

class Solution:
    def spiralOrder(self, matrix):
        rows, cols = len(matrix), len(matrix[0])
        top = 0
        right = cols - 1
        bottom = rows - 1
        left = 0
        result = []
        while top <= bottom and left <= right:

            for i in range(left, right + 1, 1):
                result.append(matrix[top][i])
            top += 1

            for i in range(top, bottom + 1, 1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result

matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]

sl = Solution()
print(sl.spiralOrder(matrix))