T.C: O(m*n) where m is no. of rows and n is no. of columns
S.C: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [0]*((m*n))
        d = 1
        idx = 0
        i = 0
        j = 0
        while idx <= ((m*n)-1):
            result[idx] = mat[i][j]
            idx += 1
            if d == 1:
                if j == n-1:
                    i += 1
                    d = -1
                elif i == 0:
                    j += 1
                    d = -1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m-1:
                    j += 1
                    d = 1
                elif j == 0:
                    i += 1
                    d = 1
                else:
                    i += 1
                    j -= 1
        return result

        
