class Solution:
    def findDiagonalOrder(self, mat):
        m, n = len(mat), len(mat[0])
        result = [0] * (m * n)
        r = c = 0
        dir = True

        for i in range(m * n):
            result[i] = mat[r][c]

            if dir:
                if c == n - 1:
                    r += 1
                    dir = False
                elif r == 0:
                    c += 1
                    dir = False
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    c += 1
                    dir = True
                elif c == 0:
                    r += 1
                    dir = True
                else:
                    r += 1
                    c -= 1

        return result

mat = [[1,2],[3,4]]
s = Solution()
print(s.findDiagonalOrder(mat))

# TC - O(m*n)
# SC - O(1)