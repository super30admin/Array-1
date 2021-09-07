class Solution:
    def spiralOrder(self, matrix):
        result = []
        m, n = len(matrix), len(matrix[0])
        left, top = 0, 0
        right = n - 1
        bottom = m - 1
        while len(result) < m * n:
            # top
            for col in range(left, right + 1):
                result.append(matrix[top][col])

            # right
            for row in range(top + 1, bottom + 1):
                result.append(matrix[row][right])
            # bottom
            if top < bottom:
                # from right to left
                for col in range(right - 1, left - 1, -1):
                    result.append(matrix[bottom][col])
            # left
            if left < right:  # for avoiding duplicates
                # from down to up
                for row in range(bottom - 1, top, -1):
                    result.append(matrix[row][left])

            # update the reference points
            left += 1
            right -= 1
            bottom -= 1
            top += 1
        return result


L = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Obj = Solution()
print(Obj.spiralOrder(L))
