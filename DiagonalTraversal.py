# Time complexity is O(m*n) rows length * columns
# Space complexity is O(1), because we do no use any memory for computation

class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        # rows
        m = len(mat)
        # columns length
        n = len(mat[0])
        # i is for rows
        i = 0
        # j is for columns
        j = 0
        # Direct = True for up Direction
        direct = True
        result = []
        for idx in range(m*n):
            if direct == True:
                result.append(mat[i][j])
                # In this condition I am checking boundaries for upwards diagonal traverse
                if j == n-1:
                    i += 1
                    direct = False
                elif i == 0:
                    j += 1
                    direct = False
                else:
                    i -= 1
                    j += 1
            else:
                result.append(mat[i][j])
                # In this condition I am checking boundaries for downwards diagonal traverse
                if i == m-1:
                    j += 1
                    direct = True
                elif j == 0:
                    i += 1
                    direct = True
                else:
                    i += 1
                    j -= 1
        return result
