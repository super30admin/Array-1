# Time Complexity : O(n*m), where n is the number of rows and m is the number of columns
# Space Complexity : O(1), because there is no extra computational DS
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # keep a track of four pointers representing each boundary, after traversing and adding
    # to array one of 4 side which constitute a spiral traversal, shrink the boundary.
    # repeat the same until the boundaries haven't crossed each other.
    def spiralOrder(self, matrix):
        retVal = []
        if not matrix:
            return retVal
        n, m = len(matrix), len(matrix[0])
        left, right = 0, m-1
        top, bottom = 0, n-1

        while top <= bottom and left <= right:
            if top <= bottom:
                for i in range(left, right+1):
                    retVal.append(matrix[top][i])
                top += 1

            if left <= right:
                for i in range(top, bottom+1):
                    retVal.append(matrix[i][right])
                right -= 1

            if top <= bottom:
                for i in range(right, left-1, -1):
                    retVal.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top-1, -1):
                    retVal.append(matrix[i][left])
                left += 1

        return retVal

print(Solution().spiralOrder([[ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ]]))


