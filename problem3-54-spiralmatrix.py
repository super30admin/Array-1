#time complexity - o(m*n)
#space complexity - 0(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        result = [0 for i in range(n * m)]
        index = 0
        while left <= right and top <= bottom:

            if left <= right and top <= bottom:
                for i in range(left, right + 1):
                    result[index] = matrix[top][i]
                    index += 1
                top += 1

            if left <= right and top <= bottom:
                for i in range(top, bottom + 1):
                    result[index] = matrix[i][right]
                    index += 1
                right -= 1

            if left <= right and top <= bottom:
                for i in range(right, left - 1, -1):
                    result[index] = matrix[bottom][i]
                    index += 1
                bottom -= 1

            if left <= right and top <= bottom:
                for i in range(bottom, top - 1, -1):
                    result[index] = matrix[i][left]
                    index += 1
                left += 1
        return result

