# Time Complexity : O(n × m)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Traverse the matrix diagonally by alternating directions.
# When a boundary is hit, change direction and move to the next valid start cell.
# Continue this process until all elements are visited.


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = True
        n = len(mat)
        m = len(mat[0])
        res = [0] * (m * n)
        r,c = 0,0

        for i in range(m * n):
            res[i] = mat[r][c]
            if dir:
                if c == m - 1:
                    dir = False
                    r += 1
                elif r == 0:
                    dir = False
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if r == n - 1:
                    dir = True
                    c += 1
                elif c == 0:
                    dir = True
                    r += 1
                else:
                    r += 1
                    c -= 1
            
        return res

