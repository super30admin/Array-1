# TC: O(n)
# SC: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        i = 0
        j = 0
        dir = 1
        result = []
        idx = 0
        while len(result) < m*n:
            result.append(mat[i][j])
            if dir == 1:
                if j == (n-1):
                    dir = -1
                    i += 1
                elif i == 0:
                    dir = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == (m-1):
                    dir = 1
                    j += 1
                elif j == 0:
                    dir = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
        return result

