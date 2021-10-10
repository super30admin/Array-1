class Solution:
    def spiralOrder(self, matrix):
        if (len(matrix) == 0 or len(matrix[0]) == 0 or matrix == False):
            return []

        output = []

        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1

        while (top <= bottom and left <= right):
            for i in range(left, right + 1):
                output.append(matrix[top][i])

            top += 1

            for i in range(top, bottom + 1):
                output.append(matrix[i][right])

            right -= 1
            if top <= bottom and left <= right:

                for i in range(right, left - 1, -1):
                    output.append(matrix[bottom][i])

                bottom -= 1

                for i in range(bottom, top - 1, -1):
                    output.append(matrix[i][left])

                left += 1

        return output

# TC:O(m*n)
# TC:O(1)

