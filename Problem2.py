# Time Complexity: O(n * m)
# Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        res = []
        n,m = len(mat), len(mat[0])
        i = 0
        j = 0
        while i < n and j < m:
            res.append(mat[i][j])
            if (i + j) % 2 == 0:
                if j == m - 1:
                    i += 1
                elif i == 0:
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == n - 1:
                    j += 1
                elif j == 0:
                    i+= 1
                else:
                    i += 1
                    j -= 1
        return res




