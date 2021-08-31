# Did this code successfully run on Leetcode : YES

# TC: O(m*n)
# SC: O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = []
        dir = 1
        c = 0
        i, j = 0, 0
        while c < m*n:
            # print((mat[i][j]))
            result.append(mat[i][j])
            c += 1
            if dir == 1:
                if j == n-1:
                    dir = -1
                    i += 1
                elif i == 0:
                    dir = -1
                    j += 1
                else:
                    j += 1
                    i -= 1
            else:
                if i == m-1:
                    dir = 1
                    j += 1
                elif j == 0:
                    dir = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
        return result