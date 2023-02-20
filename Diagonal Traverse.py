# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        l = []
        m = len(mat)
        n = len(mat[0])
        length = m * n
        di = 1
        r = 0
        c = 0
        idx = 0
        # l.append(mat[r][c])
        # print(l)
        while idx < (length):

            l.append(mat[r][c])
            idx += 1
            #             up direction
            if di == 1:
                if c == (n - 1):
                    r += 1
                    di = -1
                elif r == 0:
                    c += 1
                    di = -1
                else:
                    r -= 1
                    c += 1
            #             down direction
            else:
                if r == (m - 1):
                    c += 1
                    di = 1
                elif c == 0:
                    r += 1
                    di = 1
                else:
                    r += 1
                    c -= 1
        return l
