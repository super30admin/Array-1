# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        flag = True
        result = [None] * (m*n)
        for i in range(m*n):
            result[i] = mat[r][c]
            if flag:
                if c == n-1:
                    r += 1
                    flag = False
                elif r == 0:
                    c += 1
                    flag = False
                else:
                    r -= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    flag = True
                elif c == 0:
                    r += 1
                    flag = True
                else:
                    r += 1
                    c -= 1
        return result