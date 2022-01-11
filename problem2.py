"""
// Time Complexity : O(M*N)  M : row N:L cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


// Your code here along with comments explaining your approach
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m * n)
        k = 0
        dir = 1
        i = 0
        j = 0
        while k < m * n:
            result[k] = mat[i][j]
            k += 1
            if dir == 1:
                if j == n - 1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir = -1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    j += 1
                    dir = 1
                elif j == 0:
                    i += 1
                    dir = 1
                else:
                    j -= 1
                    i += 1
        return result
