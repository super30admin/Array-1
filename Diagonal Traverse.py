# Time Complexity : O(mn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        updir = True
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        res = []
        
        while(len(res) < m*n):
            res.append(mat[r][c])
            if updir == True:
                if r == 0 and c != n-1:
                    updir = False
                    c += 1
                elif c == n-1:
                    updir = False
                    r += 1
                else:
                    r -= 1
                    c += 1

            else:
                if c == 0 and r != m-1:
                    updir = True
                    r += 1
                elif r == m-1:
                    updir = True
                    c += 1
                else:
                    r += 1
                    c -= 1
        
        return res



        