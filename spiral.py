class Solution:
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])
        result = []

        r, c = 0, 0

        for _ in range(m * n):
            while c < n and matrix[r][c] != float('-inf'):
                result.append(matrix[r][c])
                matrix[r][c] = float('-inf')
                c += 1
            c -= 1; r += 1

            while r < m and matrix[r][c] != float('-inf'):
                result.append(matrix[r][c])
                matrix[r][c] = float('-inf')
                r += 1
            r -= 1; c -= 1

            while c >= 0 and matrix[r][c] != float('-inf'):
                result.append(matrix[r][c])
                matrix[r][c] = float('-inf')
                c -= 1
            c += 1; r -= 1

            while r >= 0 and matrix[r][c] != float('-inf'):
                result.append(matrix[r][c])
                matrix[r][c] = float('-inf')
                r -= 1
            r += 1; c += 1

        return result

matrix = [[1,2,3],[4,5,6],[7,8,9]]
s = Solution()
print(s.spiralOrder(matrix))

# TC = O(m*n)
# SC = O(1)