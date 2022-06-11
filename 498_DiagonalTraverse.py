"""
Leetcode - https://leetcode.com/problems/diagonal-traverse/ (submitted)
TC- O(M*N) # all the elements, SC- O(1)
Lecture- https://youtu.be/o_U50Uzz9Ek
FAQ-

Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:
Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 10^4
1 <= m * n <= 10^4
-10^5 <= mat[i][j] <= 10^5
"""

'''
Ideation - 
General case, if we are going up, row decreases and col increases, similarly going down, row ++, col --
Now, consider corner cases-
Going up, if we are at first row, we are out of bound, so we flip our side and go col ++, else if we are at last col,
we will go row++ and fli[, with and exception of if i == 0 and last row, in that case we go row++
Similarly going dow, if we are at first col, we go row++ and flip direction, else if we are last row, we go col++
and flip.
Terminate algorithm if out of bound or count=m*n
'''
class Solution:
    def findDiagonalOrder(self, mat):
        m = len(mat)
        n = len(mat[0])
        result = []
        i, j = 0, 0
        dir = 1
        while 0 <= i < m and 0 <= j < n: # or count <= m*n
            result.append(mat[i][j])
            if dir == 1:
                if i == 0 and j != n - 1:
                    j += 1
                    dir = -1
                elif j == n - 1:
                    i += 1
                    dir = -1
                # no corner cases
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != m - 1:
                    i += 1
                    dir = 1
                elif i == m - 1:
                    j += 1
                    dir = 1
                # no corner cases
                else:
                    i += 1
                    j -= 1

        return result


mat = [[1, 2, 3, 4],
       [5, 6, 7, 8],
       [9, 10, 11, 12]]
diagonalTraversal = Solution().findDiagonalOrder(mat)
print(diagonalTraversal)
