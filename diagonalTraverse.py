# Time Complexity : O(n*m), where n is the number of rows and m is the number of columns
# Space Complexity : O(1), because there is no extra computational DS.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # keep a track of three pointers representing row, column and direction. for every
    # direction compute three cases which can occur and manipulate the pointers accordingly.
    # repeat the same until the pointers haven't reached the length and width of the matrix
    def findDiagonalOrder(self, matrix):
        if not matrix:
            return []
        retVal = []
        direction, r, c = 1, 0, 0
        n, m = len(matrix), len(matrix[0])

        while r < n and c < m:
            retVal.append(matrix[r][c])
            if direction == 1:
                if c == m - 1:
                    direction = -1
                    r += 1
                elif r == 0:
                    direction = -1
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if r == n - 1:
                    direction = 1
                    c += 1
                elif c == 0:
                    direction = 1
                    r += 1
                else:
                    c -= 1
                    r += 1
        return retVal

print(Solution().findDiagonalOrder([[ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ]]))
