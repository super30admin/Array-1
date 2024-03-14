# TC = O(mn)
# SC =O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])  # m:row n:col
        i, j = 0, 0
        result = [0] * m * n
        direct = True
        for k in range(len(result)):
            result[k] = mat[i][j]
            if direct:
                if j == n - 1:
                    i += 1
                    direct = False
                elif i == 0:
                    j += 1
                    direct = False
                else:
                    j += 1
                    i -= 1
            else:
                if i == m - 1:
                    j += 1
                    direct = True
                elif j == 0:
                    i += 1
                    direct = True
                else:
                    j -= 1
                    i += 1
        return result
