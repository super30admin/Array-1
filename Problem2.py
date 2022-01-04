# Time Complexity : O(n*m) where n and m are the size of the matrix.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        i = 0
        m = len(mat)
        n = len(mat[0])
        l = m *n - 1
        dir = 1
        res = []
        r = 0
        c = 0
        while(i<=l):
            res.append(mat[r][c])
            i += 1
            if dir == 1:
                if c == n-1:
                    dir = -1
                    r += 1
                elif r == 0:
                    c += 1
                    dir = -1
                else:
                    r-=1
                    c+=1
            else:
                if r == m-1:
                    dir = 1
                    c += 1
                elif c == 0:
                    r += 1
                    dir = 1
                else:
                    r+=1
                    c-=1
        return res
