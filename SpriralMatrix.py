# TC = O(mn)
# SC =O(1)


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        left = 0
        right = len(matrix[0]) - 1
        top = len(matrix) - 1
        bottom = 0
        while (bottom <= top) and (left <= right):

            for i in range(left, right + 1):
                if matrix[bottom][i] != "":
                    result.append(matrix[bottom][i])
                    matrix[bottom][i] = ""

            for i in range(bottom + 1, top):
                if matrix[i][right] != "":
                    result.append(matrix[i][right])
                    matrix[i][right] = ""
            for i in range(right, left - 1, -1):
                if matrix[top][i] != "":
                    result.append(matrix[top][i])
                    matrix[top][i] = ""
            for i in range(top - 1, bottom, -1):
                if matrix[i][left] != "":
                    result.append(matrix[i][left])
                    matrix[i][left] = ""
            top -= 1
            bottom += 1
            left += 1
            right -= 1

        return result
