#Time Complexity : O(m*n) where m is number of rows and n is number of columns
#Space Complexity : O(1)
#Did this code successfully run on Leetcode :Yes
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
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
