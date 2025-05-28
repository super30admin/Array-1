# Problem #29 Diagonal Traverse
#LeetCode 498 https://leetcode.com/problems/diagonal-traverse/description/
# Author : Akaash Trivedi
# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #498
# Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        res = [None] * m*n
        dirc = True
        i = 0
        r = c = 0
        #if drcn:
        while i < (m*n):
            res[i] = mat[r][c]
            if dirc: # upwards
                # breach top
                if r == 0 and c != n-1:
                    c += 1
                    dirc = False
                # breach right
                elif c == n-1:
                    r +=1
                    dirc = False
                # no breach
                else:
                    r -=1
                    c +=1
            else: #downwards
                # bottom
                if r == m-1:
                    c += 1
                    dirc = True
                # breach left
                elif c == 0:
                    r +=1
                    dirc = True
                # no breach
                else:
                    c -=1
                    r +=1
            i +=1
        return res
