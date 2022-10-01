# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        idx = 0
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        res = []
        dir = 1

        while(idx < m*n):
            res.append(mat[r][c])
            idx+=1
            if (dir == 1):
                if c == n-1:
                    r+=1
                    dir = -1
                elif r == 0:
                    c+=1
                    dir = -1
                else:
                    r-=1
                    c+=1
            elif (dir == -1):
                if r == m-1:
                    c+=1
                    dir = 1
                elif c == 0:
                    r+=1
                    dir = 1
                else:
                    r+=1
                    c-=1
        return res        